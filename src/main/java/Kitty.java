import java.util.Scanner;

public class Kitty {
    private String name;
    private boolean hiding;
    private boolean wantsPet;
    private boolean picky;
    private int hunger;
    private int age;
    private FoodBowl bowl;
    private Scanner input;
    private boolean meowed;

    public Kitty(String name, boolean hiding, boolean wantsPet, boolean picky, int hunger, int age, FoodBowl bowl) {
        this.name = name;
        this.hiding = hiding;
        this.wantsPet = wantsPet;
        this.picky = picky;
        this.hunger = hunger;
        this.age = age;
        meowed = false;
    }

    //Pet the kitty until it no longer needs petting
    public void petKitty(){
        if (wantsPet) {
            System.out.println(name + " purrs!");
            petKitty();
            wantsPet = false;
        }
        else {
            meow();
        }
    }

    //Gets the kitty out of hiding
    public void getKittyOutOfHiding() {
        int numberOfTreats = 0;
        do {
            System.out.println(name + " is hiding, how many treats do you want to give them?");
            numberOfTreats = input.nextInt();
            coaxKitty(numberOfTreats);
        } while (hiding);
        meow();
    }

    //Should get the kitty out of hiding if you give them 4 or more treats.
    public boolean coaxKitty(int numTreats) {
        if (hiding) {
            if (numTreats > 3) {
                System.out.println(name + " comes out of hiding!");
                return false;
            }
            else {
                System.out.println(name + " is still hiding!");
                return true;
            }
        }
        return false;
    }

    //Should feed the kitty until hunger is less than 0
    public void feedKitty() {

        System.out.println("You go to feed " + name + ".");
        while (hunger > 0) {
            hunger -= bowl.eat((int)Math.floor(Math.random() * 5) + 1, picky, name);
        }
        System.out.println(name + " is now full.");
        meow();
    }

    //The kitty meows, indicating success.
    public void meow() {
        System.out.println(name + " meows!");
        meowed = true;
    }

    public boolean isMeowed() {
        return meowed;
    }
}
