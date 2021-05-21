package debug_exception.bai_tap;

public class IllegalTriangleException extends Throwable {
    @Override
    public String getMessage() {
        return "Nhap sai";
    }
}
