public class Chair extends Furniture{

    private boolean withWheels;

    public Chair(String name, String material, String color, int price, boolean withWheels){
        super(name, material, color, price);
        this.withWheels = withWheels;
    }

    public Chair(String material, String color, int price, boolean withWheels){
        super("chair", material, color, price);
        this.withWheels = withWheels;
    }

    public Chair(){
        this("chair", "steel", "black", 500, false);
    }

    public boolean getWithWheels(){
        return withWheels;
    }

    public void setWithWheels(boolean withWheels){
        this.withWheels = withWheels;
    }

    @Override
    public void assembled(){
        System.out.println("The chair is assembled");
    }

    @Override
    public void notAssembled(){
        System.out.println("The chair is not assembled");
    }

    @Override
    public void displayInformation(){
        super.displayInformation();
        if(withWheels){
            System.out.println("The chair is with wheels");
        }else{
            System.out.println("The chair doesn't have wheels");
        }
    }

}
