package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.AmericanoCoffee;
import lab.assignment.afterrefactoring.CappuccinoCoffee;
import lab.assignment.afterrefactoring.CoffeeMaker;
import lab.assignment.afterrefactoring.MochaCoffee;
public class CoffeeClient {

    public static void main(String[] args) {
        CoffeeMaker maker = new CoffeeMaker();

        System.out.println("** Mocha **");
        maker.prepareCoffee(new MochaCoffee());
        System.out.println();

        System.out.println("** Capuccino **");
        maker.prepareCoffee(new CappuccinoCoffee());
        System.out.println();

        System.out.println("** Americano **");
        maker.prepareCoffee(new AmericanoCoffee());
    }
}