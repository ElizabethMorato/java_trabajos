/*Ejercicio 4: Generador de Listas de Reproducción
Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
genere una lista de reproducción con canciones sugeridas para ese estado de ánimo.
 */

import java.util.Scanner;

public class ejercicioTP1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String estadoDeAnimo;

        System.out.println("Por favor, ingresa tu estado de ánimo (feliz, triste, enérgico, relajado):");
        estadoDeAnimo = input.nextLine().toLowerCase();

        generarListaReproduccion(estadoDeAnimo);
    }

    public static void generarListaReproduccion(String estadoAnimo) {
        switch (estadoAnimo) {
            case "feliz":
                System.out.println("Lista de reproducción para cuando estás feliz:\n1. Happy - Pharrell Williams\n2. Don't Stop Me Now - Queen\n3. Can't Stop the Feeling! - Justin Timberlake");
                break;
            case "triste":
                System.out.println("Lista de reproducción para cuando estás triste:\n1. HSomeone Like You - Adele\n2. Fix You - Coldplay\n3. Hurt - Johnny Cash");
                break;
            case "enérgico":
                System.out.println("Lista de reproducción para cuando estás enérgico:\n1. Eye of the Tiger - Survivor\n2. Uptown Funk - Mark Ronson ft. Bruno Mars\n3. Levels - Avicii");
                break;
            case "relajado":
                System.out.println("Lista de reproducción para cuando estás relajado:\n 1. Clair de Lune - Claude Debussy\n2. Weightless - Marconi Union\n3. Spiegel im Spiegel - Arvo Pärt");
                break;
            default:
                System.out.println("Estado de ánimo no reconocido.");
                break;
        }
    }
}
