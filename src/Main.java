import autoShop.AutoShop;
import automanuf.AutoManuf;

public class Main {
    public static void main(String[] args) {
        AutoManuf.printAvailableFunds();
        String[] optionsForCar1 = {"Gps", "music"};
        AutoShop car1 = new AutoShop("Black", 2020, "BMW", "TWENTY_EIGHT", "TWO_ZERO", optionsForCar1);
        System.out.println("Ваша машина: ");
        car1.print();
    }
}