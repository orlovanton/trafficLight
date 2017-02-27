package ru.oav.ann120;

import java.util.Scanner;

/**
 * Created by antonorlov on 27/02/2017.
 */
public class Main {

    public static void main(String[] args) {

        while (true) {
            try {
                //читаем из файла
                TrafficLight trafficLight = FileReader.getTrafficLight();

                System.out.println("\n Цвет светофора " + trafficLight.getColor() +
                        "\n Введите новый цвет... \n");
                Scanner scanner = new Scanner(System.in);
                //читаем введенный текст
                String line = scanner.nextLine();
                // сеттим  в объект
                trafficLight.setColor(line);
                //записываем в файл
                FileReader.saveTrafficLight(trafficLight);
            } catch (Exception ex) {
                System.out.println(ex);
                break;
            }
        }
    }
}
