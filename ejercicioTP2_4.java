
import java.util.Scanner;

public class ejercicioTP2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, ingresa tu peso en kilogramos:");
        double peso =Double.parseDouble(input.nextLine());

        System.out.println("Por favor, ingresa tu altura en metros:");
        double altura =Double.parseDouble(input.nextLine());

        double imc = calcularIMC(peso, altura);
        String recomendacion = obtenerRecomendacion(imc);

        System.out.println("Tu IMC es: " + imc);
        System.out.println("Recomendación: " + recomendacion);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    final static Double BAJO_PESO=18.5;
    final static Double PESO_NORMAL=24.9;
    final static Double SOBREPESO=29.9;

    public static String obtenerRecomendacion(double imc) {
        if (imc < BAJO_PESO) {
            return "Bajo peso";
        } else if (imc >= BAJO_PESO && imc < PESO_NORMAL) {
            return "Peso normal";
        } else if (imc >= PESO_NORMAL && imc < SOBREPESO) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}
