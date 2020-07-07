import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        int maxValue1;
        int maxValue2;

        maxValue1 = Math.max(a, b);
        maxValue2 = Math.max(maxValue1, c);

        if (maxValue2 == a) {
            return 1;
        } else if (maxValue2 == b) {
            return 2;
        } else {
            return 3;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}