import Models.Animal;

public class Cat extends Animal {

    private static int count;
    private final int run_limit;

    public Cat(String name) {
        super(name);
        this.run_limit = 200;
        count++;
        System.out.println("Появился кот "+this.name);
    }

    @Override
    public String run(int distance) {
        String result;

        if (distance <= run_limit) {
            result = "Кот "+this.name+" успешно пробежал "+distance+" метров.";
        } else {
            result = "Кот "+this.name+" успешно пробежал "+this.run_limit+" метров.\n"+
                     "И очень устал.\n"+
                     "Кот "+this.name+" не может пробежать больше "+this.run_limit+" метров!";
        }

        return "Кот "+this.name+" попытался пробежать "+distance+" метров.\n"+
               result;
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
