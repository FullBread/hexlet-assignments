package exercise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static boolean scrabble (String letters, String word) {
        String[] lettersArray = letters.toLowerCase().split("");
        String[] wordArray = word.toLowerCase().split("");;
        List<String> lettersList = new ArrayList<>(Arrays.asList(lettersArray));
        List<String> wordList = new ArrayList<>(Arrays.asList(wordArray));
        for (String s : wordList) {
            if (lettersList.contains(s)) {
                lettersList.remove(s);
            } else {
                return false;
            }
        }
        return true;
    }
}
