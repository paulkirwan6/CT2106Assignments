public class Shark extends Fish {

    String name;

    public Shark(String name) {
        super(); // call the constructor of the superclass Bird
        this.name = name;
        dangerous = true;
    }


    //Adds all of the attributes to the String
    @Override
    public String toString() {
        String strng = "";
        strng += "Shark; ";
        strng += "name: ";
        strng += name;
        strng += "; ";
        strng += "colour: ";
        strng += colour;
        strng += "\n";
        if (isEdible()) {strng+="Is Edible. ";}
        if (isDangerous()) {strng+="Is Dangerous. ";}
        if (hasSkin()) {strng+="Has Skin. ";}
        if (hasFins()) {strng+="Has Fins. ";}
        if (hasSpikes()){strng+="Has Spikes. ";}
        if (hasGills()) {strng+="Has Gills. ";}
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
        Shark shark = new Shark("Jaws 2");
        //Avoid null pointer exception
        //Object must be the same type, and have the same tribute to return true
        if (object != null && getClass() == object.getClass() && colour == shark.getColour()) {
            return true;
        }
        //Otherwise return false
        return false;
    }
}
