import java.util.Arrays;
import java.util.List;

public class Auto extends Transport{

    private  String brand;
    private  String model;
    private  String color;
    private double price;

    public Auto(int wheelsCount, int countPassenger, double engineValue, String typeEngine, String brand, String model, String color, double price) {
        super(wheelsCount, countPassenger, engineValue, typeEngine);
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }
    public String getInfo(){
        return "Марка: "+brand+". Модель: "+model+". Цвет кузова: "+color+". Цена: $"+price + ". \n" + super.getInfo();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    static String getColor() {
        list = Arrays.asList("Чёрный", "Красный", "Жёлтый", "Зелёный", "Белый");
        return list.get(random.nextInt(list.size()));
    }

    public void setColor(String color) {
        this.color = color;
    }

    static double getPrice() {
        int max = 10001;
        int min = 1000;
        return random.nextInt(max-min)+min;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}