package Models;

public abstract class Animal {

    protected String name;
    private static int count;

    public Animal(String name){
        this.name = name;
        count++;
    }

    protected abstract String run(int distance);

    protected abstract String swim(int distance);

    public static int getCount() {
        return count;
    }

    public String getName() {
        return this.name;
    }

}
