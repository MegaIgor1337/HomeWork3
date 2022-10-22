package service;

import automanuf.enums.Color;
import automanuf.enums.Model;
import automanuf.enums.VolumeOfEngine;
import automanuf.enums.WheelsSize;
import car.Car;
import car.option.Option;


public class Service extends Car {
        public Service(String color, int year, String model, String wheelSize, String volumeEngine) {
                super(color, year, model, wheelSize, volumeEngine);
        }
        public boolean changeColor(Color newColor) {
                for (Color c:
                        Color.values()) {
                        if (newColor.equals(c)) {
                                setColor(newColor);
                                return true;
                        }
                }
                return false;
        }

        public boolean changeWheelsSize(WheelsSize newWheelSize ) {
                for (WheelsSize w:
                        WheelsSize.values()) {
                        if (newWheelSize.equals(w)) {
                                setWheels(newWheelSize);
                                return true;
                        }
                }
                return false;
        }

        public boolean addNewOption(String newOption) {
                for (Option o:
                        Option.values()) {
                        if (Option.valueOf(newOption.toUpperCase()).equals(o)) {
                                setOption(newOption);
                                return true;
                        }
                }
                return false;
        }

        public boolean deletedOption(String optionToDelete) {
                for (Option o:
                        Option.values()) {
                        if (Option.valueOf(optionToDelete.toUpperCase()).equals(o)) {
                                deleteOption(optionToDelete);
                                return true;
                        }
                }
                return false;
        }



}