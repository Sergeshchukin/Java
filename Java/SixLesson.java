/*
*
*  @author Sergey Shchukin
*  @version 03.01.2022
*
*/


public class SixLesson {
    public static void main(String[] args) {

        Cat cat = new Cat("Murzik", "grey", 7, 200);
        Dog dog = new Dog("Sharik", "black", 6, 500);
        cat.drift();
        cat.move();
        dog.drift();
        dog.move();
        System.out.println("all god " + Dog.countDog);
        System.out.println("all cat " + Cat.countCat);
        System.out.println("all animal " + Animal.countAnimal);

    }


    public abstract class Animal {
        protected String name;
        protected String color;
        protected int age;
        protected int obstacles;
        int maxMove;
        int maxDrift;


        Animal(String name, String color, int age, int obstacles) {
            this.name = name;
            this.color = color;
            this.age = age;
            this.obstacles = obstacles;
            this.maxMove = 0;
            this.maxDrift = 0;
            countAnimal++;

        }

        public static int countAnimal = 0;

        void move() {
            if (maxMove <= 0)
                System.out.println(name + " cant run");
            else if (maxMove >= obstacles)
                System.out.println(name + " run " + obstacles + "m ");
            else
                System.out.println("for " + name + " to long distance");

        }

        void drift() {
            if (maxDrift <= 0)
                System.out.println(name + " cant swim");
            else if (maxDrift >= obstacles)
                System.out.println(name + " swim " + obstacles + "m ");
            else
                System.out.println("for " + name + " to long distance");
        }
    }

    public class Cat extends Animal {
        Cat(String name, String color, int age, int obstacles) {
            super(name, color, age, obstacles);
            this.maxMove = 500;
            this.maxDrift = 2;
            countCat++;
        }

        public static int countCat = 0;

    }

    public class Dog extends Animal {
        Dog(String name, String color, int age, int obstacles) {
            super(name, color, age, obstacles);
            this.maxMove = 500;
            this.maxDrift = 10;
            countDog++;
        }

        static int countDog = 0;
    }
}
