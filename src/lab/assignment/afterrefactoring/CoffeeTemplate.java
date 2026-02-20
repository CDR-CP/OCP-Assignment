package lab.assignment.afterrefactoring;
public abstract class CoffeeTemplate {

    // fixed flow
    public final void prepareCoffee() {
        boilWater();
        brew();
        addIngredients();
        finalTouch();
    }

    // shared step
    protected void boilWater() {
        System.out.println("Boiling water");
    }

    // subclasses define these
    protected abstract void brew();

    protected abstract void addIngredients();

    protected abstract void finalTouch();
}