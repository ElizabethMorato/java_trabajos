import java.util.Scanner;

public class ejercicioTP2_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String estadoAnimo,recomendacion;

        System.out.println("Por favor, ingresa tu estado de ánimo (feliz, triste, enérgico, relajado):");
        estadoAnimo = input.nextLine().toLowerCase();

        recomendacion = recomendarActividad(estadoAnimo);
        System.out.println("Te recomendo la siguiente actividad: " + recomendacion);
    }

    public static String recomendarActividad(String estadoAnimo) {
        switch (estadoAnimo) {
            case "feliz":
                return "Salir a pasear con amigos o ver alguna serie que te guste";
            case "triste":
                return "Ver una película cómica o comer helado";
            case "enérgico":
                return "Salir a correr";
            case "relajado":
                return "Leer un buen libro ";
            default:
                return "estado de animo no encontrado, pero busca algo que para que te sientas mejor";
        }
    }
}

