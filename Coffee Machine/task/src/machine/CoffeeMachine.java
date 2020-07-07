package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int cups = 9;
        int beans = 120;
        int milk = 540;
        int money = 550;
        String choice;
        boolean exit = false;

        while (!exit) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            choice = scanner.next().toLowerCase();

            switch (choice) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String userChoice = scanner.next().toLowerCase();
                    switch (userChoice) {
                        case "1":
                            if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            if (beans < 16) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            }
                            if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 250;
                            beans -= 16;
                            money += 4;
                            cups -= 1;
                            break;
                        case "2":
                            if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }
                            if (beans < 20) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            }
                            if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 350;
                            milk -= 75;
                            beans -= 20;
                            money += 7;
                            cups -= 1;
                            break;
                        case "3":
                            if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }
                            if (beans < 12) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            }
                            if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 200;
                            milk -= 100;
                            beans -= 12;
                            money += 6;
                            cups -= 1;
                            break;
                        case "back":
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add: ");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add: ");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    cups += scanner.nextInt();
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has: ");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(beans + " of beans");
                    System.out.println(cups + " of cups");
                    System.out.println("$" + money + " of money");
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        scanner.close();
    }
}
