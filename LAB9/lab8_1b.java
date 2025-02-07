
interface Shape {
    void draw();
}

abstract class AbstractShape implements Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends AbstractShape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class lab8_1b{
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
    }
}
