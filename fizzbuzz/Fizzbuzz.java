package fizzbuzz;

public class Fizzbuzz {

    public static void printFizzbuzz(int i) {
        if (i % 3 == 0) {
            if (i % 5 == 0) {
                System.out.print(Integer.toString(i) + "- Fizz Buzz");
            } else {
                System.out.print(Integer.toString(i) + "- Fizz");
            }
        } else if (i % 5 == 0) {
            System.out.print(Integer.toString(i) + "- Buzz");
        } else {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            printFizzbuzz(i);
            System.out.println(",");
        }
    }

}
