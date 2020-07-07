import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        boolean ascending = true;
        boolean descending = true;
        int currentNumber = scanner.nextInt();
        int previousNumber = currentNumber;

        while (currentNumber != 0) {
            if (currentNumber > previousNumber) {
                descending = false;
            }
            if (currentNumber < previousNumber) {
                ascending = false;
            }
            previousNumber = currentNumber;
            currentNumber = scanner.nextInt();
        }

        System.out.println(ascending || descending);

        scanner.close();
    }
}