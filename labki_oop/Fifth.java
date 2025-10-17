class Main {
    
    static class Animal {
        public void sound() {
            System.out.println("звук");
        }
    }

    static class Dog extends Animal {
        public void sound() {
            System.out.println("гав");
        }
    }

    static class Cat extends Animal {
        public void sound() {
            System.out.println("мяу");
        }
    }



    interface Shape {
        double area();
    }

    static class Circle implements Shape {
        double radius;

        public Circle(double r) {
            radius = r;
        }

        public double area() {
            return 3.14 * radius * radius;
        }
    }

    static class Rectangle implements Shape {
        double width;
        double height;

        public Rectangle(double w, double h) {
            width = w;
            height = h;
        }

        public double area() {
            return width * height;
        }
    }



static class Vehicle {
        public void start() {
            System.out.println("транспорт");
        }
    }

    static class Car extends Vehicle {
        public void start() {
            System.out.println("тачка");
        }
    }

    static class Bike extends Vehicle {
        public void start() {
            System.out.println("вело");
        }
    }



    static abstract class Employee {
        public abstract double calculateSalary();
    }

    static class Manager extends Employee {
        double fixedSalary;

        public Manager(double salary) {
            fixedSalary = salary;
        }

        public double calculateSalary() {
            return fixedSalary;
        }
    }

    static class Developer extends Employee {
        double hoursWorked;
        double hourlyRate;

        public Developer(double hours, double rate) {
            hoursWorked = hours;
            hourlyRate = rate;
        }

        public double calculateSalary() {
            return hoursWorked * hourlyRate;
        }
    }



    static abstract class Appliance {
        public abstract void turnOn();
    }

    static class WashingMachine extends Appliance {
        public void turnOn() {
            System.out.println("стиралка");
        }
    }

    static class Refrigerator extends Appliance {
        public void turnOn() {
            System.out.println("холодос");
        }
    }



    static class Publication {
        public void printDetails() {
            System.out.println("инфо");
        }
    }

    static class Book extends Publication {
        String title;
        String author;

        public Book(String t, String a) {
            title = t;
            author = a;
        }

        public void printDetails() {
            System.out.println(title + author);
        }
    }



    static class Magazine extends Publication {
        String title;
        String issue;

        public Magazine(String t, String i) {
            title = t;
            issue = i;
        }

        public void printDetails() {
            System.out.println(title + issue);
        }
    }

    static class Newspaper extends Publication {
        String name;
        String date;

        public Newspaper(String n, String d) {
            name = n;
            date = d;
        }

        public void printDetails() {
            System.out.println(name + date);
        }
    }




    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();



        Shape s1 = new Circle(3);
        Shape s2 = new Rectangle(4, 5);
        Shape[] shapes = {s1, s2};
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].area());
        }



        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();



        Employee[] employees = {
            new Manager(50000),
            new Developer(160, 250)
        };
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].calculateSalary());
        }



        Appliance[] appliances = {
            new WashingMachine(),
            new Refrigerator()
        };
        for (int i = 0; i < appliances.length; i++) {
            appliances[i].turnOn();
        }


        Publication[] publications = {
            new Book("бук", "аутор"),
            new Magazine("магазин", "2077"),
            new Newspaper("газета", "2077")
        };
        for (int i = 0; i < publications.length; i++) {
            publications[i].printDetails();
        }

    }
}
