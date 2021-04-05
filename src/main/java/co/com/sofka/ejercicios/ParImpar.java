package co.com.sofka.ejercicios;

import java.util.ArrayList;

public class ParImpar {
    private static int i;
    private static ArrayList<Integer> numPar = new ArrayList<>();
    private static ArrayList<Integer> numImp = new ArrayList<>();

    public static void parImp() {

        while (i <= 100) {
            if ((i % 2) == 0) {
                numPar.add(i);
            } else {
                numImp.add(i);
            }
            i++;
        }
        System.out.println("números impares del 1 al 100 con while:\n" + numImp);
        System.out.println("números pares del 1 al 100 con while:\n" + numPar);
        numImp.clear();
        numPar.clear();
    }

    public static void parImpFor() {
        for (i = 0; i <= 100; i++) {

            if ((i % 2) == 0) {
                numPar.add(i);
            } else {
                numImp.add(i);
            }

        }
        System.out.println("números impares del 1 al 100 con for:\n" + numImp);
        System.out.println("números pares del 1 al 100 con for:\n" + numPar);
        numImp.clear();
        numPar.clear();

    }
}

