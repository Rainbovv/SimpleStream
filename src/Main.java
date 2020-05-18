import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String dish;
        double price;
        byte quantity;
        double finalPrice = 0;

        File file = new File("src/orders.txt");

        if (!file.exists()) System.err.println("FILE DOES NOT EXIST!");
        else {
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
        }
    }
}
//    Написать код в main() который проверит если данный файл доступен (метод .exists() - класс File)
//        - и если нет - выдаст ошибку на экране!
//
//        При помощи цикла for который повториться ровно 3 раза (у нас в файле 3 строки), прочитает
//        значения в виде 3-х переменных и выведет на экран список вот этих заказанных блюд.
//
//        При выводе внутри цикла, вычислит так же общую стоимость и распечатает в конце в 4-й строке