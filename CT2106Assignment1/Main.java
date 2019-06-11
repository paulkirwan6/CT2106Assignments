
public class Main {

    public static void main(String[] args) {

        Car car = new Car("Mark7", "PL9", 9, "UP2", 2, "Wichelin8", 8);
        car.setFuel(50);
        car.drive();

        System.out.println("Kilometers Completed = " + car.getKmCompleted() + "Km");

    }// End main

}// End Class Main
