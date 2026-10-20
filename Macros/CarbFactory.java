import java.util.Random;

public class CarbFactory extends MacroFactoryCreator {

    private String[] carbs = { "Cheese", "Bread", "Lentils", "Pistachio" };
    private Random rand;
    private String plan;

    public CarbFactory(String plan) {
        rand = new Random();
        this.plan = plan;
    }

    @Override
    public String getFoodBasedOnPlan() {
        if (plan.toLowerCase().equals("no restriction")) {

            return carbs[rand.nextInt(4)];

        } else if (plan.toLowerCase().equals("paleo")) {

            return carbs[3];

        } else if (plan.toLowerCase().equals("nut allergy")) {

            return carbs[rand.nextInt(3)];

        } else if (plan.toLowerCase().equals("vegan")) {

            return carbs[rand.nextInt(1, 4)];

        }

        else {

            return "Invalid plan";
        }
    }

}