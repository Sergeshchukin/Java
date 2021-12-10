class Firstlesson {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 20;
        if (a + b >= 0) {
            System.out.println("Sum is posipive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    public static void printColor() {
        int value = 99;
        if (value <= 0) {
            System.out.println("red"); 
        } if (value > 100) {
                System.out.println("green");
        } else {
                System.out.println("yellow");
            }
        }

        public static void compareNumbers () {
            int a = 50;
            int b = 25;
            if (a >= b) {
                System.out.println(a >= b);
            } else {
                System.out.println(a <= b);
            }
        }
    }


