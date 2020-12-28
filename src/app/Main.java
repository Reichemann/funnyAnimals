package app;

import java.util.Scanner;

import app.model.*;

public class Main {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String... args) {

        System.out.println("Please, select an animal: ");

        System.out.println("1. Dragon.");
        System.out.println("2. Lion.");
        System.out.println("3. Unicorn.");

        int userChoice = in.nextInt();

        var animal = getAnimal(userChoice);

        doActionWithAnimal(animal);

        System.out.println("Thanks! Good luck!");
    }

    private static Animal getAnimal(int userValue) {

        System.out.println("Please, enter animal's stats: ");

        System.out.println("Age: ");
        int animalAge = in.nextInt();
        System.out.println("Weight: ");
        int animalWeight = in.nextInt();
        System.out.println("Height: ");
        int animalHeight = in.nextInt();

        switch (userValue) {

            case 1:
                var dragon = new Dragon(animalAge, animalWeight, animalHeight);
                dragon.printData();
                return dragon;
            case 2:
                var lion = new Lion(animalAge, animalWeight, animalHeight);
                lion.printData();
                return lion;
            case 3:
                var unicorn = new Unicorn(animalAge, animalWeight, animalHeight);
                unicorn.printData();
                return unicorn;
            default:
                System.out.println("Invalid input! Please, restart the program.");
                return null;
        }
    }

    private static void doActionWithAnimal(Animal animal) {

        int userChoice;

        System.out.println("You can get the animal's to do something for you: ");

        System.out.println("1. Say something.");
        System.out.println("2. Eat something.");
        System.out.println("3. Drink something.");

        System.out.println("Your choice: ");

        userChoice = in.nextInt();

        switch (userChoice) {

            case 1:
                animal.say();
                break;
            case 2:
                animal.eat();
                break;
            case 3:
                animal.drink();
                break;
            default:
                System.out.println("Invalid input! Please, restart the program.");
                break;
        }
    }
}