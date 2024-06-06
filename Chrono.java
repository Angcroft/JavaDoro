public class Chrono {
    private long startTime;
    private boolean isRunning;

    public void start() {
        startTime = System.currentTimeMillis();
        isRunning =  true;
    }

    public void stop() {
        isRunning = false;
    }

    public void restart() {
        startTime = 0;
        isRunning = false;
    }

    public long getTime() {
        long timeTimer;
        if (isRunning) {
            timeTimer = System.currentTimeMillis() - startTime;
        } else {
            timeTimer = 0;
        }
        return timeTimer;

    }

    public String getStringTime() {
        long time = getTime();
        int seconds = (int) (time / 1000) % 60;
        int minutes = (int) ((time / (1000 * 60)) % 60);
        int hours = (int) ((time / (1000 * 60 * 60)) % 24);
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Chrono chrono = new Chrono();

        while(true) {
            chrono.start();

            System.out.println("Time transcurred: " + chrono.getStringTime());
        }
    }
}