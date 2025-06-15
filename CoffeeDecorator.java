public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee c) 
    { 
        this.decoratedCoffee = c; 
    }

    @Override
    public void serve() 
    { 
        decoratedCoffee.serve(); 
    }

}