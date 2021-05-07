package access_modifier_static_method_static_property.bai_tap;

public class Circle {
    private double radius=1.0;
    private String color="red";
    Circle(){
    }
    Circle(double radius){
        this.radius = radius;
    }

     public double getRadius() {
        return this.radius;
    }

     public String getColor() {
        return this.color;
    }
}
