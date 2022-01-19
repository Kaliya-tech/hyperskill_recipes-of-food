import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String regex = "([0-1]{1}\\d{1}+|2{1}[0-3]{1})" + ":" + "[0-5]{1}\\d{1}";
        String regex = "([01]\\d|2[0-3]):[0-5]\\d";
        String time = scanner.nextLine();
        System.out.println(time.matches(regex) ? "YES" : "NO");
    }
}