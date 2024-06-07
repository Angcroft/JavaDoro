import java.util.Scanner;

public class Timers {
    private long pomodoroTime = 1500; // 25 minutes in seconds
    private long shortTime = 300;     // 5 minutes in seconds
    private long longTime = 900;      // 15 minutes in seconds

    public void pomodoro() {
        Scanner scanner = new Scanner(System.in);
        Interfacer.pomodoro_ui();
        Chrono chrono = new Chrono();
        int indexNumber = getUserChoice(scanner);

        switch (indexNumber) {
            case Chrono.START_POMODORO:
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

            case Chrono.CANCEL_PROGRAM:
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
            case Chrono.START_POMODORO:
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

            case Chrono.CANCEL_PROGRAM:
                System.out.println("Pomodoro cancelled.");
                break;

            default:
                System.out.println("Invalid option. Please enter a correct number.");
        }
    }

    public void longBreak() {
        Scanner scanner = new Scanner(System.in);
        Interfacer.shortBreak_ui();
        Chrono chrono = new Chrono();
        int indexNumber = getUserChoice(scanner);

        switch (indexNumber) {
            case Chrono.START_POMODORO:
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

            case Chrono.CANCEL_PROGRAM:
                System.out.println("Pomodoro cancelled.");
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