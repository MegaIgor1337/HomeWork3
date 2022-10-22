package automanuf;

import automanuf.enums.Color;
import automanuf.enums.Model;
import automanuf.enums.VolumeOfEngine;
import automanuf.enums.WheelsSize;
import service.Service;

public  class AutoManuf extends Service {
        protected static Model[] models = {Model.AUDI, Model.BMW, Model.KIA, Model.BELAZ, Model.GEELY, Model.HONDA, Model.LAMBORGINI, Model.MERSEDES, Model.PORSHE, Model.WOLSVAGEN, Model.VOLVO};
        protected static Color[] colors = {Color.PINK, Color.GREEN, Color.BLACK, Color.RED, Color.BLUE, Color.WHITE, Color.YELLOW};
        protected static VolumeOfEngine[] volumesOfEngine = {VolumeOfEngine.TWO_ZERO, VolumeOfEngine.ONE_SIX, VolumeOfEngine.EIGHT_ZERO, VolumeOfEngine.THREE_ZERO, VolumeOfEngine.ONE_NINE, VolumeOfEngine.SIX_ZERO, VolumeOfEngine.ONE_ZERO};
        protected static WheelsSize[] wheelsSize = {WheelsSize.SEVENTY, WheelsSize.TWENTY_EIGHT, WheelsSize.TWENTY_SEVEN, WheelsSize.TWENTY_SIX, WheelsSize.TWENTY_FIVE, WheelsSize.TWENTY_NINE};
        protected String color1;
        protected String model1;
        protected String wheelSize1;
        protected String volumEngine1;
        protected Service[] stock = {
                new Service("Yellow", 2020, "BMW", "TWENTY_EIGHT", "TWO_ZERO"),
                new Service("GREEN", 2022, "BELAZ", "SEVENTY", "EIGHT_ZERO"),
                new Service("BLACK", 2018, "AUDI", "TWENTY_SIX", "THREE_ZERO"),
                new Service("RED", 2019, "LAMBORGINI", "TWENTY_SEVEN", "ONE_SIX"),
                new Service("PINK", 2013, "HONDA", "TWENTY_THREE", "ONE_SIX")
        };


        public AutoManuf(String color, int year, String model, String wheelSize, String volumeEngine) {
                super(color, year, model, wheelSize, volumeEngine);
                this.color1 = color;
                this.model1 = model;
                this.volumEngine1 = volumeEngine;
                this.wheelSize1 = wheelSize;
        }

        public void printCars() {
                System.out.println("Доступные машины: ");
                for (int i = 0; i < stock.length; i++) {
                        stock[i].print();
                }
        }

        public static void printAvailableFunds() {
                System.out.println("Доступные моделии: ");
                for (int i = 0; i < models.length; i++) {
                        System.out.print(models[i] + " ");
                }
                System.out.println();
                System.out.println("Доступные Объёмы двигателей");
                for (int i = 0; i < volumesOfEngine.length; i++) {
                        System.out.print(volumesOfEngine[i] + " ");
                }
                System.out.println();
                System.out.println("Доступные цвета:");
                for (int i = 0; i < colors.length; i++) {
                        System.out.print(colors[i] + " ");
                }
                System.out.println();
                System.out.println("Доступные колёса:");
                for (int i = 0; i < wheelsSize.length; i++) {
                        System.out.print(wheelsSize[i] + " ");
                }
                System.out.println();
        }

        public Service createCar() {
                for (int i = 0; i < stock.length; i++) {
                        if (stock[i].getColor().equals(color)) {
                                if (stock[i].getModel().equals(model)) {
                                        if (stock[i].getYear() == year) {
                                                if (stock[i].getWheelSize().equals(wheelSize)) {
                                                        if (stock[i].getVolumeEngine().equals(volumeEngine)) {
                                                                Service carTmp = stock[i];
                                                                stock[i] = null;
                                                                System.out.println("Машита изъята из склада");
                                                                return carTmp;
                                                        }
                                                }
                                        }
                                }
                        }
                }
                for (int i = 0; i < stock.length; i++) {
                        if (stock[i] != null) {
                                if (stock[i].getColor().equals(color) && stock[i].getModel().equals(model) && stock[i].getYear() == year && !stock[i].getWheelSize().equals(wheelSize) && stock[i].getVolumeEngine().equals(volumeEngine)) {
                                        stock[i].changeWheelsSize(wheelSize);
                                        Service carTmp = stock[i];
                                        stock[i] = null;
                                        System.out.println("Машита изъята из склада и изменена");
                                        return carTmp;
                                }
                        }
                }
                for (int i = 0; i < stock.length; i++) {
                        if (stock[i] != null) {
                                if (!stock[i].getColor().equals(color) && stock[i].getModel().equals(model) && stock[i].getYear() == year && stock[i].getWheelSize().equals(wheelSize) && stock[i].getVolumeEngine().equals(volumeEngine)) {
                                        stock[i].changeColor(color);
                                        Service carTmp = stock[i];
                                        stock[i] = null;
                                        System.out.println("Машита изъята из склада и изменена");
                                        return carTmp;
                                }
                        }
                }
                for (int i = 0; i < stock.length; i++) {
                        if (stock[i] != null) {
                                if (!stock[i].getColor().equals(color) && stock[i].getModel().equals(model) && stock[i].getYear() == year && !stock[i].getWheelSize().equals(wheelSize) && stock[i].getVolumeEngine().equals(volumeEngine)) {
                                        stock[i].changeWheelsSize(wheelSize);
                                        stock[i].changeColor(color);
                                        Service carTmp = stock[i];
                                        stock[i] = null;
                                        System.out.println("Машита изъята из склада и изменена");
                                        return carTmp;
                                }
                        }
                }
                System.out.println("По вашему заказу машина сделана");
                return new Service(this.color1, 2022, this.model1, this.wheelSize1, this.volumEngine1);
        }



}