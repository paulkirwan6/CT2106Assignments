
/**
 *
 *
 * @author (Paul Kirwan)
 * @version (23 October 2018)
 */
public class AnimalTest {

    public static void main (String args[]) {
        AnimalTest test = new AnimalTest();
        test.test1();
        test.test2();
    }

    public void test1 () {
        System.out.println("******************* Test 1 *******************");

        //create array of animal objects of length 4
        Animal[] animals = new Animal[4];

        //assign each array slot to each sub-class
        animals[0] = new Shark("Jaws");
        animals[1] = new Trout("James");
        animals[2] = new Canary("Bob");
        animals[3] = new Ostrich("Dave");

        //for each animal, print its attributes and show how it moves
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.move(50);
        }
    }

    public void test2() {
        System.out.println("******************* Test 2 *******************");

        //Initialise the array
        Animal[] animals = new Animal[4];

        //Declare each animal
        Shark shark     = new Shark("Jaws 2");
        Trout trout     = new Trout("Oscar");
        Canary canary   = new Canary("Robert");
        Ostrich ostrich = new Ostrich("Feathers");


        //Add each animal to the array
        animals[0] = shark;
        animals[1] = trout;
        animals[2] = canary;
        animals[3] = ostrich;


        //For each animal, check if it is equal to every animal
        for (Animal animal : animals) {
            System.out.println("Is "+animal.getClass().getSimpleName()+" equal to itself?: "+animal.equals(animal));
            System.out.println("Is "+animal.getClass().getSimpleName()+" equal to Shark?: "+animal.equals(shark));
            System.out.println("Is "+animal.getClass().getSimpleName()+" equal to Trout?: "+animal.equals(trout));
            System.out.println("Is "+animal.getClass().getSimpleName()+" equal to Canary?: "+animal.equals(canary));
            System.out.println("Is "+animal.getClass().getSimpleName()+" equal to Ostrich?: "+animal.equals(ostrich));
            System.out.println("");
        }
    }
}
