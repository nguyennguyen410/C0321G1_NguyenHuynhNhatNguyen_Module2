package abstract_class_interface.bai_tap.interface_colorable;

public class Square implements InterfaceColorable {
    private double side=0.0;
    private String color = "yellow";
    private boolean filled = true;
    public Square(){
    }
    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
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

    public double getPerimeter(){
        return this.side*4;
    }

    public double getArea(){
        return this.side*this.side;
    }
    @Override
    public String toString(){
        return "A Square with side ="
                + getSide()
                + ", perimeter = "
                + getPerimeter()
                + ", area = "
                + getArea();
    }
    @Override
    public void howToColor(){
        System.out.println(" Color all four sides.");
    }
}
