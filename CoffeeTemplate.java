public abstract class CoffeeTemplate {
    public final void makeCoffee() {
        boilWater();
        brewCoffee();
        pourInCup();
        addExtras();
    }

    void boilWater() {
        System.out.println("Boiling water...");
    }

    abstract void brewCoffee();
    abstract void addExtras();

    void pourInCup() {
        System.out.println("Pouring into cup...");
    }
}