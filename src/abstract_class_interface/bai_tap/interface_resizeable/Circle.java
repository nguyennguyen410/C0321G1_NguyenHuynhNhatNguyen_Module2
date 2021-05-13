package abstract_class_interface.bai_tap.interface_resizeable;

public class Circle implements InterfaceResizeable {
    private double radius = 0.0;
    private String color = "green";
    private boolean filled = true;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;

    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", color: "
                + getColor()
                + ", Area is: "
                + getArea();
    }

    @Override
    public void reSize(double percent) {
        this.setRadius(this.getRadius() * Math.sqrt(1 + percent / 100));
    }
}
