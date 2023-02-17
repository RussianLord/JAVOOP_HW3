import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Bus extends Auto{
    private String typeBus;
    private String startWorkTime;
    private String endWorkTime;

    public Bus(int wheelsCount, int countPassenger, double engineValue, String typeEngine, String brand, String model, String color, double price, String typeBus, String startWorkTime, String endWorkTime) {
        super(wheelsCount, countPassenger, engineValue, typeEngine, brand, model, color, price);
        this.typeBus = typeBus;
        this.startWorkTime = startWorkTime;
        this.endWorkTime = endWorkTime;
    }

    public String getInfo(){
        return "Тип автобуса: "+typeBus+". Начало работы: "+startWorkTime+". Окончание работы: "+endWorkTime+". \n"+super.getInfo()+"\n";
    }
    public static int getWheels(){
        Random random = new Random();
        int[] list = new int[]{4,6,8};
        return list[random.nextInt(list.length)];
    }
    static String getTypeBus() {
        list = Arrays.asList("Школьный", "Рейсовый", "Заказной");
        return list.get(random.nextInt(list.size()));
    }

    public void setTypeBus(String typeBus) {
        this.typeBus = typeBus;
    }

    static String getStartWorkTime() {
        int h = 12;
        int m = 60;
        return random.nextInt(h)+":"+random.nextInt(m);
    }

    public void setStartWorkTime(String startWorkTime) {
        this.startWorkTime = startWorkTime;
    }

    static String getEndWorkTime() {
        int h = 12;
        int m = 60;
        return random.nextInt(h)+":"+random.nextInt(m);
    }

    public void setEndWorkTime(String endWorkTime) {
        this.endWorkTime = endWorkTime;
    }
    public static int getCountPassenger() {
        int maxPas = 41;
        int minPas = 10;
        return random.nextInt(maxPas-minPas)+minPas;
    }
}
