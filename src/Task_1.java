import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num rows: ");
        int rows = scanner.nextInt();
        String arr[] = new String[rows];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < rows - i; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("*" + " ");
            System.out.println();
        }
    }
}
/*
* 1. Вывести паттерн в виде треугольника заданной высоты:

   *
 *    *
 ********
 * */