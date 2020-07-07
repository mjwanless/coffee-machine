import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        // array declaration
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        //elements of the array

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // two integers: m and n
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // flag for if m/n exist beside each other in array.
        boolean notNextTo = true;

        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] == n) {
                if (array[i+1] == m) {
                    notNextTo = false;
                    break;
                }
            }
        }

        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] == m) {
                if (array[i+1] == n) {
                    notNextTo = false;
                    break;
                }
            }
        }

        System.out.println(notNextTo);
    }
}