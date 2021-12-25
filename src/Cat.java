import Models.Animal;

public class Cat extends Animal {

    private static int count;

    public Cat(String name) {
        super(name);
        this.run_limit = 200;
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
