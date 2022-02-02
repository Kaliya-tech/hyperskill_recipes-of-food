import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringReverser reverser = new StringReverser() {
            @Override
            public String reverse(String str) {
                char[] array = str.toCharArray();
                String reversedStr = "";
                for (int i = array.length - 1; i >= 0; i--) {
                    reversedStr += array[i];
                }
                return reversedStr;
            }
        };
        /* create an instance of an anonymous class here,
                                     do not forget ; on the end */

        System.out.println(reverser.reverse(line));
    }

    interface StringReverser {

        String reverse(String str);
    }

}