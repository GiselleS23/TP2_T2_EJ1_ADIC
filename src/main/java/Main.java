/* 1.- Dado una hora de un determinado día con el formato Hora (1..24), Minutos (1..60), y Segundos (1..60), calcule 
y visualice la fecha con un segundo más. Es decir, si la hora es 18:24:59, mostrar 18:25:00. 
SACCHETTI, Maria Giselle C2*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    int hora, minutos, segundos;
    
    //ingreso los datos
    System.out.println("Ingrese la hora entre 1 y 24: ");
    hora = scanner.nextInt();
    System.out.println("Ingrese los minutos entre 1 y 60:  ");
    minutos = scanner.nextInt();
    System.out.println("Ingrese los segundos entre 1 y 60: " );
    segundos = scanner.nextInt();

    //incremento de a 1 segundo
    segundos++;

    //validaciones
    if (segundos == 60) {
        segundos = 0;
        minutos++;
    }

    if (minutos == 60) {
        minutos = 0;
        hora++;
    }

    if (hora == 25) {
        hora = 1;
    }

    System.out.println("La hora con un segundo más es: " + hora + ":" + minutos + ":" + segundos);

    scanner.close();

    
  }
}