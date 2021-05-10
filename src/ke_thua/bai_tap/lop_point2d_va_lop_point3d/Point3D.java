package ke_thua.bai_tap.lop_point2d_va_lop_point3d;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point3D extends Point2d {
    private float z = 0.0f;
    float[] xyz = new float[3];

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXyz(float x, float y, float z) {
        xyz[0] = x;
        xyz[1] = y;
        xyz[2] = z;
    }

    public float[] getXyz() {
        return xyz;
    }

    @Override
    public String toString() {
        return "A Point3D with x = "
                + getX()
                + ", Y = "
                + getY()
                + ", Z = "
                + getZ()
                + ", Array "
                + Arrays.toString(getXyz());
    }

    public static void main(String[] args) {
        Point3D point3d = new Point3D(2.2f,3.3f,4.4f);
        point3d.setXyz(2.2f, 3.3f, 4.4f);
        System.out.println(point3d);

    }
}
