public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee c) 
    { 
        super(c); 
    }

    @Override
    public void serve() {
        super.serve();
        System.out.println(" + Milk");
    }
}