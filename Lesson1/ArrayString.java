package Lesson1;

public class ArrayString {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[3] = 5;
        String[] strings = new String[3];
        strings[0] = "Привет";
        strings[1] = "Как дела?";
        strings[2] = "Что нового?";

        for(int i = 0; i < strings.length; i++){ //ниже аналог через for each
            System.out.println(strings[i]);
        }

        for (String string:strings) {  //Задаем тип переменной, имя переменной: ссылаемся на массив
            System.out.println(string);
        }
    }

}
