/**
 * Subclass of Shape.
 *
 * @author (Paul Kirwan)
 * @version (20 November 2018)
 */
public class Cone extends Shape
{
    public Cone()
    {
        super();
        this.name = "cone ";
    }
    
    @Override
    public String getName()
    {
        return name;
    }
}