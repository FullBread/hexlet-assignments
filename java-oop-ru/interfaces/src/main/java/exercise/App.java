package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int n) {
        homes.sort(Comparator.comparingDouble(Home::getArea));
        List<Home> sortedHomes = homes.subList(0, Math.min(n, homes.size()));
        List<String> result = new ArrayList<>();
        for (Home home : sortedHomes) {
            result.add(home.toString());
        }
        return result;

    }
}
