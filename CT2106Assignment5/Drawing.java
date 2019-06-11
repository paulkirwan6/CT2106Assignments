/**
 * Drawing class used to add/remove shapes and print their contents.
 *
 * @author (Paul Kirwan)
 * @version (20 November 2018)
 */
import java.util.ArrayList;

public class Drawing 
{
    private ArrayList<Drawing> drawingList;
    String colour = "black";
    String name;

    public Drawing()
    {
        drawingList = new ArrayList<>();
    }
    
    public void add(Drawing drawing)
    {
        drawingList.add(drawing);
    }
    
    public void remove(Drawing drawing)
    {
        drawingList.remove(drawing);
    }
    
    //sets the colour and uses an exception to restrict what colours can be set
    public void setColour(String colour) throws IllegalArgumentException
    {
        try {
            if (colour.toLowerCase().equals("black") || colour.toLowerCase().equals("blue") || colour.toLowerCase().equals("red"))
            {
                this.colour = colour;
            }
            else throw new IllegalArgumentException("Colour must be black,blue or red");
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    } 
    
    //Prints each shape inside drawings
    public void print()
    {
        for (Drawing drawing : drawingList)
        {
            System.out.println("Drawing "+ drawing.getName() +"with colour "+ colour);
        }
    }
    
    //Returns the name of each shape type inside the drawings
    public String getName()
    {
        for (Drawing drawing : drawingList)
        {
            name +=  drawing.getName();
        }
        return name;
    }
}
