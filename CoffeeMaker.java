// Context
public class CoffeeMaker {
    private BrewingStrategy brewingStrategy;

    public void setBrewingStrategy(BrewingStrategy strategy) {
        this.brewingStrategy = strategy;
    }

    public void prepare() {
        brewingStrategy.brew();
    }
}