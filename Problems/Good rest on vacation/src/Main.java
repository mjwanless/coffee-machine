import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int durationDays = scanner.nextInt();
        int totalFoodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int costNightInHotel = (scanner.nextInt() * (durationDays - 1));

        System.out.println((durationDays * totalFoodCostPerDay) + (oneWayFlightCost * 2) + costNightInHotel);




    }
}