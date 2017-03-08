import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by antonorlov on 04/03/2017.
 */
public class Main {

    public static final String FILE_NAME = "/Users/antonorlov/Documents/ann/java/trafficLight/src/shaverma-save.bat";

    public static void main(String[] args) {
        Shaverma shaverma = new Shaverma();
        shaverma.setPrice(200);
        shaverma.setCatNum(3);
        shaverma.setTaste("Вкусного");
//
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_NAME))) {
            writer.write(shaverma.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            List<String> strings = Files.readAllLines(Paths.get(FILE_NAME));
            Shaverma restoredShaverma = new Shaverma();
            restoredShaverma.setTaste(strings.get(0));
            String catNum = strings.get(1);
            restoredShaverma.setCatNum(Integer.valueOf(catNum));
            restoredShaverma.setPrice(Double.valueOf(strings.get(2)));

            System.out.println(shaverma.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
