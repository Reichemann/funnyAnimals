import java.util.Scanner;
import Animals.Animal;
import Animals.Dragon;
import Animals.Lion;
import Animals.Unicorn;

public class Main {

    static Dragon someDragon;
    static Lion someLion;
    static Unicorn someUnicorn;

    static int userMainChoice;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please, select any animal: ");

        System.out.println("1. Dragon.");
        System.out.println("2. Lion.");
        System.out.println("3. Unicorn.");

        userMainChoice = in.nextInt();

        someActionWithAnimal(setSomeAnimal(userMainChoice));

        System.out.println("Thanks! Good Luck!");
    }

    public static Animal setSomeAnimal(int userValue) {

        int userChoice = 0;

        Scanner animalIn = new Scanner(System.in);

        System.out.println("Please, enter animal`s stats: ");
        System.out.println("Age: ");
        int animalAge = animalIn.nextInt();
        System.out.println("Weight: ");
        int animalWeight = animalIn.nextInt();
        System.out.println("Height: ");
        int animalHeight = animalIn.nextInt();

        switch(userValue) {
            case 1:
                someDragon = new Dragon(animalAge, animalWeight, animalHeight);
                someDragon.printData();
                return someDragon;
            case 2:
                someLion = new Lion(animalAge, animalWeight, animalHeight);
                someLion.printData();
                return someLion;
            case 3:
                someUnicorn = new Unicorn(animalAge, animalWeight, animalHeight);
                someUnicorn.printData();
                return someUnicorn;
            default:
                System.out.println("Invalid input! Please, restart the program.");
                break;
        }

        return null;
    }

    public static void someActionWithAnimal(Animal someAnimal) {

        int userChoice = 0;

        Scanner animalIn = new Scanner(System.in);

        System.out.println("You can get the animal`s to do some things for you.");

        System.out.println("1. Say something.");
        System.out.println("2. Eat something.");
        System.out.println("3. Drink something.");

        System.out.println("Your choice: ");

        userChoice = animalIn.nextInt();

        switch(userChoice) {

            case 1:
                someAnimal.say();
                break;
            case 2:
                someAnimal.eat();
                break;
            case 3:
                someAnimal.drink();
                break;
            default:
                System.out.println("Invalid input! Please, restart the program.");
                break;
        }
    }
}
