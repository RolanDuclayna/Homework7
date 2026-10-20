import java.util.Random;

public class FatsFactory extends MacroFactoryCreator {

    private String[] fats = { "Sour Cream", "Tuna", "Avocado", "Peanuts" };
    private Random rand;
    private String plan;

    public FatsFactory(String plan) {
        rand = new Random();
        this.plan = plan;
    }

    @Override
    public String getFoodBasedOnPlan() {
        if (plan.toLowerCase().equals("no restriction")) {

            return fats[rand.nextInt(4)];

        } else if (plan.toLowerCase().equals("paleo")) {

            return fats[rand.nextInt(1, 4)];

        } else if (plan.toLowerCase().equals("vegan")) {

            return fats[rand.nextInt(2, 4)];

        } else if (plan.toLowerCase().equals("nut allergy")) {

            return fats[rand.nextInt(3)];
        } else {

            return "Invalid plan";

        }
    }

}