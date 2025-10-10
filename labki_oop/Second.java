import java.util.Arrays;

class Student {

    private String name;
    public int age;
    public double[] grades;

    public Student(String name, int age, double[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }


    public double avg() {
        if (grades == null || grades.length == 0) return 0.0;
        double sum = 0.0;
        
        for (int i = 0; i < grades.length; i++) {
            double g = grades[i];
            sum += g;
        }

        return sum / grades.length;
    }


    public void printInfo() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("avg: " + avg());
    }


    public boolean isEqual(Student other) {
        if (other == null) 
        return false;
        
        boolean names = this.name.equals(other.name);
        boolean ages = this.age == other.age;
        boolean grades = Arrays.equals(this.grades, other.grades);
        return names && ages && grades;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}


public class Main {
    public static void main(String[] args) {
        
        double[] grades1 = {9.0, 8.5, 10.0};
        Student s1 = new Student("Era", 18, grades1);
        s1.printInfo();

        double[] grades2 = {0.0, 0.0, 0.0};
        Student s2 = new Student("Enemy", 30, grades2);
        System.out.println("s1 & s2 " + s1.isEqual(s2));


        Student sNull = null;
        //System.out.println(sNull.printInfo());
    }
}