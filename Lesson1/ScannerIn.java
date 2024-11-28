package Lesson1;

import java.util.Scanner;

public class ScannerIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int myInt = scan.nextInt();
        System.out.println("Вы ввели целое число " + myInt);

        System.out.println("Введите строку");
        String myString = scan.nextLine();
        System.out.println("Вы ввели строку " + myString);
    }

}
