import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String input = scanner.nextLine();

        String regex1 = ".*[a-z]+.*";
        String regex2 = ".*[A-Z]+.*";
        String regex3 = ".*[0-9]+.*";

        if (input.length() >= 12) {
            if (input.matches(regex1) && input.matches(regex2) && input.matches(regex3)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        } else {
            System.out.println("NO");
        }

    }
}