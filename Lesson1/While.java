package Lesson1;

import java.util.Scanner;

public class While {
    //Таблица умножения с циклом while
    public static void main(String[] args) {
        int k;
        int i = 1;
        int p = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите множитель ниже и нажмите Enter:");
        k = in.nextInt();
        System.out.println("Вывожу таблицу умножения на " + k);
        while (i <= 9) {
             p = i * k;
            System.out.println(i + " x " + k + " = " + p);
            i += 1;
        }
        //Пример do while
        do {
            System.out.println("Введите множитель ниже и нажмите Enter:");
            k = in.nextInt();
        } while (k != 5);
    }

}