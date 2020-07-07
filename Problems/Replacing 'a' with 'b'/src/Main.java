import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner input = new Scanner(System.in);

        String replacementString = input.nextLine();

        replacementString = replacementString.replace('a', 'b');

        System.out.println(replacementString);

    }
}