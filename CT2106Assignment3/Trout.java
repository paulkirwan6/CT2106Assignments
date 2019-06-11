public class Trout extends Fish {
    // instance variables
    String name;

    public Trout(String name) {
        super(); // call the constructor of the superclass Bird
        this.name = name;
        laysEggs = true;
        colour = "brown"; // this overrides the value inherited from Fish
    }

    //Adds all of the attributes to the String
    @Override
    public String toString(){
        String strng ="";
        strng+= "Trout; ";
        strng+= "name: ";
        strng+= name;
        strng+= "; ";
        strng+= "colour: ";
        strng+= colour;
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
        Trout trout = new Trout("Oscar");
        //Avoid null pointer exception
        //Object must be the same type, and have the same tribute to return true
        if (object != null && getClass() == object.getClass() && colour == trout.getColour()) {
            return true;
        }
        //Otherwise return false
        return false;
    }
}

