import java.util.Arrays;
import java.util.List;

public class SportCar extends CarType{
    private String nameOfTrack;
    private String typeOfDoors;

    public SportCar(int wheelsCount, int countPassenger, double engineValue, String typeEngine, String brand, String model, String color, double price, String typeCar, String materialCar, String nameOfTrack, String typeOfDoors) {
        super(wheelsCount, countPassenger, engineValue, typeEngine, brand, model, color, price, typeCar, materialCar);
        this.nameOfTrack = nameOfTrack;
        this.typeOfDoors = typeOfDoors;
    }

    static String getTypeCar() {
        list = Arrays.asList("Трековый гоночный","Оригинальный спорткар","Нелегальный тюнингованный");
        return list.get(random.nextInt(list.size()));
    }
    static String getNameOfTrack() {
        list = Arrays.asList("Трек Джакарта","Уличный заезд","Драг");
        return list.get(random.nextInt(list.size()));
    }

    public void setNameOfTrack(String nameOfTrack) {
        this.nameOfTrack = nameOfTrack;
    }

    static String getTypeOfDoors() {
        list = Arrays.asList("Обычные двери","Двери гильятина","Двери ласточка");
        return list.get(random.nextInt(list.size()));
    }

    public void setTypeOfDoors(String typeOfDoors) {
        this.typeOfDoors = typeOfDoors;
    }

    public static int getCountPassenger() {
        int maxPas = 3;
        int minPas = 1;
        return random.nextInt(maxPas-minPas)+minPas;
    }
}
