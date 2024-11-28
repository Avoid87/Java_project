package Lesson1;
//Проверка, является ли число положительным
public class If {
    public static void main(String[] args) {
        int myInt = 0;
        if (myInt > 0){
            System.out.println("True");
        } else if (myInt < 0) {
            System.out.println("False");
        } else {
            System.out.println("Zero");
        }
    }
}
