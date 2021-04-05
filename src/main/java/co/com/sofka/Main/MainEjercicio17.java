package co.com.sofka.Main;

import co.com.sofka.ejercicios.Electrodomestico;
import co.com.sofka.ejercicios.Lavadora;
import co.com.sofka.ejercicios.Television;



public class MainEjercicio17 {



    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos_arr = new Electrodomestico[10];
        float precioTotalLavadoras=0;
        float precioTotalTelevisores=0;
        float precioTotalElectrodomesticos=0;

        electrodomesticos_arr[0] = new Electrodomestico(10,5);
        electrodomesticos_arr[1] = new Electrodomestico(30,5);
        electrodomesticos_arr[2] = new Electrodomestico(30,5);
        electrodomesticos_arr[3] = new Electrodomestico(30,5);
        electrodomesticos_arr[4] = new Lavadora(100,"azul",'A',20,15);
        electrodomesticos_arr[5] = new Lavadora(80,"gris",'B',25,15);
        electrodomesticos_arr[7] = new Television(35,"negro",'A',15,40,true);
        electrodomesticos_arr[6] = new Lavadora(15,3);
        electrodomesticos_arr[8] = new Television(20,5);
        electrodomesticos_arr[9] = new Television(22,5);

        for (Electrodomestico electrodomestico : electrodomesticos_arr) {
            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += electrodomestico.precioFinal();
            }
            if (electrodomestico instanceof Television) {
                precioTotalTelevisores += electrodomestico.precioFinal();
            }
            precioTotalElectrodomesticos += electrodomestico.precioFinal();
        }

        System.out.println("Precio total lavadoras: "+ precioTotalLavadoras);
        System.out.println(("Precio total televisores: "+ precioTotalTelevisores));
        System.out.println("Precio total electrodomesticos: " + precioTotalElectrodomesticos);
    }

}


