import java.util.List;
import java.util.ArrayList;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " with credit card");
    }
}

class PayPalPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " with PayPal");
    }
}

interface IterableCollection {
    MyIterator get_iterator();
}

interface MyIterator {
    boolean hasNext();
    int next();
}

class NumberCollection implements IterableCollection {
    private List<Integer> numbers = new ArrayList<>();

    public NumberCollection(List<Integer> nums) {
        this.numbers = nums;
    }

    public MyIterator get_iterator() {
        return new NumberIterator();
    }

    private class NumberIterator implements MyIterator {
        private int index = 0;

        public boolean hasNext() {
            return index < numbers.size();
        }

        public int next() {
            return numbers.get(index++);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Задание 1: Drawable
        Drawable d1 = new Circle();
        Drawable d2 = new Rectangle();
        d1.draw();
        d2.draw();




        PaymentMethod p1 = new CreditCardPayment();
        PaymentMethod p2 = new PayPalPayment();
        p1.pay(100.0);
        p2.pay(250.5);




        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        NumberCollection nc = new NumberCollection(nums);
        MyIterator it = nc.get_iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
