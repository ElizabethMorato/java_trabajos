/*Ejercicio 3: Generador de Rutinas de Ejercicio
Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
duraciones.
 */

import java.util.Scanner;

public class ejercicioTP1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nivel;

        System.out.println("Por favor, ingresa tu nivel de condición física (principiante, intermedio, avanzado):");
        nivel = input.nextLine().toLowerCase();

        generarRutina(nivel);
    }

    public static void generarRutina(String nivel) {
        switch (nivel) {
            case "principiante":
                System.out.println("Rutina de ejercicio para principiantes:");
                System.out.println("Lunes: 30 minutos de caminata");
                System.out.println("Martes: 20 minutos de yoga");
                System.out.println("Miércoles: 30 minutos de caminata");
                System.out.println("Jueves: 20 minutos de yoga");
                System.out.println("Viernes: 30 minutos de caminata");
                System.out.println("Sábado: Descanso");
                System.out.println("Domingo: 30 minutos de caminata");
                break;
            case "intermedio":
                System.out.println("Rutina de ejercicio para intermedios:");
                System.out.println("Lunes: 45 minutos de correr");
                System.out.println("Martes: 30 minutos de ciclismo");
                System.out.println("Miércoles: 45 minutos de correr");
                System.out.println("Jueves: 30 minutos de ciclismo");
                System.out.println("Viernes: 45 minutos de correr");
                System.out.println("Sábado: 30 minutos de ciclismo");
                System.out.println("Domingo: Descanso");
                break;
            case "avanzado":
                System.out.println("Rutina de ejercicio para avanzados:");
                System.out.println("Lunes: 60 minutos de correr");
                System.out.println("Martes: 45 minutos de ciclismo");
                System.out.println("Miércoles: 60 minutos de correr");
                System.out.println("Jueves: 45 minutos de ciclismo");
                System.out.println("Viernes: 60 minutos de correr");
                System.out.println("Sábado: 45 minutos de ciclismo");
                System.out.println("Domingo: Descanso");
                break;
            default:
                System.out.println("Nivel de condición física no reconocido.");
                break;
        }
    }
}

