package Lesson1;

import java.util.Scanner;

//switch case используем когда много условий
public class SwitchCaseEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        switch (age){ //можно задавать и строки
            case 0:
                System.out.println("Вы не родились");
                break;
            case 18:
                System.out.println("Вы совершеннолетний");
                break;
            default:
                System.out.println("Не попал в возраст");
        }

    }
}
