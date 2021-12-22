package Models;

public abstract class Animal {

    protected String name;
    private static int count;

    public Animal(String name){
        this.name = name;
        count++;
    }

    public abstract String run(int distance);

    public abstract String swim(int distance);

    public static int getCount() {
        return count;
    }

    public String getName() {
        return this.name;
    }

}
