import java.util.Arrays;
import java.util.List;

public class PoliceCar extends CarType{
    private String typeSpeaker;
    private String blinksColor;
    private String radioBrand;
    private int donutsCount;

    public PoliceCar(int wheelsCount, int countPassenger, double engineValue, String typeEngine, String brand, String model, String color, double price, String typeCar, String materialCar, String typeSpeaker, String blinksColor, String radioBrand, int donutsCount) {
        super(wheelsCount, countPassenger, engineValue, typeEngine, brand, model, color, price, typeCar, materialCar);
        this.typeSpeaker = typeSpeaker;
        this.blinksColor = blinksColor;
        this.radioBrand = radioBrand;
        this.donutsCount = donutsCount;
    }
    public String getInfo(){
        return super.getInfo()+"Тип оповещения: "+typeSpeaker+". Цвет маячков: "+blinksColor+". Название рации: "+radioBrand+". Количество пончиков на обед: "+donutsCount+"\n";
    }
    static String getTypeSpeaker() {
        list =Arrays.asList("Уличное оповещение","Глобальное оповещение","Дорожное оповещение");
        return list.get(random.nextInt(list.size()));
    }

    public void setTypeSpeaker(String typeSpeaker) {
        this.typeSpeaker = typeSpeaker;
    }

    static String getBlinksColor() {
        list = Arrays.asList("Красный","Синий","Красно-Синий");
        return list.get(random.nextInt(list.size()));
    }

    public void setBlinksColor(String blinksColor) {
        this.blinksColor = blinksColor;
    }

    static String getRadioBrand() {
        list=Arrays.asList("Стандарт 15","МистерПро 2000","Коннект+");
        return list.get(random.nextInt(list.size()));
    }

    public void setRadioBrand(String radioBrand) {
        this.radioBrand = radioBrand;
    }

    static int getDonutsCount() {
        int max = 10;
        int min = 2;
        return random.nextInt(max-min)+min;
    }

    public void setDonutsCount(int donutsCount) {
        this.donutsCount = donutsCount;
    }

    static String getTypeCar() {
        list = Arrays.asList("Полиция","Агент","ФБР","ЦРУ");
        return list.get(random.nextInt(list.size()));
    }
}
