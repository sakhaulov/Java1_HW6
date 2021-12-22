import Models.Animal;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];


        animals[0] = new Dog("Шарик", 500, 10);
        animals[1] = new Dog("Бобик", 500, 10);
        animals[2] = new Cat("Вася", 200, 0);

        for (Animal animal : animals) {
            System.out.println("\n" + animal.run(200) + "\n");
            System.out.println(animal.run(300) + "\n");
            System.out.println(animal.run(600) + "\n");
            System.out.println(animal.swim(10) + "\n");
            System.out.println(animal.swim(20));
        }

    }

}
