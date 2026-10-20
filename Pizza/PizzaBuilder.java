import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private List<String> toppings = new ArrayList<String>();
    private String chain = null;
    private String size = null;

    public PizzaBuilder() {

    }

    public PizzaBuilder setChain(String chain) {
        this.chain = chain;
        return this;
    }

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    public void eat() {
        System.out.print("A " + size + " pizza from " + chain + " with toppings of: ");
        for (String x : toppings) {
            System.out.print(x + ", ");
        }
        System.out.println();
    } 

}