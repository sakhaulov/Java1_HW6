import Models.Animal;

public class Dog extends Animal {

    private static int count;

    public Dog(String name) {
        super(name);
        count++;
        System.out.println("Появился пёс "+this.name);
    }

    @Override
    public String run(int distance) {
        String result;
        int limit = 500;

        if (distance <= limit) {
            result = "Пёс "+this.name+" успешно пробежал "+distance+" метров.";
        } else {
            result = "Пёс "+this.name+" успешно пробежал "+limit+" метров.\n"+
                     "И очень устал.\n"+
                     "Пёс "+this.name+" не может пробежать больше "+limit+" метров!";
        }

        return "Пёс "+this.name+" попытался пробежать "+distance+" метров.\n"+
                result;
    }

    @Override
    public String swim(int distance) {
        String result;
        int limit = 10;

        if (distance <= limit) {
            result = "Пёс "+this.name+" успешно проплыл "+distance+" метров.";
        } else {
            result = "Проплыл "+this.name+" успешно проплыл "+limit+" метров.\n"+
                     "И чуть не утонул.\n"+
                     "Пёс "+this.name+" не может проплыть больше "+limit+" метров!";
        }

        return "Пёс "+this.name+" попытался пробежать "+distance+" метров.\n"+
                result;
    }

    public static int getCount() {
        return count;
    }

}
