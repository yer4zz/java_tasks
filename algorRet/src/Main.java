import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt(); //закоментировать при включенном random();

//        String str = sc.nextLine(); //использовать к longestWord(str) и schetchikGlasnyh(String str);

//        int glasnye = schetchikGlasnyh(str); //использовать к schetchikGlasnyh(String str);
//        if (glasnye > 5) {
//            System.out.println("Богатая строка");
//        } else {
//            System.out.println("Нужно больше гласных");
//        }

//        ArrayList<Integer> spisok = generatorSpiskov(); //использовать к generatorSpiskov();
//        System.out.println(spisok);
//        int sum = 0;
//        for (int perebrat : spisok) {
//            sum += perebrat;
//        }
//        System.out.println(sum);

//        String password = sc.nextLine(); //использовать к proverka(String password);
//        proverka(password);



//        random();
//        System.out.println(polindrom(n));
//        System.out.println(faktorial(n));
//        System.out.println(season(n));
//        System.out.println(longestWord(str));

//        int size = sc.nextInt();
//        int[] mass = new int[size];
//        for (int i = 0; i < size; i++) {
//            mass[i] = sc.nextInt();
//        }
//        System.out.println();


//        int a = sc.nextInt(); // количество строк
//        int b = sc.nextInt(); // количество столбцов
//        int[][] arr = new int[a][b];
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int[] x: arr) {
//            for (int y : x) {
//                System.out.print(y + " ");
//            }
//            System.out.println();
//        }


//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//        int[][] array = new int[rows][cols];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print("Элемент [" + i + "][" + j + "]: ");
//                array[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

    }


    public static void random(){
        Scanner sc = new Scanner(System.in);
        int n;
        int rndm = (int) (Math.random() * 50) + 1;
        while (true) {
            n = sc.nextInt();
            if (n < rndm) {
                System.out.println("dobavlai");
            } else if (n > rndm) {
                System.out.println("ubavlai");
            } else {
                System.out.println("ugadal yo");
                break;
            }
        }
    }
    public static int polindrom(int n){
        if (n / 100 == n % 10){
            return 1;
        } else {
            return 0;
        }
    }
    public static int faktorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    public static String season(int n){
        String season = "";
        if (n == 12 || n == 1 || n == 2) {
            season = "Zima";
        } else if (n >= 3 && n <= 5) {
            season = "Vesna";
        } else if (n >= 6 && n <= 8) {
            season = "Leto";
        }
        else if (n >= 9 && n <= 11) {
            season = "Osen";
        }
        return season;
    }
    public static String longestWord(String str){
        String[] words = str.split("\\s+");
        String longest = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        return longest;
    }
    public static int schetchikGlasnyh(String str) {
        String glasnye = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        int s = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (glasnye.contains(Character.toString(ch))) {
                s++;
            }
        }
        return s;
    }
    public static ArrayList generatorSpiskov(){
        ArrayList<Integer> spisok = new ArrayList<>();
        for (int i = 1; i <= 50; i+=2) {
            spisok.add(i*i);
        }
        return spisok;
    }
    public static void proverka(String password){
        if (password.length() >= 8) {
            System.out.println("zaebis");
        } else {
            System.out.println("po novoi Vasya, vse huinya");
        }
    }
}