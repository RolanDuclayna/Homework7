public class Customer {

    private String name;
    private MacroFactoryCreator carbs;
    private MacroFactoryCreator proteins;
    private MacroFactoryCreator fats;
    private String plan;

    public Customer(String name, String plan) {
        this.name = name;
        this.plan = plan;
        carbs = new CarbFactory(plan);
        proteins = new ProteinFactory(plan);
        fats = new FatsFactory(plan);
    }

    public void createPlan() {
        System.out.println(name + "'s " + plan + " meal: " + carbs.getFoodBasedOnPlan() + ", "
                + proteins.getFoodBasedOnPlan() + ", and " + fats.getFoodBasedOnPlan());
    }
}
