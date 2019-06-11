/**
 * Subclass of Shape.
 *
 * @author (Paul Kirwan)
 * @version (20 November 2018)
 */
public class Cube extends Shape
{
    public Cube()
    {
        super();
        this.name = "cube ";
    }
    
    @Override
    public String getName()
    {
        return name;
    }
}
