import Models.Animal;

public class Cat extends Animal {

    private static int count;

    public Cat(String name, int run_limit, int swim_limit) {
        super(name, run_limit, swim_limit);
        count++;
        System.out.println("Появился кот "+this.name);
    }

    @Override
    public String swim(int distance) {
        return "Кот "+this.name+" попытался проплыть "+distance+" метров.\n"+
               "Кот "+this.name+" не умеет плавать!\n"+
               "Кот "+this.name+" чуть не утонул!";
    }

    public static int getCount() {
        return count;
    }

}
