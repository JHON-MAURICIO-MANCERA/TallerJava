package co.com.sofka.ejercicios;

public class Texto {
    private static String frase = "La sonrisa sera la mejor arma contra la tristeza";
    private static String fraseIngresada;
    private static int conA;
    private static int conE;
    private static int conI;
    private static int conO;
    private static int conU;
    private static char letra;


    public static void cambiarCaracter() {
        System.out.println("frase original:\" " + frase + "\" \n frase con cambios de caracter:\"" + frase.replace("a", "e") + "\"");
        System.out.println("complete la frase ingresando por consola");
        fraseIngresada = Entradas.entradaStr();
        System.out.println(frase + " " + fraseIngresada);
    }

    public static void fraseSinEspacios() {
        System.out.println("ingrese una frase");
        fraseIngresada = Entradas.entradaStr();
        System.out.println("frase sin espacios: " + fraseIngresada.trim());

    }

    public static void tamanioFrase() {
        System.out.println("ingrese una frase");
        fraseIngresada = Entradas.entradaStr();
        System.out.println("la frase tiene: " + fraseIngresada.length() + " caracteres");
        fraseIngresada.toLowerCase();}

     public static void cantVocales(){

        for (int i = 0; i <= (fraseIngresada.length() - 1); i++) {
            letra = fraseIngresada.charAt(i);
            if (letra == 'a')
                conA++;
            if (letra == 'e')
                conE++;
            if (letra == 'i')
                conI++;
            if (letra == 'o')
                conO++;
            if (letra == 'u')
                conU++;

        }
        System.out.println("cantidad de vocales A: " + conA + "\ncantidad de vocales E: " + conE + "\ncantidad de vocales I: " + conI + "\ncantidad de vocales O: " + conO + "\ncantidad de vocales U: " + conU );

    }


}
