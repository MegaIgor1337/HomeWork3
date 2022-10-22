package car;


import automanuf.enums.Color;
import automanuf.enums.Model;
import automanuf.enums.VolumeOfEngine;
import automanuf.enums.WheelsSize;
import car.option.Option;

public class Car {
    protected Color color;
    protected final int year;
    protected final Model model;
    protected WheelsSize wheelSize;
    protected final VolumeOfEngine volumeEngine;
    protected Option[] options = {Option.PARKTRONICS, Option.PANORAMA, Option.MUSIC, Option.GPS, Option.FOGLIGHTS, Option.CONDITION, Option.BACKWHEEL};
    protected Option[] optionsOfCar = new Option[options.length];
    protected int index = 0;
    public Car(String color, int year, String model, String wheelSize, String volumeEngine) {
        this.color = Color.valueOf(color.toUpperCase());
        this.model = Model.valueOf(model.toUpperCase());
        this.year = year;
        this.volumeEngine = VolumeOfEngine.valueOf(volumeEngine.toUpperCase());
        this.wheelSize = WheelsSize.valueOf(wheelSize.toUpperCase());
    }

    public void setColor(Color newColor) {
        this.color = newColor;
    }

    public void setWheels(WheelsSize newWheelSize) {
        this.wheelSize = newWheelSize;
    }

    public void setOption(String newOption) {
        optionsOfCar[index++] = Option.valueOf(newOption.toUpperCase());
    }

    public void deleteOption(String deleteOption) {
        for (int i = 0; i < optionsOfCar.length; i++) {
            if (optionsOfCar[i].equals(Option.valueOf(deleteOption.toUpperCase()))) {
                optionsOfCar[i] = null;
            }
        }
    }

    public void print() {
        System.out.println("Модель: " + model);
        System.out.println("Цвет: " + color);
        System.out.println("Год издания: " + year);
        System.out.println("Размер колёс: " + wheelSize);
        System.out.println("Объём двигателя: " + volumeEngine);
        System.out.println("Опции: ");
        for (int i = 0; i < optionsOfCar.length; i++) {
            if (optionsOfCar[i] != null) {
                System.out.println(optionsOfCar[i]);
            }
        }
    }

    public Color getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public Model getModel() {
        return model;
    }

    public VolumeOfEngine getVolumeEngine() {
        return volumeEngine;
    }

    public WheelsSize getWheelSize() {
        return wheelSize;
    }

}