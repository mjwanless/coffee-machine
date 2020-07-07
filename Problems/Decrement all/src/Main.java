import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int a, b, c, d;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        a -= 1;
        b -= 1;
        c -= 1;
        d -= 1;

        System.out.println(a + " " + b + " " + c + " " + d);

    }
}