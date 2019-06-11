public class Car {

     private String name;
     private double kmCompleted;
     private Engine engine;
     private Door door;

     public Car(String name, String eng, int fuelEff, String drName, int drNum, String whNm, int rad)
     {
         this.name = name;
         engine = new Engine(eng,fuelEff, whNm, rad);
         door = new Door(drName, drNum);
     }// End Constructor

     public void setFuel(int fuel) {
         this.engine.setFuelLevel(fuel);
     }// End setFuel

     public void drive() {

         while ((engine.getFuelLevel())>0) {

             kmCompleted += (engine.getWheel().getCircumference())*(engine.getFuelEff());
             engine.setFuelLevel((engine.getFuelLevel()-1));

         }// End while

     }// End drive

     public String getName() {
         return this.name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public double getKmCompleted() {
         return this.kmCompleted;
     }

     public void setKmCompleted(double kmCompleted) {
         this.kmCompleted = kmCompleted;
     }

     public Engine getEngine() {
         return this.engine;
     }

     public void setEngine(Engine engine) {
         this.engine = engine;
     }

     public Door getDoor() {
         return this.door;
     }

     public void setDoor(Door door) {
         this.door = door;
     }

}// End Class Car

