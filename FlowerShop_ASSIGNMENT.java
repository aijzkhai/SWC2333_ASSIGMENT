import java.util.Scanner;

public class FlowerShop_ASSIGNMENT {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Flower_ASSIGNMENT[] flowerArr = new Flower_ASSIGNMENT[10];

        // Declare variables outside the loop for better efficiency
        String name;
        String color;
        double price;
        int quantity;

        for (int i = 0; i < flowerArr.length; i++) {
            System.out.println("\n\nEnter Flower Name " + (i + 1) + ":");
            name = input.nextLine();

            System.out.println("Enter Color Type (B for Blue, V for Violet, G for Green, R for Red, AC for Assorted): ");
            color = input.nextLine();
            color = color.toUpperCase(); // Convert to uppercase for easier comparison

            System.out.println("Enter Price: ");
            price = input.nextDouble();

            System.out.println("Enter Quantity: ");
            quantity = input.nextInt();
            input.nextLine(); // Consume remaining newline character

            flowerArr[i] = new Flower_ASSIGNMENT(name, color, price, quantity);

            System.out.println(flowerArr[i].toString());
        }

        int countB = 0, countV = 0, countG = 0, countR = 0, countAC = 0;

        for (Flower_ASSIGNMENT flower : flowerArr) {
            String flowerColor = flower.getColor();
            if (flowerColor.equals("BLUE")) {
                countB++;
            } else if (flowerColor.equals("VIOLET")) {
                countV++;
            } else if (flowerColor.equals("GREEN")) {
                countG++;
            } else if (flowerColor.equals("RED")) {
                countR++;
            } else if (flowerColor.equals("ASSORTED COLORS")) {
                countAC++;
            } else {
                System.out.println("Invalid color input. Please try again.");
            }
        }

        System.out.println("Count for Blue: " + countB);
        System.out.println("Count for Violet: " + countV);
        System.out.println("Count for Green: " + countG);
        System.out.println("Count for Red: " + countR);
        System.out.println("Count for Assorted Colors: " + countAC);

        boolean found = false;
        int foundIndex = 0;

        // More comprehensive search using a set of desired flower names
        String[] desiredFlowers = {"Tulip", "Dahlia", "Rose", "Daisy", "Aster"};
        for (int i = 0; i < flowerArr.length; i++) {
            Flower_ASSIGNMENT flower = flowerArr[i];
            for (String desiredFlower : desiredFlowers) {
                if (flower.getName().equalsIgnoreCase(desiredFlower)) {
                    found = true;
                    foundIndex = i;
                    break; // Exit both loops if found
                }
            }
            if (found) {
                break; // Exit outer loop if found
            }
        }

        if (found) {
            switch (flowerArr[foundIndex].getName()) {
                case "Tulip":
                    flowerArr[foundIndex].setAllData("Tulip", null, 10.50, 0);
                    break;
                case "Rose":
                    flowerArr[foundIndex].setAllData("Rose", null, 15.50, 0);
                    break;
                case "Dahlia":
                    flowerArr[foundIndex].setAllData("Dahlia", null, 12.50, 0);
                    break;
                case "Daisy":
                    flowerArr[foundIndex].setAllData("Daisy", null, 14.50, 0);
                    break;
                case "Aster":
                    flowerArr[foundIndex].setAllData("Aster", null, 17.50, 0);
                    break;
                default:
                    System.out.println("Unexpected flower name: " + flowerArr[foundIndex].getName());
            }

            System.out.println(flowerArr[foundIndex].toString());
        }
    }
}
