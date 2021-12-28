/*
*
*
* @author Sergey Shchukin
* @version 28.12.2021
*
*/

import java.util.Scanner;
import java.util.Random;

public class FourLesson {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static void main(String[] agrs) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (isWinner(DOT_X)) {
                System.out.println("YOU WON");
                break;
            }
            if (isMapFull()) {
                System.out.println("DRAW");
                break;
            }
            aiTurn(); // ход робота
            printMap();
            if (isWinner(DOT_O)) {
                System.out.println("AI WON");
                break;
            }
            if (isMapFull()) {
                System.out.println("DRAW");
                break;
            }
        }
        System.out.println("GAME OVER");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        do {
            System.out.println("input X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println();
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true; //
        return false;
    }

    public static boolean isWinner(char symb) {
        boolean first = true;
        boolean second = true;
        for(int i = 0; i < SIZE; i++)
        {
            first &= map[i][i]==symb;
            second &= map[i][(SIZE-1)-i] ==symb;
            if (map[i][1]==symb&&map[i][2]==symb&&map[i][3]==symb&&map[i][4]==symb) return true;
            if (map[i][0]== symb&&map[i][1]==symb&&map[i][2]==symb&&map[i][3]==symb) return true;
            if (map[1][i]==symb&&map[2][i]==symb&&map[3][i]==symb&&map[4][i]==symb) return true;
            if (map[0][i]== symb&&map[1][i]==symb&&map[2][i]==symb&&map[3][i]==symb) return true;
        }
        return first||second;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}
