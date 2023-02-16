public class Car extends Auto {
    private String car;
    private int wheelsCount;

    public Car(String brand, String model, double price, String typeEngine, int power, double engineValue,
               String car, int wheelsCount) {
        super(brand, model, price, typeEngine, power, engineValue);
        this.car = car;
        this.wheelsCount = wheelsCount;
    }
}
