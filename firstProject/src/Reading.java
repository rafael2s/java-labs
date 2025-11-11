import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = reading.nextLine();
        System.out.println("Qual o ano de lançamento");
        int releaseYear = reading.nextInt();
        System.out.println("Diga sua avaliação para o filme  ");
        double rating =  reading.nextDouble();

        System.out.println(filme);
        System.out.println(releaseYear);
        System.out.println(rating);
    }
}
