public class Interfacer {
    public static void welcomer() {
        System.out.println("Select one of the following options: ");
        System.out.println("1. Pomodoro");
        System.out.println("2. Short Break");
        System.out.println("3. Long Break");
        System.out.println("4. Configure");
        System.out.println("5. Exit");
    }

    public static void pomodoro_ui() {
        System.out.println("Please select the following options: ");
        System.out.println("1. Start Pomodoro");
        System.out.println("2. Cancel");
    }

    public static void shortBreak_ui() {
        System.out.println("Please select the following options: ");
        System.out.println("1. Start Short Break");
        System.out.println("2. Cancel");
    }

    public static void configuration_ui() {
        System.out.println("Please select the following options: ");
        System.out.println("1. Change Pomodoro minutes");
        System.out.println("2. Change Short Break minutes");
        System.out.println("3. Change Long Break minutes");
        System.out.println("4. Auto start breaks");
        System.out.println("5. Auto start pomodoros");
        System.out.println("6. Cancel");
    }
}
