public class Main {
    public static void main(String[] args) {
        
        Person p1 = new Person("Era", 18);
        Person p2 = new Person("Syl", 19);
        System.out.println("count " + Person.totalCount);


        MathUtils mathUtils = new MathUtils();
        System.out.println("factorial 5: " + MathUtils.factorial(5));


        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println("counter " + Counter.getCount());


        NumberUtils numUtils = new NumberUtils();
        System.out.println("max " + NumberUtils.max(3, 7, 2));


        DatabaseConnection db = new DatabaseConnection();


        StringUtils strUtils = new StringUtils();
        System.out.println("char count " + StringUtils.countChars("kanagattandyrylmagandyktarynyzdan"));


        AppSettings settings = new AppSettings();
        AppSettings.displayConfigVersion();


        GameSettings game = new GameSettings();
        GameSettings.printMaxPlayers();


        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("18 celsya = " + TemperatureConverter.celsiusToFahrenheit(18) + "fahrenheit");
        System.out.println("18 fahrenheit = " + TemperatureConverter.fahrenheitToCelsius(18) + "celsya");
    }
}


class Person {
    public String name;
    public int age;
    public static int totalCount;

    static {
        totalCount = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        totalCount++;
    }
}


class MathUtils {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}


class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}


class NumberUtils {
    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}


class DatabaseConnection {
    static {
        System.out.println("DatabaseConnection");
    }
}


class StringUtils {
    public static int countChars(String str) {
        return str.length();
    }
}


class AppSettings {
    public static String configVersion = "1.0";
    
    public static void displayConfigVersion() {
        System.out.println("Config version: " + configVersion);
    }
}


class GameSettings {
    public static int maxPlayers;

    static {
        maxPlayers = 4;
    }

    public static void printMaxPlayers() {
        System.out.println("Max players: " + maxPlayers);
    }
}


class TemperatureConverter {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}