public class Rectangle implements Shape {
    protected double height_ = 0;
    protected double width_ = 0;

    public void setHeight(double height) {
        height_ = height;
    }

    public void setWidth(double width) {
        width_ = width;
    }

    public double area() {
        return width_ * height_;
    }
}
