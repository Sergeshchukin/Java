/**
 * Java 1. Homework #2
 *
 * @author Sergey Shchukin
 * @version 13.12.2021
 *
 */
class Secondlesson {
    public static void main(String[] args) {
        System.out.println(checkSum(5,6));
        System.out.println(checkPosNum(10,-20));
        System.out.println(checkNegNum(1,3));
        printString(10);
    }

    static String checkSum(int a, int b) {
        return (a + b > 10) && (a + b < 20) ? "Sum is positive" : "Sum is negative";
    }

    static String checkPosNum(int a, int b) {
        return a + b >= 0 ? "true" : "false";
    }

    static String checkNegNum(int a, int b) {
        return a + b < 0 ? "true" : "false";
    }
    
    static void printString(int j) {
        for (int i = 0; i < j; i++) {
        System.out.println("i = " + i);  
    }
    }
}