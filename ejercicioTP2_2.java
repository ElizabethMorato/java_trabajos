
import java.util.Scanner;

public class ejercicioTP2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa el precio del producto:");
        double precio = scanner.nextDouble();

        System.out.println("ingresa la categoría del cliente (estudiante, adulto, jubilado):");
        String categoria = scanner.next().toLowerCase();

        double precioFinal = calcularPrecioFinal(precio, categoria);
        double cantDeDescuento= precio - precioFinal;

        System.out.println("El descuentos es: " + cantDeDescuento+" pesos ");
        System.out.println("El precio final con descuento es: " + precioFinal+" pesos ");
    }

    final static double  DESCUENTO_POR_ESRUDIANTE=0.10;
    final static double  DESCUENTO_POR_ADULTO=0.15;
    final static double  DESCUENTO_POR_JUBILADO=0.25;

    public static double calcularPrecioFinal(double precio, String categoria) {
        double descuento = 0;
        switch (categoria) {
            case "estudiante":
                descuento = DESCUENTO_POR_ESRUDIANTE;
                break;
            case "adulto":
                descuento = DESCUENTO_POR_ADULTO;
                break;
            case "jubilado":
                descuento = DESCUENTO_POR_JUBILADO;
                break;
            default:
                System.out.println("Categoría no reconocida. No se aplica descuento.");
                break;
        }
        return precio * (1 - descuento);
    }
}
