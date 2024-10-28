/*Ejercicio 7: Calculadora de Índice de Felicidad
Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
índice de felicidad basado en esos factores.
 */



import java.util.Scanner;

public class ejercicioTP1_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] factores = {
                "Satisfacción con la vida",
                "Nivel de estrés",
                "Nivel de salud",
                "Relaciones personales",
        };

        // Variables para almacenar el puntaje total y los factores válidos ingresados
        int sumaPuntajes = 0;
        int cantidadFactores = factores.length;

        // Solicitar al usuario cada factor y validar la entrada
        for (String factor : factores) {
            int puntaje;
            do {
                System.out.print("En una escala del 1 al 10, ¿cuál es tu nivel de " + factor + "? ");
                puntaje = Integer.parseInt(input.nextLine());
                if (puntaje < 1 || puntaje > 10) {
                    System.out.println("Por favor, ingresa un valor entre 1 y 10.");
                }
            } while (puntaje < 1 || puntaje > 10);

            sumaPuntajes += puntaje;                            //sumaPuntaje= sumaPuntajes + puntaje
        }


        double indiceFelicidad = (double) sumaPuntajes / cantidadFactores;


        System.out.printf("\nTu índice de felicidad es: %.2f sobre 10.\n", indiceFelicidad);

        // calculo nivel de felicidad
        if (indiceFelicidad >= 8) {
            System.out.println("EXCELENTE! Tienes un alto nivel de felicidad.");
        } else if (indiceFelicidad >= 5) {
            System.out.println("Tu nivel de felicidad es promedio. Hay áreas que pueden mejorar.");
        } else {
            System.out.println("Parece que estás experimentando un nivel bajo de felicidad. Tal vez puedas identificar áreas para mejorar.");
        }

        input.close();
    }
}

