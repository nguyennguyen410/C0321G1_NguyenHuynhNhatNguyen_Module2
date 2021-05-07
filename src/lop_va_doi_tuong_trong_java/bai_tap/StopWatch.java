package lop_va_doi_tuong_trong_java.bai_tap;


public class StopWatch {

    private long startTime;
    private long endTime;

    StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
        System.out.println("StopWatch: " + getElapsedTime() + " milliseconds.");
    }


    public long getElapsedTime() {
        return (endTime - startTime);
    }


    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        for (int i = 0; i <= 1000000000; ) {
            i++;
        }
        watch.stop();
    }
}
