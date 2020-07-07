import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int a = scanner.nextInt();
        int newInt = 0;
        int lastInt;

        lastInt = (a % 10);
        a /= 10;
        newInt += lastInt;
        newInt *= 10;
        lastInt = (a % 10);
        a /= 10;
        newInt += lastInt;
        newInt *= 10;
        lastInt = (a % 10);
        a /= 10;
        newInt += lastInt;


        System.out.println(newInt);




    }
}