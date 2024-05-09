/* 1.- Dado una hora con el formato Hora (1..00), Minutos (1..59), y Segundos (1..59), calcule 
y visualice la fecha con un segundo más. Es decir, si la hora es 18:24:59, mostrar 18:25:00. 
SACCHETTI, Maria Giselle C2*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // ingreso los datos
    System.out.println("Ingrese la hora: ");
    int hora = scanner.nextInt();

    System.out.println("Ingrese los minutos:  ");
    int minutos = scanner.nextInt();

    System.out.println("Ingrese los segundos: ");
    int segundos = scanner.nextInt();

    if (segundos == 59) {
      if (minutos == 59) {
        if (hora == 23) {
          hora = 0;
          minutos = 0;
          segundos = 0;
        } else {
          segundos = 0;
          minutos = 0;
          hora = hora + 1;
        }
      } else {
        segundos = 0;
        minutos = minutos + 1;
      }
    } else {
      segundos = segundos + 1;
    }

    System.out.println("La hora con un segundo más es: " + hora + ":" + minutos + ":" + segundos);

    scanner.close();

  }
}