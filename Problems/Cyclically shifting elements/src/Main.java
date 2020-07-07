import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //setting array size
        int arraySize = scanner.nextInt();
        int[] a = new int[arraySize];
        int[] copyArray = new int[arraySize];

        // filling array with values
        for (int i = 0; i< a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.arraycopy(a, 0, copyArray, 0, arraySize);
        System.arraycopy(copyArray, 0, a, 1, arraySize - 1);
        System.arraycopy(copyArray, arraySize-1, a, 0, 1);

        //outputting all values on a single line
        for (int item : a) {
            System.out.print(item + " ");
        }
    }
}