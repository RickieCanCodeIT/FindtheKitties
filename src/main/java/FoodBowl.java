public class FoodBowl {
    private int foodQuantity;
    private boolean isOldFood;

    public FoodBowl(int foodQuantity, boolean isOldFood) {
        this.foodQuantity = foodQuantity;
        this.isOldFood = isOldFood;
    }

    //The kitty eats if the conditions are right, returns the amount of food eaten.
    public int eat(int amount, boolean picky, String name) {
        if (isOldFood && picky) {
            System.out.println("Do you expect " + name + " to eat old food? Replace it!");
            foodQuantity += 20;
            return 0;
        }
        else if (foodQuantity > 0) {
            System.out.println(name + " eats their food.");
            if (foodQuantity < amount) {
                amount = foodQuantity;
            }
            foodQuantity -= amount;
            isOldFood = true;
            return amount;
        }
        else {
            System.out.println("The bowl is empty, refilling.");
            refreshFood(20);
            return 0;
        }
    }

    //Add food to the bowl, making it not old food.
    public void refreshFood(int amount) {
        System.out.println("You add food to the bowl.");
        foodQuantity += amount;
        isOldFood = false;
    }
}
