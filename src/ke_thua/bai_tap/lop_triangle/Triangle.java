package ke_thua.bai_tap.lop_triangle;

public class Triangle extends Shape{
    private double side1, side2, side3;
    public Triangle(){
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter(){
        return side1+side3+side2;
    }
    public double getArea(){
        double p = getPerimeter()/2;
        double h = 2*Math.sqrt(p*(p-side1)*(p-side2)*(p-side3))/side1;
        return side1*h/2;
    }
    @Override
    public String toString() {
        return "A Triangle with side1, side2, side3: "
                + getSide1()
                + " "
                + getSide2()
                + " "
                + getSide3()
                + " Perimeter is: "
                + getPerimeter()
                + " Area is: "
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(12,10,5);
        System.out.println(triangle);
    }
}
