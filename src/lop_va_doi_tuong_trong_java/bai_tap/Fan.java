package lop_va_doi_tuong_trong_java.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on = false;
    private double radius;
    private String color;

    public Fan() {
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return this.speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        if (this.on == true) {
            return this.speed + " " + this.color + " " + this.radius + "Fan is on";
        } else {
            return this.color + " " + this.radius + "Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setSpeed(3);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setSpeed(2);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
