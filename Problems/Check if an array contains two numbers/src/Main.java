import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        boolean nextToFlag = false;

        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] == m) {
                if (array[i + 1] == n) {
                    nextToFlag = true;
                }
            }
        }

        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] == n) {
                if (array[i + 1] == m) {
                    nextToFlag = true;
                }
            }
        }

        System.out.println(nextToFlag);

    }
}