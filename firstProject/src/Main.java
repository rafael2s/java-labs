//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é Screen Match");
        System.out.println("Filme: Tup Gun: Maverick");

        int releaseYear = 2022;
        System.out.println("Ano de lançamento: " + releaseYear);
        boolean isIncludeInPlan = true;
        double movieRating = 8.1;
        //Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + releaseYear;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}