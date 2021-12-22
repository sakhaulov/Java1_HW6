import Models.Animal;

public class Dog extends Animal {

    private static int count;

    public Dog(String name, int run_limit, int swim_limit) {
        super(name, run_limit, swim_limit);
        count++;
        System.out.println("Появился пёс "+this.name);
    }

    public static int getCount() {
        return count;
    }

}
