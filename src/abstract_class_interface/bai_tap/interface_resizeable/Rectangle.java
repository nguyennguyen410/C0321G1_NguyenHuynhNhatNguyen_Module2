package abstract_class_interface.bai_tap.interface_resizeable;

public class Rectangle implements InterfaceResizeable {
    private double width = 1.0;
    private double length = 1.0;
    private String color = "green";
    private boolean filled = true;
    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
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
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", perimeter = "
                + getPerimeter()
                + ", area = "
                + getArea();
    }

    @Override
    public void reSize(double percent) {
        this.setWidth(this.getWidth() * Math.sqrt(1 + percent / 100));
        this.setLength((this.getWidth() * Math.sqrt(1 + percent / 100)) * this.getLength() / this.getWidth());
    }
}
