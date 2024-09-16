public class Main {
    public static void main(String[] args) {
        Table table1 = new Table();
        Table table2 = new Table("plastic", "blue", 1234.33, 55, 55, 55);
        Chair chair1 = new Chair();
        Bed bed1 = new Bed();

        table1.displayInformation();
        table1.assembled();
        table1.notAssembled();
        System.out.println();

        table2.displayInformation();
        System.out.println();

        chair1.displayInformation();
        chair1.assembled();
        chair1.notAssembled();
        System.out.println();

        bed1.displayInformation();
        bed1.assembled();
        bed1.notAssembled();
        System.out.println();

        System.out.println("the number of furniture: " + Furniture.counter);
    }
}

