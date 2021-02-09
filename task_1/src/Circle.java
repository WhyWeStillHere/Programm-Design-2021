public class Circle implements Shape {
    private double radius_ = 0;

    public void setRadius(double radius) {
        radius_ = radius;
    }

    public double area() {
        return Math.PI * radius_ * radius_;
    }
}
