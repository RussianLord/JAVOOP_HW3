import java.util.Arrays;

public class CitizenCar extends CarType{
    private String nameAudioSystem;


    public CitizenCar(int wheelsCount, int countPassenger, double engineValue, String typeEngine, String brand, String model, String color, double price, String typeCar, String materialCar, String nameAudioSystem) {
        super(wheelsCount, countPassenger, engineValue, typeEngine, brand, model, color, price, typeCar, materialCar);
        this.nameAudioSystem = nameAudioSystem;

    }

    static String getNameAudioSystem() {
        list = Arrays.asList("Harmak/Kardon","Bose","Bang & Olufsen");
        return list.get(random.nextInt(list.size()));
    }

    public void setNameAudioSystem(String nameAudioSystem) {
        this.nameAudioSystem = nameAudioSystem;
    }

    static String getTypeCar() {
        list = Arrays.asList("Минивен","Седан","Хетчбек");
        return list.get(random.nextInt(list.size()));
    }
}
