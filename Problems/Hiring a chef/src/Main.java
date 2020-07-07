//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);

        String firstName = input.next();
        int age = input.nextInt();
        String stageOfEducation = input.next();
        int yearsOfExperience = input.nextInt();
        String cuisinePreference = input.next();

        System.out.println("The form for " + firstName + " is completed."
        + " We will contact you if we need a chef that cooks " + cuisinePreference
        + " dishes.");



    }
}