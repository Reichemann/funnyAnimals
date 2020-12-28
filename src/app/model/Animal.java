package app.model;

public abstract class Animal implements Animals {

    private final int age;
    private final int weight;
    private final int height;

    public Animal(int age, int weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public abstract void eat();

    @Override
    public abstract void drink();

    @Override
    public abstract void say();

    public void printData() {
        System.out.println("Features: ");
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight);
        System.out.println("Height: " + this.height);
    }
}