class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void DisplayInfo() {
        System.out.println(name + ", " + age);
    }

    public boolean IsAdult() {
        return age >= 18;
    }

    public String GetGreeting() {
        return "Привет, меня зовут " + name + ", мне " + age + " лет.";
    }
}


class Course {
    public String title;
    public Student Student1;
    public Student Student2;
    public Student Student3;

    public Course(String title) {
        this.title = title;
    }

    public void DisplayCourse() {
        System.out.println(title);
    }

    public void AddStudents(Student s1, Student s2, Student s3) {
        this.Student1 = s1;
        this.Student2 = s2;
        this.Student3 = s3;
    }

    public void ShowStudents() {
        Student1.DisplayInfo();
        Student2.DisplayInfo();
        Student3.DisplayInfo();
    }

    public static int CountStudents(Student[] students) {
        return students.length;
    }
}


class Professor {
    public String name;

    public Professor(String name) {
        this.name = name;
    }

    public void AssignCourse(Course course) {
        System.out.println(name + " назначен преподавателем курса " + course.title);
    }
}


public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Era", 18);
        Student s2 = new Student("Fish", 17);
        Student s3 = new Student("Necromanser", 20);

        s1.DisplayInfo();
        System.out.println("Voenkom? " + s1.IsAdult());
        System.out.println(s1.GetGreeting());

        Course course = new Course("Cybersecurity");
        course.DisplayCourse();

        course.AddStudents(s1, s2, s3);

        course.ShowStudents();

        Student[] list = {s1, s2, s3};
        System.out.println("CountStudents " + Course.CountStudents(list));

        Professor prof = new Professor("Tip na Pudge");
        prof.AssignCourse(course);
    }
}