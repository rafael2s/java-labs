import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double averageRating = 0;
        double note = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme  ");
            note = reading.nextDouble();
            averageRating += note;
        }
        System.out.println("Media de avaliações: " + averageRating/3);
    }
}
