package co.com.sofka.ejercicios;

import java.util.HashMap;

 public class Electrodomestico {
    protected float precioBase;
    protected float peso;
    protected String color;
    protected char consumoEnergetico;

    final float PRECIO_BASE_DEFAULT = 100;
    final float PESO_DEFAULT = 5;
    final String COLOR_DEFAULT = "blanco";
    final char CONSUMO_ENERGETICO_DEFAULT = 'F';

    final String COLOR_NEGRO = "negro";
    final String COLOR_ROJO = "rojo";
    final String COLOR_AZUL = "azul";
    final String COLOR_GRIS = "gris";
    final int PRECIO_0_19KG = 10;
    final int PRECIO_20_49KG = 50;
    final int PRECIO_50_79KG = 80;
    final int PRECIO_80KG = 100;

    final HashMap<String,Integer> PRECIO_POR_CONSUMO = new HashMap<String, Integer>(){{
        put("A",100);
        put("B",80);
        put("C",60);
        put("D",50);
        put("E",30);
        put("F",10);
    }};

    public Electrodomestico(){
        this.precioBase = PRECIO_BASE_DEFAULT;
        this.color = COLOR_DEFAULT;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
        this.peso = PESO_DEFAULT;
    }

    public Electrodomestico(float precioBase, float peso) {
        this.precioBase = precioBase;
        this.color = COLOR_DEFAULT;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
        this.peso = peso;
    }

    public Electrodomestico(float precioBase,
                            String color,
                            char consumoEnergetico,
                            float peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public float getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    private char comprobarConsumoEnergetico(char consumoEnergetico) {
        if( (consumoEnergetico >= 'A') && ( consumoEnergetico <= 'F') ) {
            return consumoEnergetico;
        } else {
            return this.CONSUMO_ENERGETICO_DEFAULT;
        }
    }

    private String comprobarColor(String color) {
        color=color.toLowerCase();
        if ( (color.equals(this.COLOR_DEFAULT))
                || (color.equals(this.COLOR_NEGRO))
                || (color.equals(this.COLOR_ROJO))
                || (color.equals(this.COLOR_AZUL))
                || (color.equals(this.COLOR_GRIS))) {
            return color;
        } else {
            return this.COLOR_DEFAULT;
        }
    }
    public float precioFinal(){
        float total=this.getPrecioBase();

        for (int i=0; i < this.PRECIO_POR_CONSUMO.size(); i++){
            if(i+'A' == this.getConsumoEnergetico()){
                total += this.PRECIO_POR_CONSUMO.get(Character.toString(i+'A'));
            }
        }

        if (this.getPeso()>=0 && this.getPeso()<=19) {
            total += PRECIO_0_19KG;
        } else if (this.getPeso()>=20 && this.getPeso()<=49) {
            total += PRECIO_20_49KG;
        } else if (this.getPeso()>=50 && this.getPeso()<=79) {
            total += PRECIO_50_79KG;
        } else{
            total += PRECIO_80KG;
        }

        return total;
    }
}
