package exercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class SnackEight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci una numero da 4 cifre");
        String stringNum = scan.nextLine();
        char[] stringToArray = stringNum.toCharArray();
        int sum=0;

       if (stringToArray.length<4){
            System.out.println("il numero non contiene 4 cifre");
        } else if (stringToArray.length>4) {
            System.out.println("il numero non contiene 4 cifre");
        }else{
            for (int i=0 ; i<stringToArray.length; i++) {
                sum+=parseInt(String.valueOf(stringToArray[i]));
            }
           System.out.println("la somma delle 4 cifre è " + sum);
        }
       scan.close();
    }
}
