import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MoverCar extends Auto{
    private String typeBody;
    private String targed;

    public MoverCar(int wheelsCount, int countPassenger, double engineValue, String typeEngine, String brand, String model, String color, double price, String typeBody, String targed) {
        super(wheelsCount, countPassenger, engineValue, typeEngine, brand, model, color, price);
        this.typeBody = typeBody;
        this.targed = targed;
    }
    public String getInfo(){
        return "Назначние грузовика: "+targed+". Тип кузова: "+typeBody+". "+super.getInfo()+"\n";
    }
    static String getTypeBody() {
        list = Arrays.asList("Открытый","Закрытый","Удлинённый");
        return list.get(random.nextInt(list.size()));
    }

    public void setTypeBody(String typeBody) {
        this.typeBody = typeBody;
    }

    static String getTarged() {
        list =Arrays.asList("Мусоровоз","Перевозчик","Эвакуатор");
        return list.get(random.nextInt(list.size()));
    }

    public void setTarged(String targed) {
        this.targed = targed;
    }
    public static int getWheels(){
        Random random = new Random();
        int[] list = new int[]{4,6,8};
        return list[random.nextInt(list.length)];
    }
    public static int getCountPassenger() {
        int maxPas = 3;
        int minPas = 1;
        return random.nextInt(maxPas-minPas)+minPas;
    }
}
