import java.util.*;
public class PizzaDriver {

    public static void main(String[] args) {

        // List of possible toppings:
        // Pepperoni, Sausage, Mushrooms, Bacon, Onions, Extra Cheese
        // Peppers, Chicken, Olives, Spinach, Tomato and Basil, Beef
        // Ham, Pesto, Spicy Pork, and Ham and Pineapple

        List<PizzaBuilder> pizzas = new ArrayList<PizzaBuilder>();
        pizzas.add(new PizzaBuilder().setChain("Pizza Hut").setSize("Small").addTopping("Pepperoni").addTopping("Ham and Pineapple").addTopping("Sausage"));
        pizzas.add(new PizzaBuilder().setChain("Pizza Hut").setSize("Medium").addTopping("Sausage").addTopping("Ham").addTopping("Pesto").addTopping("Spicy Pork").addTopping("Olives").addTopping("Spinach"));
        pizzas.add(new PizzaBuilder().setChain("Pizza Hut").setSize("Large").addTopping("Pepperoni").addTopping("Ham and Pineapple").addTopping("Spicy Pork").addTopping("Sausage").addTopping("Olives").addTopping("Beef").addTopping("Tomato and Basil").addTopping("Bacon").addTopping("Onions"));
        pizzas.add(new PizzaBuilder().setChain("Pizza Hut").setSize("Large").addTopping("Pepperoni").addTopping("Sausage").addTopping("Mushrooms"));
        pizzas.add(new PizzaBuilder().setChain("Pizza Hut").setSize("Small").addTopping("Spicy Pork").addTopping("Ham"));
        pizzas.add(new PizzaBuilder().setChain("Little Caesars").setSize("Medium").addTopping("Ham").addTopping("Olives").addTopping("Peppers").addTopping("Chicken").addTopping("Spinach").addTopping("Beef").addTopping("Tomato and Basil").addTopping("Extra Cheese"));
        pizzas.add(new PizzaBuilder().setChain("Little Caesars").setSize("Small").addTopping("Pepperoni").addTopping("Sausage").addTopping("Mushrooms").addTopping("Bacon").addTopping("Onions").addTopping("Extra Cheese"));
        pizzas.add(new PizzaBuilder().setChain("Domino's").setSize("Small").addTopping("Pepperoni"));
        pizzas.add(new PizzaBuilder().setChain("Domino's").setSize("Large").addTopping("Chicken").addTopping("Beef").addTopping("Bacon"));


        for (PizzaBuilder pizza : pizzas) {
            pizza.eat();
        }


    }

}