
/**
 * Write a description of class Canary here.
 *
 * @author (Paul Kirwan)
 * @version (17 October 2018)
 */
public class Ostrich extends Bird
{
    // instance variables
    String name; // the name of this Canary
    /**
     * Constructor for objects of class Canary
     */
    public Ostrich(String name) {
        super(); // call the constructor of the superclass Bird
        this.name = name;
        flies = false;
        isTall = true;
        hasThinLongLegs = true;
    }

    //Adds all of the attributes to the String
    @Override
    public String toString(){
        String strng ="";
        strng+= "Ostrich; ";
        strng+= "name: ";
        strng+= name;
        strng+= "; ";
        strng+= "colour: ";
        strng+= colour;
        strng += "\n";
        if (hasFeathers){strng+="Has feathers. ";}
        if (hasWings){strng+="Has Wings. ";}
        if (hasSkin){strng+="Has Skin. ";}
        if (breathes){strng+="Breathes. ";}
        if (isTall) {strng +="Is tall. ";}
        if (hasThinLongLegs) {strng += "Has Thin Long Legs. ";}
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
        Ostrich ostrich = new Ostrich("Feathers");
        //Avoid null pointer exception
        //Object must be the same type, and have the same tribute to return true
        if (object != null && getClass() == object.getClass() && colour == ostrich.getColour()) {
            return true;
        }
        //Otherwise return false
        return false;
    }
}
