import Models.Animal;

public class Dog extends Animal {

    private static int count;
    private final int run_limit;
    private final int swim_limit;

    public Dog(String name) {
        super(name);
        this.run_limit = 500;
        this.swim_limit = 10;
        count++;
        System.out.println("Появился пёс "+this.name);
    }

    @Override
    public String run(int distance) {
        String result;

        if (distance <= run_limit) {
            result = "Пёс "+this.name+" успешно пробежал "+distance+" метров.";
        } else {
            result = "Пёс "+this.name+" успешно пробежал "+this.run_limit+" метров.\n"+
                     "И очень устал.\n"+
                     "Пёс "+this.name+" не может пробежать больше "+this.run_limit+" метров!";
        }

        return "Пёс "+name+" попытался пробежать "+distance+" метров.\n"+
                result;
    }

    @Override
    public String swim(int distance) {
        String result;

        if (distance <= swim_limit) {
            result = "Пёс "+this.name+" успешно проплыл "+distance+" метров.";
        } else {
            result = "Проплыл "+this.name+" успешно проплыл "+this.swim_limit+" метров.\n"+
                     "И чуть не утонул.\n"+
                     "Пёс "+this.name+" не может проплыть больше "+this.swim_limit+" метров!";
        }

        return "Пёс "+name+" попытался проплыть "+distance+" метров.\n"+
                result;
    }

    public static int getCount() {
        return count;
    }

}
