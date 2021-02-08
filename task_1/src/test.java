import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ShapeTests {
    @Test
    void circle() {
        Circle circle = new Circle();
        assertEquals(0, circle.area());
        circle.setRadius(50);
        assertEquals(Math.PI * 2500, circle.area());
        circle.setRadius(0.25);
        assertEquals(Math.PI * 0.25d * 0.25d, circle.area());
    }

    @Test
    void rectangle() {
        Rectangle rectangle = new Rectangle();
        assertEquals(0, rectangle.area());
        rectangle.setHeight(50);
        assertEquals(0, rectangle.area());
        rectangle.setWidth(100);
        assertEquals(5000, rectangle.area());
        rectangle.setWidth(0.5);
        rectangle.setHeight(10);
        assertEquals(5, rectangle.area());
    }

    @Test
    void square() {
        Square square = new Square();
        assertEquals(0, square.area());
        square.setHeight(50);
        assertEquals(2500, square.area());
        square.setWidth(100);
        assertEquals(10000, square.area());
        square.setWidth(0.5);
        assertEquals(0.25, square.area());
    }

}

