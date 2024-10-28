/*Ejercicio 5: Calculadora de Costo de Viaje
Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
calcule e imprima el costo total del viaje.
 */

import java.util.Scanner;

public class ejercicioTP1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distancia,consumo,precioCombustible,costoTotal;

        System.out.println("ingresa la distancia del viaje en kilómetros:");
        distancia = input.nextDouble();

        System.out.println("ingresa el consumo de combustible del vehículo en litros por kilómetro:");
        consumo = input.nextDouble();

        System.out.println("ingresa el precio del combustible por litro:");
        precioCombustible = input.nextDouble();

        costoTotal = calcularCostoViaje(distancia, consumo, precioCombustible);
        System.out.println("El costo total del viaje es: " + costoTotal + " pesos.");
    }

    public static double calcularCostoViaje(double distancia, double consumo, double precioCombustible) {
        return distancia * consumo * precioCombustible;
    }
}



