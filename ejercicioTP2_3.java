/*Ejercicio 3: Generador de Rutinas de Ejercicio
Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
duraciones.
 */

import java.util.Scanner;

public class ejercicioTP2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String genero;

        System.out.println("ingresa tu género de libro favorito (fantasia, misterio, romance, ciencia ficcion):");
        genero = scanner.nextLine().toLowerCase();

        String recomendacion = recomendarLibro(genero);
        System.out.println("Recomendacion de libro: " + recomendacion);
    }

    public static String recomendarLibro(String genero) {
        switch (genero) {
            case "fantasia":
                return "Juego de tronos";
            case "misterio":
                return "las aventuras de sherlock holmes ";
            case "romance":
                return "Romeo y julieta";
            case "ciencia ficcion":
                return "Correr o morir";
            default:
                return "en casa de ninguna de las anteriores, puedo recomendar una de animacion como \" el principito \" ";
        }
    }
}