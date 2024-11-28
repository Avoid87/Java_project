package Lesson1;

import java.util.Scanner;

public class For {
    //Таблица умножения с циклом for
    public static void main(String[] args) {
        int k;
        int i = 1;
        int p = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите множитель ниже и нажмите Enter:");
        k = in.nextInt();
        System.out.println("Вывожу таблицу умножения на " + k);
        for(i = 1; i <= 9; i++) {
            p = i * k;
            System.out.println(i + " x " + k + " = " + p);
        }
    }
}
