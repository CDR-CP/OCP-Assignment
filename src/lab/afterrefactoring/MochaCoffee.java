public class MochaCoffee extends CoffeeTemplate {

    @Override
    protected void brew() {
        System.out.println("Brewing espresso");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Adding chocolate syrup");
    }

    @Override
    protected void finalTouch() {
        System.out.println("Add whipped cream");
    }
}