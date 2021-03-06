import java.util.*;

class BankCard {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String numbers = scn.nextLine();
        String card = numbers.replaceAll("\\s", "");

        String visaRegex = "4+\\d{15}"; // put your code here
        String masterCardRegex = "[51-55]+\\d{14}";
        String masterCardRegex1 = "[2221-2720]+\\d{12}"; // put your code here
        String americanExpressRegex = "([34] +|[37])+\\d{13}"; // put your code here

        if (card.matches(visaRegex)) {
            System.out.println("Visa");
        } else if (card.matches(americanExpressRegex)) {
            System.out.println("AmericanExpress");
        } else if (card.matches(masterCardRegex) || card.matches(masterCardRegex1)) {
            System.out.println("MasterCard");
        } else {
            System.out.println("Card number does not exist");
        }
    }
}