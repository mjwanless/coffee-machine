import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int currentNumber;
        int max = 0;

        do {
            currentNumber = scanner.nextInt();
            if(currentNumber > max) {
                max = currentNumber;
            }
        } while (currentNumber != 0);

        System.out.println(max);




    }
}