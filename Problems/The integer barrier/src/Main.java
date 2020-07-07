import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int currentNumber = scanner.nextInt();
        int sum = 0;

        while (currentNumber != 0) {
            sum += currentNumber;
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
            currentNumber = scanner.nextInt();
        }

        System.out.println(sum);



    }
}