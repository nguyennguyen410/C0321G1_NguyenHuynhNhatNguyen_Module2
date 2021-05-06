package lop_va_doi_tuong_trong_java.bai_tap;

import java.time.LocalTime;

public class StopWatch {

    private LocalTime startTime;
    private LocalTime endTime;

    StopWatch() {
        this.startTime = java.time.LocalTime.now();
    }

    public void start() {
        this.startTime = java.time.LocalTime.now();
    }

    public void stop() {
        this.endTime = java.time.LocalTime.now();
        System.out.println("StopWatch: " + getElapsedTime() + " milliseconds.");
        System.out.println("StopWatch: " + getElapsedTimeSecs() + " seconds.");
    }


    public long getElapsedTime() {
        return (endTime.toSecondOfDay() - startTime.toSecondOfDay());
    }

    public double getElapsedTimeSecs() {
        double elapsed;
        elapsed = ((double) ((endTime.toSecondOfDay() - startTime.toSecondOfDay()))) / 1000;
        return elapsed;
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
    }
}
