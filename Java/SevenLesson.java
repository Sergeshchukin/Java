/*
*
* @author Sergey Shchukin
* @version 10.01.2022
*
*/

public class SevenLesson {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasya", 1);
        Cat secondCat = new Cat("Barsik", 2);
        Cat[] cats = {new Cat("black", 6), new Cat("grey", 8), new Cat("white", 5), new Cat("orange", 2)};
        Plate plate = new Plate(20);


        plate.showInfo();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eatFrom(plate);
            cats[i].showInfo();
        }


        plate.showInfo();
        plate.addEat(20);
        plate.showInfo();
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = false;

    }

    public void eatFrom(Plate plate) {
        hungry |= plate.decreaseFood(appetite);

    }

    public void showInfo() {
        if (hungry){
            System.out.println(name + " well-fed");
                    }  else
            System.out.println(name + " hungry");
            }

}

class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int appetite) {
        if (appetite > food) {
            if (!countFood) {
                System.out.println("Need more eat");
                countFood = true;
            }
            return false;
        }
        else {
            food -= appetite;
            return true;
        }
    }
    public boolean countFood = false;

    public void showInfo() {
        System.out.println("plate: " + food);
    }
    public void addEat(int kittyCat){

        if (kittyCat >= 0){
            food += kittyCat;
            System.out.println(kittyCat + " added to plate");
        }

        else
            System.out.println("dont touch eat");
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // WITHOUT ENCAPSULATION (CLASS CONTEXT)
    public static double getDistanceBetween(Point p1, Point p2) {
        int dx = p1.x - p2.x;
        int dy = p1.y - p2.y;

        return Math.sqrt(dx*dx + dy*dy);
    }

    // WITH ENCAPSULATION (OBJECT CONTEXT)
    public double getDistanceTo(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;

        return Math.sqrt(dx*dx + dy*dy);
    }
}
