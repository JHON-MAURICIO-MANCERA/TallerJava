package co.com.sofka.ejercicios;

import java.util.Scanner;

public class Switch {
    private static String dia;
    private static boolean exit;

    public static void diaLaborable() {
        System.out.println("el día " + dia + " es laboral");
        exit = false;
    }

    public static void diaNoLaboral() {
        System.out.println("el día " + dia + " no es laboral");
    }


    public static void diaSemana() {
        System.out.println("ingrese ele dia de la semana");
        dia = Entradas.entradaStr();
        dia.toLowerCase();
        exit = true;
        do {
            switch (dia) {

                case "DOMINGO":
                    diaNoLaboral();
                    break;

                default:
                    diaLaborable();
                    break;
            }
        } while (exit = false);

    }

    public static void cine() {
        int opc;
        boolean repetir = true;
        do {
            System.out.println(" **********GESTIÓN CINEMATOGRÁFICA**********");
            System.out.println("1. NUEVO ACTOR.");
            System.out.println("2. BUSCAR ACTOR.");
            System.out.println("3. ELIMINAR ACTOR.");
            System.out.println("4. MODIFICAR ACTOR.");
            System.out.println("5. VER TODOS LOS ACTOR.");
            System.out.println("6. VER TODAS LAS PELICULAS DE LOS ACTORES.");
            System.out.println("7. VER CATEGORÍA DE LAS PELÍCULAS DE LOS ACTORES.");
            System.out.println("8. SALIR.");

            opc = Entradas.entradaInt();
            switch (opc) {
                case 1: {
                    repetir = true;
                    break;
                }
                case 2: {
                    repetir = true;
                    break;
                }
                case 3: {
                    repetir = true;
                    break;
                }
                case 4: {
                    repetir = true;
                    break;
                }
                case 5: {
                    repetir = true;
                    break;
                }
                case 6: {
                    repetir = true;
                    break;
                }
                case 7: {
                    repetir = true;
                    break;
                }
                case 8: {
                    repetir = false;
                    break;
                }
                default: {
                    System.out.println("Opción incorrecta.");
                    repetir = true;
                }
            }
        } while (repetir == true);
    }


}


