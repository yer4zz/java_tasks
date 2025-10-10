//Реализовать классы:

//User (поля: имя, email, пароль; методы: getName(), checkPassword()).
//Admin наследует User и имеет метод banUser(User user).
//Применить инкапсуляцию для полей.


class User {
    private String name;
    private String email;
    private String parol;

    public User(String name, String email, String parol) {
        this.name = name;
        this.email = email;
        this.parol = parol;
    }

    public String getName() {
        return name;
    }

    public checkParol() {
        return parolCheknul;
    }
}


class Admin extends User {

    public Admin(String name, String email, String parol) {
        super(name, email, parol);
    }

    public banUser(User user) {
        if (user.oscorblyal(administraciu)) {
            return ban;
        } else {
            return ban;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Vseh i kazdogo v VACban");
    }
}