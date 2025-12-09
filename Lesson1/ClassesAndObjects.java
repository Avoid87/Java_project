package Lesson1;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person= new Person();

        person.setName("Ivan");
        person.setAge(22);

        System.out.println(person.getAge());
        System.out.println(person.getName());

        person.speak(); //вызов метода
        person.yearsToRet();
        int years = person.yearsToRet(); //присвоение возвращенного значения
        System.out.println("Моя пенсия через " + years);
    }
}
class Person {
    //У класса могут быть:
    // 1. Данные (поля)
    // 2. Дейстивия, которые он может совершать (методы)
    private String name; //private  - переменная только внутри класса
    private int age;
    void speak(){ //void не возвращает ничего
        System.out.println("Меня зовут " + name + ", " + "мой возраст - " + age);
    }
    int yearsToRet(){ //возвращает целочисленные значения
        int years = 65 - age;
        return years;
    }
//сеттер - устанавливает имя
    public void setName(String userName){
        if (userName.isEmpty()){ //проверка на пустоту
            System.out.println("Ты ввел пустое имя");
        } else{
            name = userName;
        }
    }
    //геттер - возвращает имя
    public String getName() {
        return name;
    }
    public void setAge(int userAge){
        if(userAge < 0){
            System.out.println("Ты ввел некорректный возраст");
        } else{
            age = userAge;
        }
    }
    public int getAge(){
        return age;
    }
}
