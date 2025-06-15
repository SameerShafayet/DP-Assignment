public class Main {
    public static void main(String[] args) {
        // Factory: Get a coffee
        Coffee base = CoffeeFactory.getCoffee("latte");

        // Strategy: Choose brewing method
        CoffeeMaker maker = new CoffeeMaker();
        maker.setBrewingStrategy(new HotBrew());
        maker.prepare();

        // Decorator: Add extras
        Coffee withMilk = new MilkDecorator(base);
        Coffee withMilkAndSugar = new SugarDecorator(withMilk);
        withMilkAndSugar.serve();

        // Template: Follow structured preparation steps
        CoffeeTemplate coffeeTemplate = new LatteCoffee();
        coffeeTemplate.makeCoffee();
    }
}
