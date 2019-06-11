
/**
 * Write a description of class Canary here.
 *
 * @author (Paul Kirwan)
 * @version (17 October 2018)
 */
public class Canary extends Bird {
    // instance variables
    String name; // the name of this Canary

    /**
     * Constructor for objects of class Canary
     */
    public Canary(String name) {
        super(); // call the constructor of the superclass Bird
        this.name = name;
        colour = "yellow"; // this overrides the value inherited from Bird

    }

    /**
     * Sing method overrides the sing method
     * inherited from superclass Bird
     */
    @Override // good programming practice to use @Override to denote overridden methods
    public void sing() {
        System.out.println("tweet tweet tweet");
    }

    //Adds all of the attributes to the String
    @Override
    public String toString() {
        String strng = "";
        strng += "Canary; ";
        strng += "name: ";
        strng += name;
        strng += "; ";
        strng += "colour: ";
        strng += colour;
        strng += "\n";
        if (hasFeathers) {
            strng += "Has feathers. ";
        }
        if (hasWings) {
            strng += "Has Wings. ";
        }
        if (hasSkin) {
            strng += "Has Skin. ";
        }
        if (breathes) {
            strng += "Breathes. ";
        }
        if (isTall) {
            strng += "Is tall. ";
        }
        if (hasThinLongLegs) {
            strng += "Has Thin Long Legs. ";
        }
        return strng;

    }


    /**
     * equals method defines how equality is defined between
     * the instances of the Canary class
     * param Object
     * return true or false depending on whether the input object is
     * equal to this Canary object
     */

    @Override
    public boolean equals(java.lang.Object object){

        //Create object to reference an attribute
        Canary canary = new Canary("Robert");
        //Avoid null pointer exception
        //Object must be the same type, and have the same tribute to return true
        if (object != null && getClass() == object.getClass() && colour == canary.getColour()) {
            return true;
        }
        //Otherwise return false
        return false;
    }
}
