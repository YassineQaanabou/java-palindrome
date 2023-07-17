package exercise;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci una parola");
        String userWord = scan.nextLine();
        String reverseWord = "";

        for (int i = 0; i < userWord.length(); i++) {
            reverseWord = userWord.charAt(i) + reverseWord;
        }

        if (userWord.equals(reverseWord)) {
            System.out.println("la parola è palindroma");

        } else {
            System.out.println("la parola non è palindroma");
        }
    }
}
