package debug_exception.bai_tap;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Cac canh phai lon hon 0.");
        } else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tong 2 canh phai lon hon canh con lai.");
        } else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            System.out.println("Chu vi tam giac la:" + (this.side1 + this.side2 + this.side3));
        }
    }
}
