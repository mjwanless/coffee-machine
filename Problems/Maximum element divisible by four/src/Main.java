import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int numOfElements = scanner.nextInt();
        int element;
        int maxValue = 0;

        for (int i = 1; i <= numOfElements; i++) {
            element = scanner.nextInt();
            if (element % 4 == 0) {
                if (element > maxValue) {
                    maxValue = element;
                }
            }
        }

        System.out.println(maxValue);



    }
}