
/**
 * Write a description of class Bird here.
 *
 * @author (Paul Kirwan)
 * @version (17 October 2018)
 */
public class Fish extends Animal
{
    //instance variables (fields)
    boolean hasGills;
    boolean hasFins;
    boolean swims;
    boolean hasSpikes;
    boolean isEdible;
    boolean laysEggs;
    boolean dangerous;

    /**
     * Constructor for objects of class Fish
     */
    public Fish()
    {
        super(); //calls the constructor of its superclass  - Animal
        colour = "black"; //overrides the value of colour inherited from Animal
        hasGills = true;
        hasFins = true;
        swims = true;
        hasSkin = false;
    }

    /**
     * move method overrides the move method
     * inherited from superclass Animal
     */
    @Override // good programming practice to use @Override to denote overridden methods
    public void move(int distance){
        if (laysEggs && swims) {
            System.out.printf("I swam %d metres upstream to lay eggs \n\n", distance);
        }else if (swims) {
            System.out.printf("I swam %d metres \n\n", distance);
        }
        else System.out.println("I am dead\n\n");;
    }

    public void bite() {
        if (dangerous) {
            System.out.println("Bites\n");
        }
    }

    /**
     * sing method that all fish have
     */
    public boolean hasGills(){
        return hasGills;
    }

    public boolean hasFins(){
        return hasFins;
    }

    public boolean swims() {
        return swims;
    }

    public boolean hasSpikes() {
        return hasSpikes;
    }

    public boolean isEdible() {
        return isEdible;
    }

    public boolean laysEggs() {
        return laysEggs;
    }

    public boolean isDangerous() {
        return dangerous;
    }
}
