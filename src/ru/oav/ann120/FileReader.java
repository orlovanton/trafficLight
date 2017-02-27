package ru.oav.ann120;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Вспомогательный класс для сериализации/десериализации объектов
 * Created by antonorlov on 27/02/2017.
 */
public class FileReader {

    /*
    Тут указать путь до файла на локальной машине
     */
    public static final String FILE_NAME = "/Users/antonorlov/Documents/ann/java/trafficLight/color.txt";

    /**
     * Зачитать из файла
     * @return
     * @throws Exception
     */
    public static TrafficLight getTrafficLight() throws Exception {
        try {
            List<String> strings = Files.readAllLines(Paths.get(FILE_NAME));
            TrafficLight trafficLight = new TrafficLight();
            if (strings != null && strings.size() > 0) {
                String color = strings.get(0);
                trafficLight.setColor(color);
            } else {
                throw new Exception("Файл пустой");
            }
            return trafficLight;
        } catch (IOException e) {
            throw new Exception("Не удалось прочитать файл", e);
        }
    }

    /**
     * Записать в файл
     * @param trafficLight
     * @throws Exception
     */
    public static void saveTrafficLight(TrafficLight trafficLight) throws Exception {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_NAME))) {
            writer.write("color:" + trafficLight.getColor());
        } catch (IOException ex) {
            throw new Exception("Не удалось записать файл", ex);
        }
    }
}
