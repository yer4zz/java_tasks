import java.util.Arrays;

class Student {
    String name;
    int age;
    double[] grades;
    String group;

    Student(String name, int age, double[] grades, String group) {
        this.name = name;
        this.age = age;
        this.grades = grades;
        this.group = group;
    }

    double calculateAverage() {
        if (grades == null || grades.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.length;
    }

    void printInfo() {
        System.out.println("Name " + name);
        System.out.println("YO " + age);
        System.out.println("Group " + group);
        System.out.println("AVG " + calculateAverage());
    }

    boolean isEqual(Student other) {
        if (other == null) return false;
        return name.equals(other.name) &&
               age == other.age &&
               Arrays.equals(grades, other.grades) &&
               group.equals(other.group);
    }
}

public class Main {
    public static void main(String[] args) {
        double[] g1 = {4.0, 5.0, 3.0};
        double[] g2 = {4.0, 5.0, 3.0};

        Student s1 = new Student("Aibek", 20, g1, "CS-101");
        Student s2 = new Student("Stud", 20, g2, "CS-101");

        s1.printInfo();

        System.out.println("AVG " + s1.calculateAverage());

        System.out.println("s1 & s2 " + s1.isEqual(s2));
    }
}