package ke_thua.bai_tap.lop_point_va_moveablepoint;

import java.util.Arrays;

public class Point {
    double x = 0.0f;
    double y = 0.0f;
    float[] xy = new float[2];
    public Point(){
    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public float[] getXy() {
        return xy;
    }

    public void setXy(float x, float y) {
        xy[0] = x;
        xy[1] = y;
    }
    @Override
    public String toString() {
        return "A Point with x = "
                + getX()
                + ", Y = "
                + getY()
                + " Array: "
                + Arrays.toString(getXy());
    }

    public static void main(String[] args) {
        Point point = new Point(1.1f,2.2f);
        point.setXy(1.1f, 2.2f);
        System.out.println(point);
    }
}
