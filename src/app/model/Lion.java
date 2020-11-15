package app.model;

public class Lion extends Animal implements Animals {

    public Lion(int age, int weight, int height) {
        super(age, weight, height);
    }

    @Override
    public void eat() {
        System.out.println("I`am eating an antelope!");
    }

    @Override
    public void drink() {
        System.out.println("I`am drinking water now!");
    }

    @Override
    public void say() {
        System.out.println("AAAARGGGHHHT!");
    }
}