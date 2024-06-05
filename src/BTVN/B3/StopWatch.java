package BTVN.B3;
import java.util.Date;

public class StopWatch {
//    private long startTime;
//    private long stopTime;
//    public StopWatch() {
//        startTime = System.nanoTime();
//    }
//    public void start() {
//        startTime = System.nanoTime();
//    }
//    public void stop() {
//        stopTime = System.nanoTime();
//    }
//    public double getElapsedTime() {
//        return (stopTime - startTime)/1000000000.0;
//    }
//    public String display(){
//        return String.format("start Time: %.3f End time %.3f", (startTime/1000000000.0),(stopTime/1000000000.0));
////        return String.format("Elapsed Time: %.3f", (getElapsedTime() / 1000000000.0));
//    }
//    C2
    private Date startTime;
    private Date endTime;
    public StopWatch() {
        this.startTime = new Date();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void start(){
        this.startTime = new Date();
    }
    public void stop(){
        this.endTime = new Date();
    }
    public long getElapsedTime(){

        return endTime.getTime()-startTime.getTime();
    }
}
