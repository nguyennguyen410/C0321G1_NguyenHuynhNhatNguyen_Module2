package ke_thua.bai_tap.lop_point_va_moveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    float[] speed = new float[2];
    public MoveablePoint(){
    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return speed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        speed[0] = xSpeed;
        speed[1] = ySpeed;
    }
    public MoveablePoint move(){
        x+=xSpeed;
        y+=ySpeed;
        return this;
    }
    @Override
    public String toString() {
        return "A Point with x = "
                + getX()
                + ", Y = "
                + getY()
                + " xSpeed =  "
                + getxSpeed()
                + " ySpeed = "
                + getySpeed();
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1.1f,2.2f,3.3f,4.4f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
