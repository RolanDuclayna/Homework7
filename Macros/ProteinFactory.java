import java.util.Random;

public class ProteinFactory extends MacroFactoryCreator {

    private String[] proteins = { "Fish", "Chicken", "Beef", "Tofu" };
    private Random rand;
    private String plan;

    public ProteinFactory(String plan) {
        rand = new Random();
        this.plan = plan;
    }

    @Override
    public String getFoodBasedOnPlan() {
        if (plan.toLowerCase().equals("no restriction") || (plan.toLowerCase().equals("nut allergy"))) {

            return proteins[rand.nextInt(4)];

        } else if (plan.toLowerCase().equals("paleo")) {

            return proteins[rand.nextInt(3)];

        } else if (plan.toLowerCase().equals("vegan")) {

            return proteins[3];

        } else {

            return "Invalid plan";

        }
    }

}