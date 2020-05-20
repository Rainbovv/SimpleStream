import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dish;
        double price;
        byte quantity;
        double finalPrice = 0;

        try {
            FileWriter fw = new FileWriter("orders.txt");
            fw.write("Pizza 75,00 2\nKebab 45,00 1\nCola 9,50 3");
            fw.close();
        } catch (IOException e) {
            System.err.println("CANNOT CREATE A FILE!");
        }

        try {
            File file = new File("orders.txt");
            Scanner in = new Scanner(file);

            System.out.println("\n-------------------------\nYou ordered:\n");
            for (int i = 0; i < 3; i++) {
                dish = in.next();
                price = in.nextDouble();
                quantity = in.nextByte();
                finalPrice += price * quantity;
                System.out.printf("%-15s %d x %5.2f%n", dish, quantity, price);
            }
            System.out.printf("%nFinal price %13.2f%n-------------------------%n", finalPrice);

        } catch (FileNotFoundException e) {
            System.err.println("FILE DOES NOT EXIST!");

        } catch (InputMismatchException e) {
            System.err.println("WRONG FILE FORMAT!");
        }
    }
}