import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Transport {
    private String brand, model;
    private double price;
    private List<String> brands = new ArrayList<>();
    private List<String> models = new ArrayList<>();
    private Map<String,List<String>> modelsCars = new HashMap<>();
    private List<String> modelsBus = new ArrayList<>();

    public List<String> getBrands() {
        brands.add("MAN");
        brands.add("Porche");
        brands.add("Ford");
        brands.add("Hyunda");
        brands.add("Lincoln");
        return brands;
    }

    public Map<String, List<String>> getModelsCars() {
        for (int i = 0; i < brands.size(); i++) {
            if(brands.get(i).equals("Porche")) {
                models.removeAll(models);
                models.add("911 GT");
                models.add("Panamera");
                models.add("Cayman");
                modelsCars.put(brands.get(i),models); }
            else if (brands.get(i).equals("Ford")) {
                models.removeAll(models);
                models.add("Focus");
                models.add("Fiesta");
                models.add("Patrol");
                modelsCars.put(brands.get(i),models);}
            else if (brands.get(i).equals("Hyunda")) {
                models.removeAll(models);
                models.add("T150");
                models.add("B112");
                models.add("BusSeria");
                modelsCars.put(brands.get(i),models);}
            else if (brands.get(i).equals("MAN")) {
                models.removeAll(models);
                models.add("Cargo");
                models.add("BigTruck");
                modelsCars.put(brands.get(i),models);}
            else if (brands.get(i).equals("Lincoln")) {
                models.removeAll(models);
                models.add("Classic s50");
                models.add("R15");
                modelsCars.put(brands.get(i),models);}


        }
        return modelsCars;
    }

    public Transport(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransport() {
        return "Бренд: " + brand + ". Модель: " + model + ". Цена: " + price + "руб.";
    }
}
