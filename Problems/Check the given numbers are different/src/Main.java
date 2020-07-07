import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if ((x == y) || (y == z) || (x == z)) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

    }
}