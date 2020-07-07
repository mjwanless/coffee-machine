import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if ((x + y == 20) || (y + z == 20) || (x + z == 20)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}