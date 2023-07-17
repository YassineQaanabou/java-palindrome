package exercise;

public class SnackNine {
    public static void main(String[] args) {

        double sum =0;
        double media;

        for(int i=0; i<= 10; i++){
            sum+=i;
        }

        media= sum/10;

        System.out.println("la somma dei primi 10 numeri è "+sum);
        System.out.println("la media dei primi 10 numeri è "+media);
    }
}
