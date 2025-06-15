public class LatteCoffee extends CoffeeTemplate {
    @Override
    void brewCoffee() {
        System.out.println("Brewing espresso for latte");
    }

    @Override
    void addExtras() {
        System.out.println("Adding steamed milk");
    }
}