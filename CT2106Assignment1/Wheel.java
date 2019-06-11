
public class Wheel {

    private int radius;
    private String name;
    private double circumference;

    public Wheel(String name, int radius) {

        this.name = name;
        this.radius = radius;
        circumference = (2*Math.PI*this.radius);

    }// End Constructor

    public double getCircumference() { // Turn Method
        return circumference;
    }// End getDistance

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

}// End Class Wheel
