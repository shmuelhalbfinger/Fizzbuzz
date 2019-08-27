package fizzbuzz;

import java.util.*;

public class Fizzbuzz {

    static Scanner k = new Scanner(System.in);

    public static void printFizzbuzz(int i) {
        if (i % 3 == 0) {
            if (i % 5 == 0) {
                System.out.print("Fizz Buzz");
            } else {
                System.out.print("Fizz");
            }
        } else if (i % 5 == 0) {
            System.out.print("Buzz");
        } else {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            printFizzbuzz(i);
            System.out.println(",");
        }

        int num;
        System.out.println("Enter a number: ");
        num = k.nextInt();
        printFizzbuzz(num);
        System.out.println();
    }

}
