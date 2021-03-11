public class KittyFinder {
    public static Kitty vladimirCuten;
    public static Kitty margaretScratcher;
    public static Kitty tinyCat;
    public static Kitty mrWhiskers;
    public static void main(String[] args) {
        FoodBowl foodBowl = new FoodBowl(20, false);
        vladimirCuten = new Kitty("Vladimir Cuten", true, false, true, 5, 2, foodBowl);
        margaretScratcher = new Kitty("Margaret Scratcher", false, false, false, 50, 9, foodBowl);
        tinyCat = new Kitty("Tiny Cat", false, false, true, 50, 9, foodBowl);
        mrWhiskers = new Kitty("Mister Whiskers", false, true, true, 4, 3, foodBowl);

        /* Fix Kitty.java and FoodBowl.java so that all 4 kitties meow!
            You shouldn't have to change KittyFinder.java except to uncomment the
            following 4 methods. */

        //vladimirCuten.getKittyOutOfHiding();
        //margaretScratcher.feedKitty();
        //tinyCat.feedKitty();
        //mrWhiskers.petKitty();


        int numberOfMeows = 0;
        if (vladimirCuten.isMeowed()) {
            numberOfMeows++;
        }
        if (margaretScratcher.isMeowed()) {
            numberOfMeows++;
        }
        if (tinyCat.isMeowed()) {
            numberOfMeows++;
        }
        if (mrWhiskers.isMeowed()) {
            numberOfMeows++;
        }
        System.out.println(numberOfMeows + " out of 4 kitties meowed!");
    }
}
