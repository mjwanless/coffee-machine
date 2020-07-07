import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String shape = scanner.next();
        double a;
        double b;
        double c;
        double r;
        double p;

        switch (shape) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                p = ((a + b + c) / 2);
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                r = scanner.nextDouble();
                System.out.println((r * r) * 3.14);
                break;
            default:
                System.out.println("Invalid value chosen.");
                break;
            }

            scanner.close();
        }

}