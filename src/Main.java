import Models.Animal;

public class Main {

    public static void main(String[] args) {
        Dog sharik = new Dog("Шарик");
        Dog bobik = new Dog("Бобик");
        Cat vasya = new Cat("Вася");

        System.out.println("Количество животных: "+Animal.getCount());
        System.out.println("Количество кошек: "+Cat.getCount());
        System.out.println("Количество собак: "+Dog.getCount());

        Animal.getCount();

        //Тестируем кота
        System.out.println("\n"+vasya.run(200)+"\n");
        System.out.println(vasya.run(300)+"\n");
        System.out.println("Бросили кота "+vasya.getName()+" в воду: \n"
                           +vasya.swim(200)+"\n");

        //Тестируем пса
        System.out.println(sharik.run(200)+"\n");
        System.out.println(sharik.run(600)+"\n");
        System.out.println("Бросили пса "+sharik.getName()+" в воду: \n"
                +sharik.swim(10)+"\n");
        System.out.println("Бросили пса "+sharik.getName()+" в воду: \n"
                +sharik.swim(200));
    }

}
