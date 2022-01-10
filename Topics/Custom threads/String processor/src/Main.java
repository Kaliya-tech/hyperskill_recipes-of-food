
import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in); // use it to read string from the standard input

    @Override
    public void run() {
        // implement this method
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            if (isUpperCase(str)) {
                System.out.println("FINISHED");
                break;
            } else {
                System.out.println(str.toUpperCase());
            }
        }
    }

    private static boolean isUpperCase (String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (!Character.isUpperCase(chars[i])) {
                return false;
            }
        }
        return true;
    }
}