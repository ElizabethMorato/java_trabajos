import java.util.Scanner;

public class ejercicioTP2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horasDormir, horasEjercicio, comidasSaludables;

        System.out.println("ingresa cuántas horas al día duermes:");
        horasDormir = Integer.parseInt(input.nextLine());

        System.out.println("ingresa cuántas horas al día haces ejercicio:");
        horasEjercicio = Integer.parseInt(input.nextLine());

        System.out.println("ingresa cuántas comidas saludables consumes al día:");
        comidasSaludables = Integer.parseInt(input.nextLine());

        String evaluacion = evaluarHabitos(horasDormir, horasEjercicio, comidasSaludables);
        System.out.println("tus hábitos saludables son : " + evaluacion);
    }
    final static int CANT_MIN_DORMIR=7;
    final static int CANT_MIN_EJERCICIO=1;
    final static int CANT_MIN_COMIDAS_SALUDABLES=3;

    public static String evaluarHabitos(int horasDormir, int horasEjercicio, int comidasSaludables) {
        if (horasDormir >= CANT_MIN_DORMIR && horasEjercicio >= CANT_MIN_EJERCICIO && comidasSaludables >= CANT_MIN_COMIDAS_SALUDABLES) {
            return "Tienes hábitos saludables excelentes.";
        } else if (horasDormir >= 6 && horasEjercicio >= 0.5 && comidasSaludables >= 2) {
            return "Tus hábitos saludables son buenos, pero podrías mejorar.";
        } else {
            return "Deberías mejorar tus hábitos saludables.";
        }
    }
}

