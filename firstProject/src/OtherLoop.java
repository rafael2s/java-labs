import java.util.Scanner;

public class OtherLoop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double averageRating = 0;
        double note = 0;
        int totalNotes = 0;

        while (note != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar! ");
            note = reading.nextDouble();

            if (note != -1) {
                averageRating += note;
                totalNotes++;
            }
        }
        System.out.println("Media de avaliações: " + averageRating / totalNotes);
    }
}
