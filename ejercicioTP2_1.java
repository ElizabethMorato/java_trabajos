
import java.util.Scanner;

public class ejercicioTP2_1  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el genero que te gusta (acción, comedia, drama, ciencia ficción):");
        String genero = scanner.nextLine().toLowerCase();

        String recomendacion = recomendarPelicula(genero);
        System.out.println("Te recomendamos la película: " + recomendacion);
    }

    public static String recomendarPelicula(String genero) {
        switch (genero) {
            case "acción":
                return "rapidos y furiosos";
            case "comedia":
                return "que paso ayer";
            case "drama":
                return "la elite";
            case "ciencia ficción":
                return "dune";
            default:
                return "No tenemos recomendaciones para ese género.";
        }
    }
}
