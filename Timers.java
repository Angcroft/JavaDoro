import java.util.Scanner;

public class Timers {
    private long pomodoroTime = 1500; // 25 minutes in seconds
    private long shortTime = 300;     // 5 minutes in seconds
    private long longTime = 900;      // 15 minutes in seconds

    public static final int START_POMODORO = 1;
    public static final int CANCEL_PROGRAM = 2;
    public static final int START_SHORTBREAK = 1;
    public static final int START_LONGBREAK = 1;
    public static final int CHANGE_POMODORO = 1;
    public static final int CHANGE_SHORT_BREAK = 2;
    public static final int CHANGE_LONG_BREAK = 3;
    public static final int AUTO_BREAKS = 4;
    public static final int AUTO_POMODORO = 5;
    public static final int CANCEL_CONFIG = 6;

    public void pomodoro() {
        Scanner scanner = new Scanner(System.in);
        Interfacer.pomodoro_ui();
        Chrono chrono = new Chrono();
        int indexNumber = getUserChoice(scanner);

        switch (indexNumber) {
            case START_POMODORO:
                chrono.start();
                try {
                    for (int i = 0; i < pomodoroTime; i++) {
                        System.out.println("Pomodoro Timer");
                        System.out.println("Time transcurred: " + chrono.getStringTime());
                        Thread.sleep(1000);  // Pause 1 second to see elapsed time
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                chrono.stop();
                System.out.println("Final time: " + chrono.getStringTime());
                break;
            case CANCEL_PROGRAM:
                System.out.println("Pomodoro cancelled.");
                break;
            default:
                System.out.println("Invalid option. Please enter a correct number.");
        }
    }

    public void shortBreak() {
        Scanner scanner = new Scanner(System.in);
        Interfacer.shortBreak_ui();
        Chrono chrono = new Chrono();
        int indexNumber = getUserChoice(scanner);

        switch (indexNumber) {
            case START_SHORTBREAK:
                chrono.start();
                try {
                    for (int i = 0; i < shortTime; i++) {
                        System.out.println("Short Break Timer");
                        System.out.println("Time transcurred: " + chrono.getStringTime());
                        Thread.sleep(1000);  // Pause 1 second to see elapsed time
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                chrono.stop();
                System.out.println("Final time: " + chrono.getStringTime());
                break;
            case CANCEL_PROGRAM:
                System.out.println("Short break cancelled.");
                break;
            default:
                System.out.println("Invalid option. Please enter a correct number.");
        }
    }

    public void longBreak() {
        Scanner scanner = new Scanner(System.in);
        Interfacer.longBreak_ui();
        Chrono chrono = new Chrono();
        int indexNumber = getUserChoice(scanner);

        switch (indexNumber) {
            case START_LONGBREAK:
                chrono.start();
                try {
                    for (int i = 0; i < longTime; i++) {
                        System.out.println("Long break Timer");
                        System.out.println("Time transcurred: " + chrono.getStringTime());
                        Thread.sleep(1000);  // Pause 1 second to see elapsed time
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                chrono.stop();
                System.out.println("Final time: " + chrono.getStringTime());
                break;
            case CANCEL_PROGRAM:
                System.out.println("Long break cancelled.");
                break;
            default:
                System.out.println("Invalid option. Please enter a correct number.");
        }
    }

    public void configurator() {
        Scanner scanner = new Scanner(System.in);
        Interfacer.configuration_ui();
        Chrono chrono = new Chrono();
        int indexNumber = getUserChoice(scanner);

        switch(indexNumber) {
            case CHANGE_POMODORO:
                System.out.println("How many minutes will take the Pomodoro?");
                pomodoroTime = scanner.nextInt() * 60; // Convert to seconds
                break;
            case CHANGE_SHORT_BREAK:
                System.out.println("How many minutes will take the Short Break?");
                shortTime = scanner.nextInt() * 60; // Convert to seconds
                break;
            case CHANGE_LONG_BREAK:
                System.out.println("How many minutes will take the Long Break?");
                longTime = scanner.nextInt() * 60; // Convert to seconds
                break;
            case AUTO_BREAKS:
                System.out.println("Auto breaks configuration not implemented yet.");
                break;
            case AUTO_POMODORO:
                System.out.println("Auto pomodoro configuration not implemented yet.");
                break;
            case CANCEL_CONFIG:
                System.out.println("Cancelling configuration");
                break;
            default:
                System.out.println("Invalid option. Please enter a correct number.");
        }
    }

    public static int getUserChoice(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;  // Invalid input
        }
    }
}