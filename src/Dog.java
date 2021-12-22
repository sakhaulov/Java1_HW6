import Models.Animal;

public class Dog extends Animal {

    private static int count;

    public Dog(String name) {
        super(name);
        this.run_limit = 500;
        this.swim_limit = 10;
        count++;
        System.out.println("Появился пёс "+this.name);
    }

    public static int getCount() {
        return count;
    }

}
