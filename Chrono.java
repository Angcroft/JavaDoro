import java.util.Scanner;

public class Chrono {

    private long startTime;
    private long elapsedTime;
    private boolean isRunning;

    //  Welcomer
    public static final int POMODORO = 1;
    public static final int SHORT_BREAK = 2;
    public static final int LONG_BREAK = 3;
    public static final int CONFIGURE = 4;
    public static final int EXIT_PROGRAM = 5;

    //  Pomodoro
    public static final int START_POMODORO = 1;
    public static final int CANCEL_PROGRAM = 2;

    //  Short Break
    public static final int START_SHORTBREAK = 1;

    //  Long Break 
    public static final int START_LONGBREAK = 1;

    //  Configurator
    public static final int CHANGE_POMODORO = 1;
    public static final int CHANGE_SHORT_BREAK = 2;
    public static final int CHANGE_LONG_BREAK = 3;
    public static final int AUTO_BREAKS = 4;
    public static final int AUTO_POMODORO = 5;
    public static final int CANCEL_CONFIG = 6;

    public void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis() - elapsedTime;
            isRunning = true;
        }
    }

    public void stop() {
        if (isRunning) {
            elapsedTime = System.currentTimeMillis() - startTime;
            isRunning = false;
        }
    }

    public void restart() {
        startTime = 0;
        elapsedTime = 0;
        isRunning = false;
    }

    public long getTime() {
        if (isRunning) {
            return System.currentTimeMillis() - startTime;
        } else {
            return elapsedTime;
        }
    }

    public String getStringTime() {
        long time = getTime();
        int seconds = (int) (time / 1000) % 60;
        int minutes = (int) ((time / (1000 * 60)) % 60);
        int hours = (int) ((time / (1000 * 60 * 60)) % 24);
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timers timers = new Timers();

        while (true) {
            Interfacer.welcomer();
            int indexNumber = Timers.getUserChoice(scanner);

            switch (indexNumber) {
                case 1:
                    timers.pomodoro();
                    break;
                case 2:
                    timers.shortBreak();
                    break;
                case 3:
                    timers.longBreak();
                    break;
                case 4:
                    timers.configurator();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please enter a correct number.");
            }
        }
    }
}