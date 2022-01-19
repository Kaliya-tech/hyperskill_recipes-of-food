import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine(); // a valid or invalid registration number

        String validLogin = "[ABEKMHOPCTYX]{1}" + "[0-9]{3}" + "[ABEKMHOPCTYX]{2}";

        boolean isMatch = regNum.matches(validLogin);
        System.out.println(isMatch);
    }
}