package lab.assignment.afterrefactoring;
public class CappuccinoCoffee extends CoffeeTemplate {

    @Override
    protected void brew() {
        System.out.println("Brewing espresso");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Adding steamed milk");
    }

    @Override
    protected void finalTouch() {
        System.out.println("Add foam on top");
    }
}