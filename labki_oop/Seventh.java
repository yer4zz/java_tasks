abstract class Instrument {
    abstract void play();
}

class Guitar extends Instrument {
    @Override
    void play() {
        System.out.println("gitara");
    }
}

class Piano extends Instrument {
    @Override
    void play() {
        System.out.println("piano");
    }
}




abstract class Polygon {
    abstract int perimeter();
}

class Triangle extends Polygon {
    int a, b, c;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    int perimeter() {
        return a + b + c;
    }
}

class Square extends Polygon {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    int perimeter() {
        return 4 * side;
    }
}




interface InputDevice {
    void connect();
    void readData();
}

class Keyboard implements InputDevice {
    @Override
    public void connect() {
        System.out.println("k conected");
    }

    @Override
    public void readData() {
        System.out.println("k reading");
    }
}

class Mouse implements InputDevice {
    @Override
    public void connect() {
        System.out.println("m connected");
    }

    @Override
    public void readData() {
        System.out.println("m rreading");
    }
}




public class Main {
    public static void main(String[] args) {

        Instrument guitar = new Guitar();
        Instrument piano = new Piano();

        guitar.play();
        piano.play();



        Polygon triangle = new Triangle(3, 4, 5);
        Polygon square = new Square(5);

        System.out.println(triangle.perimeter());
        System.out.println(square.perimeter());



        InputDevice keyboard = new Keyboard();
        InputDevice mouse = new Mouse();

        keyboard.connect();
        keyboard.readData();

        mouse.connect();
        mouse.readData();
    }
}