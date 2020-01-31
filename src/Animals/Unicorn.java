package Animals;

public class Unicorn extends Animal implements Animals {

    public Unicorn(int age, int weight, int height) {
        super(age, weight, height);
    }

    @Override
    public void eat() {
        System.out.println("I`am eating grass now!");
    }

    @Override
    public void drink() {
        System.out.println("I`am drinking a rainbow now!");
    }

    @Override
    public void say() {
        System.out.println("Come with me traveler!");
    }
}