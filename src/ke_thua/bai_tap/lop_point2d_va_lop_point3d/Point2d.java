package ke_thua.bai_tap.lop_point2d_va_lop_point3d;

import ke_thua.thuc_hanh.Square;

import java.util.Arrays;

public class Point2d {
    private float x = 0.0f;
    private float y = 0.0f;
    float[] xy = new float[2];

    public Point2d() {
    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        xy[0] = x;
        xy[1] = y;
    }

    public float[] getXy() {
        return xy;
    }

    @Override
    public String toString() {
        return "A Point2D with x = "
                + getX()
                + ", Y = "
                + getY()
                + " Array: "
                + Arrays.toString(getXy());
    }

    public static void main(String[] args) {
        Point2d point2d = new Point2d(2.2f, 3.3f);
        point2d.setXY(2.2f, 3.3f);
        System.out.println(point2d);
    }
}
