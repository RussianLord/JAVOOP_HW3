import java.util.Arrays;
import java.util.List;

public class CarType extends Auto {
    private String typeCar;
    private String materialCar;

    public CarType(int wheelsCount, int countPassenger, double engineValue, String typeEngine, String brand, String model, String color, double price, String typeCar, String materialCar) {
        super(wheelsCount, countPassenger, engineValue, typeEngine, brand, model, color, price);
        this.typeCar = typeCar;
        this.materialCar = materialCar;
    }

    public String getInfo() {
        return "Тип автомобиля: " + typeCar + ". Материал кузова: " + materialCar + ". \n" + super.getInfo();
    }

    static String getTypeCar() {
        list = Arrays.asList("Полиция", "Городская", "Гоночная", "Автобус", "Грузовик");
        return list.get(random.nextInt(list.size()));
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    static String getMatherial() {
        list = Arrays.asList("Сталь", "Алюминий", "Карбон");
        return list.get(random.nextInt(list.size()));
    }

    public void setMaterialCar(String materialCar) {
        this.materialCar = materialCar;
    }

}
