package my_classes2;

public class Vehicle
{
    String brand = null;
    String model = null;
    int year = 0;
    String color = null;
    double stockPrice = 0;
    boolean isCleanTitle = true;

    Vehicle()
    {

    }

    Vehicle(int year, String brand, String model)
    {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }

    Vehicle(int year, String brand, String model, String color, double stockPrice, boolean isCleanTitle)
    {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.stockPrice = stockPrice;
        this.isCleanTitle = isCleanTitle;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public boolean isCleanTitle() {
        return isCleanTitle;
    }

    public void setCleanTitle(boolean cleanTitle) {
        isCleanTitle = cleanTitle;
    }
}
