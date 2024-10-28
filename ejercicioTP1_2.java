/* Ejercicio 2: Calculadora de Calorías Quemadas
Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
ejercicio.
 */

import java.util.Scanner;

public class ejercicioTP1_2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int duracion;
        double peso,caloriasQuemadas;

        System.out.println("ingresa tu peso en kilogramos: ");
        peso =Double.parseDouble(input.nextLine());

        System.out.println("ingresa la duración del ejercicio en minutos: ");
        duracion = Integer.parseInt(input.nextLine());


        System.out.println("ingresa que  tipo de ejercicio realiza (correr, nadar, andar en bicicleta):  ");
        String tipoEjercicio = input.nextLine().toLowerCase();

        caloriasQuemadas = calcularCaloriasQuemadas(peso, duracion, tipoEjercicio);

        System.out.println("Las calorías quemadas son:  " + caloriasQuemadas);
    }

    public static double calcularCaloriasQuemadas(double peso, int duracion, String tipoEjercicio) {
        double CaloriasPorMinuto;

        switch (tipoEjercicio) {
            case "correr":
                CaloriasPorMinuto = 0.077; // Ejemplo de tasa para correr
                break;
            case "nadar":
                CaloriasPorMinuto = 0.095; // Ejemplo de tasa para nadar
                break;
            case "andar en bicicleta":
                CaloriasPorMinuto = 0.068; // Ejemplo de tasa para andar en bicicleta
                break;
            default:
                System.out.println("si no realiza ningun de los ejercicios anteriores.En promedio la calorias que quemadas por minutos son: ");
                CaloriasPorMinuto = 0.070; // Tasa por defecto
                break;
        }
        return peso * duracion * CaloriasPorMinuto;
    }
}
