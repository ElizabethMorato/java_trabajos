/*Ejercicio 6: Generador de Planes de Estudio
Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un
plan de estudio semanal distribuyendo esas horas en diferentes materias.
 */

import java.util.Scanner;

public class ejercicioTP1_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horasDiarias;


        //pido cantidad de horas
        do {
            System.out.print("¿Cuantas horas al día puedes estudiar?:  ");
            horasDiarias = Integer.parseInt(input.nextLine());
            if (horasDiarias < 0) {
                System.out.println("ingrese un numero positivo de horas:  ");
            }
        } while (horasDiarias < 0);


        // Calcular horas semanal
        int horasSemanales = horasDiarias * 7;

        // Definir las materias
        String[] materias = {"Matemáticas", "Programacion", "Arquitectura", "sistemasOperativos"};
        int cantidadMaterias = materias.length;

        // Calcular horas por materia, distribuidas equitativamente
        int horasPorMateria = horasSemanales / cantidadMaterias;
        int horasRestantes = horasSemanales % cantidadMaterias;

        // Mostrar plan de estudio semanal
        System.out.println("\nPlan de estudio semanal:");
        for (String materia : materias) {
            int horasAsignadas = horasPorMateria + (horasRestantes > 0 ? 1 : 0);
            horasRestantes--;
            System.out.println("- " + materia + ": " + horasAsignadas + " horas");
        }

        input.close();
    }
}

