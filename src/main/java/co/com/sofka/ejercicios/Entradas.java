package co.com.sofka.ejercicios;

import java.util.Scanner;

public class Entradas {
    private static String inString;

 public static double entrada () {
     Scanner scanner = new Scanner(System.in);
     var number = Double.parseDouble(scanner.nextLine());
     return (number);
 }
    public static int entradaInt () {
        Scanner scannerInt = new Scanner(System.in);
        int inInt = Integer.parseInt(scannerInt.nextLine());
        return (inInt);
    }

    public static String entradaStr(){
        Scanner scannerInt = new Scanner(System.in);
        inString=scannerInt.nextLine();
        return inString;
    }
}
