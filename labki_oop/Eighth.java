class Animal {
    void makeSound() {
        System.out.println("animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("gaw");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("uwu");
    }
}




class MathUtils {
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}




class Person {
    void introduce() {
        System.out.println("person");
    }
}

class Student extends Person {
    @Override
    void introduce() {
        super.introduce();
        System.out.println("student");
    }
}




public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();



        MathUtils m = new MathUtils();
        System.out.println(m.multiply(2, 3));
        System.out.println(m.multiply(2.5, 3.5));



        Person p = new Person();
        Student s = new Student();

        p.introduce();
        s.introduce();
    }
}