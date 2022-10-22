package autoShop;

import automanuf.AutoManuf;
import automanuf.enums.Color;
import car.Car;
import car.option.Option;

public class AutoShop extends AutoManuf {

    public AutoShop(String color, int year, String model, String wheelSize, String volumeOfEngine, String[] options) {
        super(color, year, model, wheelSize, volumeOfEngine);
        createCar();
        for (int i = 0; i < options.length; i++) {
            addNewOption(options[i]);
        }
    }
}