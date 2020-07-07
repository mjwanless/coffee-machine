import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int sizeArray = scanner.nextInt();
        int sum = 0;
        int[] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int value : array) {
            sum += value;
        }

        System.out.println(sum);





    }
}