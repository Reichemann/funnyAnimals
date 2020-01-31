package Animals;

public class Dragon extends Animal implements Animals {

    public Dragon(int age, int weight, int height) {
        super(age, weight, height);
    }

    @Override
    public void eat() {
        System.out.println("I`am eating a knight!");
    }

    @Override
    public void drink() {
        System.out.println("I`am drinking lava now!");
    }

    @Override
    public void say() {
        System.out.println("Dare you speak to me mortal?");
    }
}