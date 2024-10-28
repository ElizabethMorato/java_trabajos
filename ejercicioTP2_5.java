
import java.util.Scanner;
import java.util.Random;

public class ejercicioTP2_5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String eleccionUsuario,eleccionComputadora;
        Random random = new Random();

        System.out.println(" elige entre piedra, papel o tijera:");
        eleccionUsuario = input.nextLine().toLowerCase();

        String[] opciones = {"piedra", "papel", "tijera"};
        eleccionComputadora = opciones[random.nextInt(opciones.length)];

        System.out.println("La computadora eligió: " + eleccionComputadora);

        String resultado = determinarGanador(eleccionUsuario, eleccionComputadora);
        System.out.println(resultado);
    }

    public static String determinarGanador(String usuario, String computadora) {
        if (usuario.equals(computadora)) {
            return "Empate";
        } else if ((usuario.equals("piedra") && computadora.equals("tijera")) ||
                (usuario.equals("papel") && computadora.equals("piedra")) ||
                (usuario.equals("tijera") && computadora.equals("papel"))) {
            return "Ganaste";
        } else {
            return "Perdiste";
        }
    }
}
