import java.util.Scanner;

class MessageNotifier extends Thread {
    // write fields to store variables here
    Scanner scanner = new Scanner(System.in);
    String msg;
    int repeats = 0;

    public MessageNotifier(String msg, int repeats) {
        // implement the constructor
        this.msg = msg;
        this.repeats = repeats;
    }

    @Override
    public void run() {
        // implement the method to print the message stored in a field

        int count = 0;
        while (count != repeats) {
            System.out.println(msg);
            count++;
        }
    }
}