public class Table extends Furniture{

    private double height;
    private double width;
    private double length;

    public Table(String name, String material, String color, double price, double height, double width, double length){
        super(name, material, color, price);
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Table(String material, String color, double price, double height, double width, double length){
        super("table", material, color, price);
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Table(){
        this("Table", "wood", "brown", 1000, 90, 50, 50);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    @Override
    public void assembled(){
        System.out.println("The table is assembled");
    }

    @Override
    public void notAssembled(){
        System.out.println("The table is not assembled");
    }

    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.printf("Height: %.2f, width: %.2f, length: %.2f \n", height, width, length);
    }

}
