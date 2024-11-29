package Lesson1;
//массив - ссылочный тип данных
public class Array {
    public static void main(String[] args) {
        //присваиваем переменной number массив
        int[] number = new int[5]; //индексы в массиве начинаются с нуля

        //помещаем в индекс 4 число 10
        number[4] = 10;
        //заполняем массив через for
        for(int i = 0; i<number.length; i++)
        {
            number[i] = i;
            System.out.println(number[i]);
        }
        //помещаем конкретные числа в массив
        int[] num = {0,1,2,3,4,5};
        }
}

