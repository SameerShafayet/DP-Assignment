// Factory
public class CoffeeFactory {
    public static Coffee getCoffee(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Coffee type cannot be null");
        }

        if (type.equalsIgnoreCase("espresso")) {
            return new Espresso();
        } else if (type.equalsIgnoreCase("latte")) {
            return new Latte();
        } else {
            throw new IllegalArgumentException("Unknown coffee type: " + type);
        }
    }
}