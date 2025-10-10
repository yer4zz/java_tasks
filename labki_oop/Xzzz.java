public class Car {
    private String marka;
    private int year;
    private double price;

    public Car(String marka, int year, double price) {
        this.marka = marka;
        this.year = year;
        this.price = price;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println(marka);
        System.out.println(year);
        System.out.println(price);
    }

    public static void main(String[] args) {

        Car myCar = new Car("Corvette", 2017, 17000);

        myCar.displayInfo();
    }
}




public class Employee {
    private String name;
    private int age;
    private double zarplata;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.zarplata = 50000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getZarplata() {
        return zarplata;
    }

    public void setZarplata(double zarplata) {
        this.zarplata = zarplata;
    }

    public double godovoyZarplata() {
        return zarplata * 12;
    }

    public void displayInfo() {
        System.out.println("name " + name);
        System.out.println("age " + age);
        System.out.println("zarplata " + zarplata);
        System.out.println("godovoyZarplata " + godovoyZarplata());
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Era", 30);

        employee.displayInfo();
    }
}




public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        } else {
            System.out.println("length < 0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        } else {
            System.out.println("width < 0");
        }
    }

    public double perimetr() {
        return (length + width) * 2;
    }

    public double ploshad() {
        return length * width;
    }

    public void displayInfo() {
        System.out.println("length " + length);
        System.out.println("width " + width);
        System.out.println("perimetr " + perimetr());
        System.out.println("ploshad " + ploshad());
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);

        r1.displayInfo();
        System.out.println();
    }
}



public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        } else {
            System.out.println("length < 0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        } else {
            System.out.println("width < 0");
        }
    }

    public double perimetr() {
        return (length + width) * 2;
    }

    public double ploshad() {
        return length * width;
    }

    public void displayInfo() {
        System.out.println("length " + length);
        System.out.println("width " + width);
        System.out.println("perimetr " + perimetr());
        System.out.println("ploshad " + ploshad());
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);

        r1.displayInfo();
        System.out.println();
    }
}




public class BankAccount {
    private double balance;
    private double prosent;

    public BankAccount(double balance) {
        this.balance = balance;
        this.prosent = 0.2;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            balVithDep();
        } else {
            System.out.println("amount < 0");
        }
    }

    private void balVithDep() {
        balance += balance * prosent;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1000.0);

        System.out.println(ba.getBalance());

        ba.deposit(500.0);

        System.out.println(ba.getBalance());
    }
}




public class Product {
    private String name;
    private double price;
    private int count;

    public Product(String name, double price, int count) {
        this.name = name;
        setPrice(price);
        this.count = count;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("price < 0");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setCount(int count) {
        if (count >= 0) {
            this.count = count;
        } else {
            System.out.println("count < 0");
        }
    }

    public int getCount() {
        return count;
    }

    public String getame() {
        return name;
    }

    public void produktInfo() {
        System.out.println("name " + name);
        System.out.println("price " + price);
        System.out.println("count " + count);
    }

    public static void main(String[] args) {
        Product product = new Product("apple", 1200.0, 10);

        product.produktInfo();

        product.setPrice(1000.0);
        product.setCount(15);

        System.out.println("\nthen");
        product.produktInfo();

        product.setPrice(-500);
        product.setCount(-5);
    }
}





public class Book {
    private String title;   // Название книги
    private String author;  // Автор книги
    private double price;   // Цена книги
    private int pages;      // Количество страниц в книге

    // Конструктор по умолчанию (с пустыми значениями)
    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
        this.pages = 0;
    }

    // Конструктор с полными значениями
    public Book(String title, String author, double price, int pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }

    // Конструктор, принимающий только название и автора (с нулевой ценой и количеством страниц)
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
        this.pages = 0;
    }

    // Конструктор, принимающий название, цену и количество страниц (без автора)
    public Book(String title, double price, int pages) {
        this.title = title;
        this.author = "";  // Если автора нет, оставляем пустую строку
        this.price = price;
        this.pages = pages;
    }

    // Метод для получения информации о книге
    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Цена: " + price);
        System.out.println("Страниц: " + pages);
    }

    public static void main(String[] args) {
        // Создаем несколько объектов с разными конструкторами
        Book book1 = new Book("Java for Beginners", "John Doe", 29.99, 350);
        Book book2 = new Book("Mystery Book", "Jane Smith", 15.50, 250);
        Book book3 = new Book("Unknown Book", "Unknown Author");
        Book book4 = new Book("No Author Book", 10.99, 100);
        Book book5 = new Book(); // Конструктор по умолчанию

        // Выводим информацию о каждой книге
        System.out.println("Информация о книге 1:");
        book1.displayInfo();
        System.out.println();

        System.out.println("Информация о книге 2:");
        book2.displayInfo();
        System.out.println();

        System.out.println("Информация о книге 3:");
        book3.displayInfo();
        System.out.println();

        System.out.println("Информация о книге 4:");
        book4.displayInfo();
        System.out.println();

        System.out.println("Информация о книге 5:");
        book5.displayInfo();
    }
}