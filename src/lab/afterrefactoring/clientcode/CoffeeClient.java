public class CoffeeClient {

    public static void main(String[] args) {
        CoffeeMaker maker = new CoffeeMaker();

        System.out.println("** Mocha **");
        maker.prepareCoffee(new MochaCoffee());
        System.out.println();

        System.out.println("** Capuccino **");
        maker.prepareCoffee(new CapuccinoCoffee());
        System.out.println();

        System.out.println("** Americano **");
        maker.prepareCoffee(new AmericanoCoffee());
    }
}