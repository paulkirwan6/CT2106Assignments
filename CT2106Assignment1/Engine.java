public class Engine {

    private double fuelLevel;
    private String name;
    private double fuelEff; // Turns per Litre
    private Wheel wheel;

    public Engine(String name, int fuelEff, String whName, int rad) {
        this.fuelEff = fuelEff;
        this.name = name;
        wheel = new Wheel(whName, rad);
    }// End Constructor

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelEff() {
        return fuelEff;
    }

    public void setFuelEff(double fuelEff) {
        this.fuelEff = fuelEff;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

}// End Class Engine