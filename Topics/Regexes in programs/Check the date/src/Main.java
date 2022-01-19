import java.util.*;

class Date {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String date = scn.nextLine();

        String[] arr = date.split("(\\-|\\/|\\.){1}");

        String yearRegex = "(19[0-9]{2}|20[0-9]{2})";
        String monthRegex = "([0-9]|1[0-2])";
        String dayRegex = "([0-9]|[1-2][0-9]|3[0-1])";

        // String symb = "(\\-|\\/|\\.){1}";
        int count = 0;

        for (String arrEnt : arr) {
            if (arrEnt.matches(yearRegex) || (arrEnt.matches(dayRegex)) || arrEnt.matches(monthRegex)) {
                count++;
            }
        }
        System.out.println(count == 3 ? "Yes" : "No");

    }

}