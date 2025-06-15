public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee c) 
    { 
        super(c); 
    }

    @Override
    public void serve() 
    {
        super.serve();
        System.out.println(" + Sugar");
    }
}