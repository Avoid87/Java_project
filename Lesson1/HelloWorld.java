package Lesson1;

import java.util.Scanner;

public class HelloWorld {
    private static String name = null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        name =  in.nextLine();
        System.out.println(name);
        int x = 0;
        System.out.println(x);
    }
}
