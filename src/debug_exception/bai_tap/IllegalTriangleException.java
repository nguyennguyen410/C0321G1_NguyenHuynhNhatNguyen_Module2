package debug_exception.bai_tap;

public class IllegalTriangleException  {
    public void illegalTriangleException(double side1, double side2, double side3) throws Exception {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new Exception("Cac canh phai lon hon 0.");
        } else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new Exception("Tong 2 canh phai lon hon canh con lai.");
        } else {
            System.out.println("Chu vi tam giac la:" + (side1 + side2 + side3));
        }
    }
}
