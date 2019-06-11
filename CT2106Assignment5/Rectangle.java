/**
 * Subclass of Shape.
 *
 * @author (Paul Kirwan)
 * @version (20 November 2018)
 */
public class Rectangle extends Shape
{
    public Rectangle()
    {
        super();
        this.name = "rectangle ";
    }
    
    @Override
    public String getName()
    {
        return name;
    }
}