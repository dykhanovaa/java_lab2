import java.util.zip.CheckedOutputStream;

public abstract class Furniture {

    //поля
    private String name;
    private String material;
    private String color;
    private double price;
    static int counter = 0;

    //конструктор
    public Furniture(String name, String material, String color, double price){
        this.name = name;
        this.material = material;
        this.color = color;
        this.price = price;
        counter++;
    }

    public Furniture(String material, String color, double price){
        name = "none";
        this.material = material;
        this.color = color;
        this.price = price;
    }

    //конструктор по умолчанию
    public Furniture(){
        this("none","none", "none", 0);
    }

    public abstract void assembled();

    public abstract void notAssembled();

    //геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void displayInformation(){
        System.out.printf("NAME: %s, MATERIAL: %s, COLOR: %s, PRICE: %.2f \n", name, material, color, price);
    }
}