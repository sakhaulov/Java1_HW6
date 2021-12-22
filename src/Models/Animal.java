package Models;

public abstract class Animal {

    protected String name;
    protected int run_limit;
    protected int swim_limit;
    private static int count;


    public Animal(String name){
        this.name = name;
        count++;
    }

    public String run(int distance) {
        String result;

        if (distance <= run_limit) {
            result = this.name+" успешно пробежал "+distance+" метров.";
        } else {
            result = this.name+" успешно пробежал "+this.run_limit+" метров.\n"+
                    "И очень устал.\n"+
                    this.name+" не может пробежать больше "+this.run_limit+" метров!";
        }

        return this.name+" попытался пробежать "+distance+" метров.\n"+
                result;
    }

    public String swim(int distance) {
        String result;

        if (distance <= swim_limit) {
            result = this.name+" успешно проплыл "+distance+" метров.";
        } else {
            result = this.name+" успешно проплыл "+this.swim_limit+" метров.\n"+
                    "И чуть не утонул.\n"+
                    this.name+" не может проплыть больше "+this.swim_limit+" метров!";
        }

        return this.name+" попытался проплыть "+distance+" метров.\n"+
                result;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return this.name;
    }

}
