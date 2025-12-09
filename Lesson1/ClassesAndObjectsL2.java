package Lesson1;

public class ClassesAndObjectsL2 {
    public static void main(String[] args) {
        Human person = new Human();
    }
}

class Human{

    private String name;
    private int age;
    public Human(){
        this.age =  0;
        this.name = "John Doe";     //пустой конструктор. Всегда есть, но невидимый
    }

    public Human(String name, int age){ //конструктор
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}