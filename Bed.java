public class Bed extends Furniture{

    private double width;
    private double length;

    public  Bed(String name, String material, String color, double price, double width, double length){
        super(name, material, color, price);
        this.length=length;
        this.width=width;
    }

    public  Bed(String material, String color, double price, double width, double length){
        super("bed", material, color, price);
        this.length=length;
        this.width=width;
    }

    public Bed(){
        this("bed", "wood", "white", 1234.56, 160, 200);
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    @Override
    public void assembled(){
        System.out.println("The bed is assembled");
    }

    @Override
    public void notAssembled(){
        System.out.println("The bed is not assembeled");
    }

    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.printf("Width: %.2f, length: %.2f \n", width, length);
    }
}
