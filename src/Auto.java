public class Auto extends Transport {
    private String typeEngine;
    private int power;
    private double engineValue;

    public Auto(String brand, String model, double price, String typeEngine, int power, double engineValue) {
        super(brand, model, price);
        this.typeEngine = typeEngine;
        this.power = power;
        this.engineValue = engineValue;
    }


    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getEngineValue() {
        return engineValue;
    }

    public void setEngineValue(double engineValue) {
        this.engineValue = engineValue;
    }

    public String getAuto() {
        return super.getTransport() + "Тип двигателя: " + typeEngine + ". Объём двигателя: " + engineValue + ". Мощность: " + power + "л.с.";
    }


}
