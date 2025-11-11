public class Contitional {
    public static void main(String[] args) {

        int releaseYear = 1996;
        boolean isIncludeInPlan = true;
        double movieRating = 8.1;
        String planType = "plus";

        if (releaseYear >= 2022){
            System.out.println("Lançamentos que os cliente estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (isIncludeInPlan == true && planType.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Filme pagar a locação");
        }

        int dia = 5;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
