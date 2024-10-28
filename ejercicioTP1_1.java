/* ejercicio 1: GENERADOR DE HOROSCOPO
Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.
 */

import java.util.Scanner;

public class ejercicioTP1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declaro las variables
        int dia,mes,anio;

        //pido la fecha de nacimiento del usuario
        System.out.println("ingrese tu dia de nacimiento: " );
        dia =Integer.parseInt(input.nextLine());

        System.out.println("ingrese tu mes de nacimiento: " );
        mes =Integer.parseInt(input.nextLine());

        System.out.println("ingrese tu año de nacimiento: " );
        anio =Integer.parseInt(input.nextLine());


        //determino el signo de usurio y su correspondiente mensaje
        String signo = determinarElSigno(dia, mes);
        String mensaje = MensajeDelSigno(signo);

        System.out.println("tu signo del zodiaco es:  "+signo);
        System.out.println("tu mensaje del zodiaco es:  "+mensaje);

        }
    public static String determinarElSigno(int dia, int mes) {
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }
    public static String MensajeDelSigno(String signo) {
        switch (signo) {
            case "Aries":
                return "No tener miedo a fallar, ya que lo peor que le podría pasar es quedarse con las ganas de no haberlo intentado";
            case "Tauro":
                return "Deja de plantear en tu cabeza escenarios inventados y acepta que no puedes controlar lo que pasó o lo que todavía no ha pasado, vive el presente y déjate llevar.";
            case "Géminis":
                return "lo mejor que se puede hacer es cambiar el plan, pero lo que nunca se debe hacer es escoger otra meta";
            case "Cáncer":
                return "Dedícate a vivir tu vida sin esperar que los demás te den todo el cariño y el amor que tú les demuestras en cada uno de tus actos..";
            case "Leo":
                return "Hoy es un día para brillar y mostrar tu liderazgo.";
            case "Virgo":
                return "no esperar nada de nadie ni estar esperando siempre a que suceda algo que nunca termina de pasar";
            case "Libra":
                return "principal medida del éxito es la paz mental y la tranquilidad máxima";
            case "Escorpio":
                return "no dejar pasar una ocasión especial para experimentar y disfrutar de algo nuevo,";
            case "Sagitario":
                return "No tienes que estar todo el tiempo pretendiendo ser la estrella que guía a las personas de su alrededor";
            case "Capricornio":
                return "deja de querer tener siempre la razón y abandona las luchas inútiles que se te plantean a lo largo del día!";
            case "Acuario":
                return "no permitir ser la duda de otra persona, es decir, márcate un objetivo y sigue tu instinto, si esa persona está insegura con alguna decisión que tenga que ver contigo sé tú quien dé un paso al frente";
            case "Piscis":
                return " nunca es demasiado tarde para empezar de cero";
            default:
                return "No se pudo determinar el mensaje de horóscopo.";
        }
    }

}
