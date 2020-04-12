package laptrinhvadoituong.baitap.stopwatch;

public class StopWatch {
    private long startTime, stopTime;

    public long getStartTime() {
        return this.startTime;
    }

    public long getStopTime() {
        return this.stopTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return getStopTime() - getStartTime();
    }
}
