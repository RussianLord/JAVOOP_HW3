import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Transport {
    public static Random random = new Random();

    public static List<String> list = new ArrayList<>();
    private int wheelsCount;
    private int countPassenger;
    private double engineValue;
    private String typeEngine;

    public Transport(int wheelsCount, int countPassenger, double engineValue, String typeEngine) {
        this.wheelsCount = wheelsCount;
        this.countPassenger = countPassenger;
        this.engineValue = engineValue;
        this.typeEngine = typeEngine;
    }

    public String getInfo() {
        return "Вместимость пассажиров: " + countPassenger + ". Тип двигателя: " + typeEngine + ". Объём двигателя: " + engineValue + ". Количество колёс: " + wheelsCount+ ". \n";
    }

    public static int getWheelsCount(){
        int wheels = 4;
        return wheels;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public static int getCountPassenger() {
        int maxPas = 7;
        int minPas = 2;
        return random.nextInt(maxPas-minPas)+minPas;
    }

    public void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    static double getEngineValue(){
        double[] list = new double[]{1.6,2.0,3.2,4.0,6.4};
        return list[random.nextInt(list.length)];
    }

    public void setEngineValue(double engineValue) {
        this.engineValue = engineValue;
    }

    static String getTypeEngine(){
        list = Arrays.asList("Бензин", "Дизель", "Элеткро");
        return list.get(random.nextInt(list.size()));
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }
}
