import Models.Animal;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog("Шарик");
        animals[1] = new Dog("Бобик");
        animals[2] = new Cat("Вася");

        System.out.println("Всего животных: "+Animal.getCount()+"\n"+
                           "Всего кошек: "+Cat.getCount()+"\n"+
                           "Всего собак: "+Dog.getCount()+"\n");

        for (Animal animal : animals) {
            System.out.println("\n" + animal.run(200) + "\n"+
                               "\n" + animal.run(300) + "\n"+
                               "\n" + animal.run(600) + "\n"+
                               "\n" + animal.swim(10) + "\n"+
                               "\n" + animal.swim(20));

        }
    }
}
