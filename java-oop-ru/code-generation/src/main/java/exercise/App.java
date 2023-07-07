package exercise;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;


public class App {

    public static void save(Path path, Car car) throws IOException {
        String json = car.serialize();
        try {
            Files.writeString(path, json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Car extract(Path path) {
        try {
            String json = Files.readString(path);
            return Car.unserialize(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
