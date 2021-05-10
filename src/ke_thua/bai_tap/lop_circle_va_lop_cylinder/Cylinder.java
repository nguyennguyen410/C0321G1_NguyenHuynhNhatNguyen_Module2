package ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getV() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius="
                + getRadius()
                + ", Height is "
                + getHeight()
                + ", volume is "
                + getV()
                + ", which is a subclass of "
                + super.toString();
    }
}
