class Shape {
    void draw() { System.out.println("Drawing shape"); }
}

class Square extends Shape {
    @Override
    void draw() { System.out.println("Drawing square"); }
}

class Triangle extends Shape {
    @Override
    void draw() { System.out.println("Drawing triangle"); }
}

public class polymorphism {
    public static void main(String[] args) {
        Shape s;

        s = new Square(); s.draw();
        s = new Triangle(); s.draw();
    }
}
