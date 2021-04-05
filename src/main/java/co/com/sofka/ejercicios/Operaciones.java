package co.com.sofka.ejercicios;

public class Operaciones {
    static double area;
    static double total;
    static String primeraPalabra;
    static String segundaPalabra;
    static int numero;

    public static double areaCirculo(double a) {

        area = Math.PI * Math.pow(a, 2);
        return area;

    }

    public static double precioIva(double precio) {
        return total = ((precio * 21) / 100) + precio;
    }

    public static void mayorCero() {
        int numero;
        do {
            System.out.println("ingrese un numero mayor que cero");
            numero = Entradas.entradaInt();
        } while (numero < 0);
        System.out.println("el numero es: " + numero);

    }

    public static void palabrasIguales() {
        System.out.println("ingrese la primera palabra");
        primeraPalabra = Entradas.entradaStr();
        System.out.println("ingrese la segunda palabra");
        segundaPalabra = Entradas.entradaStr();


        if (primeraPalabra.length() == segundaPalabra.length()) {
            if (primeraPalabra.equals(segundaPalabra)) {
                System.out.println("Las palabras" + primeraPalabra + " y " + segundaPalabra + " son iguales.");
            } else {
                for (int i = 0; i < primeraPalabra.length(); i++) {
                    if (primeraPalabra.charAt(i) != segundaPalabra.charAt(i)) {
                        System.out.println(" Las palabras no coinciden en la posición: " + i);
                        System.out.println("Donde se tiene " + primeraPalabra.charAt(i) + " en vez de " + segundaPalabra.charAt(i));
                    }
                }
            }
        } else {
            System.out.println("Las palabras no son iguales.");
        }
    }

    public static void deDosEnDos() {
        System.out.println("ingrese un numero");
        numero = Entradas.entradaInt();
        System.out.println("los numeros de 2 en 2:\n");
        for (int i = (numero+2); i <= 1000; i+=2) {
            System.out.println(i);

        }

    }
}
