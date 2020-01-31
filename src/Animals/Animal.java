package Animals;

public abstract class Animal implements Animals {

    private int age;
    private int weight;
    private int height;

    public Animal(int age, int weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void say() {

    }

    public void printData() {
        System.out.println("Features: ");
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight);
        System.out.println("Height: " + this.height);
    }
}