package co.com.sofka.Main;

import co.com.sofka.ejercicios.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
    static double area;
    static double precio;
    static int ejercicio;


    public static void main(String[] args) {
        boolean opcion = true;
        do {
            System.out.println("Digite el número del ejercicio que desea ejecutar: \n" +

                    "0. Salir.\n" +
                    "1. Identificar el número mayor.\n" +
                    "2. Identificar si un número es mayor, menor o igual a otro.\n" +
                    "3. Hallar el área de un círculo.\n" +
                    "4. Calcular el precio de un producto con Iva incluido.\n" +
                    "5. Indica cuáles son los números pares e impares del 1 al 100 (while).\n" +
                    "6. Indica cuáles son los números pares e impares del 1 al 100 (for).\n" +
                    "7. Confirma si un número es mayor a cero.\n" +
                    "8. Verifica si un día de la semana es laboral o no.\n" +
                    "9. Reemplaza la vocal (a) por (e).\n" +
                    "10. Elimina espacios entre palabras.\n" +
                    "11. Determinar longitud de una frase y cantidad de vocales en esta.\n" +
                    "12. Diferencias entre dos palabras po frases.\n" +
                    "13. Consulta fecha y hora actual.\n" +
                    "14. Ingrese número para imprimir con saltos de 2 en dos hasta llegar a 1000\n" +
                    "15. Mostrar menú Gestión cinematográfica.\n\n" +

                    "ingrese el numero del ejercicio\n");
            ejercicio = Entradas.entradaInt();
            switch (ejercicio) {
                case 0:
                    opcion = false;
                    break;

                case (1):
                    int number1 = 10;
                    int number2 = 11;
                    NumMayor tipNumber = new NumMayor();
                    tipNumber.mayor_manor_igu(number1, number2);
                    System.out.println("ingrese primer número");
                    opcion = false;
                    break;

                case 2:
                    // ejercicio numero 1
                    System.out.println("ingrese el primer número");
                    int num1 = Entradas.entradaInt();
                    System.out.println("ingrese segundo número");
                    int num2 = Entradas.entradaInt();
                    NumMayor tipNumber2 = new NumMayor();
                    tipNumber2.mayor_manor_igu(num1, num2);
                    opcion = false;
                    break;
                case 3:
                    // ejercicio numero 3
                    System.out.println("ingrese el radio del círculo en cm");
                    double radio = Entradas.entrada();
                    area = Operaciones.areaCirculo(radio);
                    System.out.println("el area del círculo es: " + area + "cm^2");
                    opcion = false;
                    break;
                case 4:

                    System.out.println("ingrese el valor del producto");
                    precio = Entradas.entrada();
                    System.out.println("el precio mas iva es: " + Operaciones.precioIva(precio));
                    opcion = false;
                    break;
                case 5:
                    //EJERCICIO NUMERO 5
                    ParImpar.parImp();
                    opcion = false;
                    break;
                case 6:
                    //EJERCICIO NUMERO 6
                    ParImpar.parImpFor();
                    opcion = false;
                    break;
                case 7:
                    Operaciones.mayorCero();
                    opcion = false;
                    break;
                case 8:
                    Switch.diaSemana();
                    opcion = false;
                    break;
                case 9:
                    Texto.cambiarCaracter();
                    opcion = false;
                    break;
                case 10:
                    Texto.fraseSinEspacios();
                    opcion = false;
                    break;
                case 11:
                    Texto.tamanioFrase();
                    Texto.cantVocales();
                    opcion = false;
                    break;

                case 13:
                    Tiempo.fechaHora();
                    opcion = false;
                    break;
                case 12:
                    Operaciones.palabrasIguales();
                    opcion = false;
                    break;
                case 14:
                    Operaciones.deDosEnDos();
                    opcion = false;
                    break;
                case 15:
                    Switch.cine();
                    opcion = false;
                    break;
                case 16:
                    final int SOBREPESO = 1;
                    final int PESO_IDEAL = 0;
                    final int PESO_POR_DEBAJO_IDEAL = -1;

                    InputStreamReader in = new InputStreamReader(System.in);
                    BufferedReader buffer = new BufferedReader(in);
                    String nombre = "";
                    char sexo = 0;
                    int edad = 0;
                    float peso = 0;
                    float altura = 0;

                    System.out.println("Ingrese el nombre");
                    try {
                        nombre = buffer.readLine();
                    } catch (IOException e) {
                        System.out.println("Error: "+e.getMessage());
                    }

                    System.out.println("Ingrese la edad");
                    try {
                        edad = Integer.parseInt(buffer.readLine());
                    } catch (IOException e) {
                        System.out.println("Error: "+e.getMessage());
                    }

                    System.out.println("Ingrese el sexo");
                    try {
                        sexo = buffer.readLine().charAt(0);
                    } catch (IOException e) {
                        System.out.println("Error: "+e.getMessage());
                    }

                    System.out.println("Ingrese el peso");
                    try {
                        peso = Float.parseFloat(buffer.readLine());
                    } catch (IOException e) {
                        System.out.println("Error: "+e.getMessage());
                    }

                    System.out.println("Ingrese la altura");
                    try {
                        altura = Float.parseFloat(buffer.readLine());
                    } catch (IOException e) {
                        System.out.println("Error: "+e.getMessage());
                    }

                    Persona p1 = new Persona(nombre,edad,sexo,peso,altura);
                    Persona p2 = new Persona(nombre,edad,sexo);
                    Persona p3 = new Persona();

                    p3.setNombre(nombre);
                    p3.setEdad(edad);
                    p3.setAltura(altura);
                    p3.setPeso(peso);
                    p3.setSexo(sexo);

                    Persona[] personas ={p1,p2,p3};
                    for (Persona persona : personas) {
                        System.out.println(persona.toString());
                        switch (persona.calularIMC()) {
                            case SOBREPESO:
                                System.out.println("tiene sobre peso");
                                break;
                            case PESO_IDEAL:
                                System.out.println("tiene un peso ideal");
                                break;
                            case PESO_POR_DEBAJO_IDEAL:
                                System.out.println("tiene un peso por debajo del ideal");
                                break;
                        }
                        if (persona.serMayorDeEdad()) {
                            System.out.println("es mayor de edad");
                        } else {
                            System.out.println("no es mayor de edad");
                        }
                    }

                    opcion=false;
                    break;

                default:
                    System.out.println("ingrese una opción valida");


            }

        } while (opcion == true);
    }
}
