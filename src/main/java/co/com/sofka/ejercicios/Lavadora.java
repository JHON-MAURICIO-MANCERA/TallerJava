package co.com.sofka.ejercicios;

public class Lavadora extends Electrodomestico {
    private int carga;
    private final int CARGA=5;

    public Lavadora(){
        this.carga = CARGA;
    }

    public Lavadora(float precioBase, int peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.carga = CARGA;
    }

    public Lavadora(float precioBase,
                    String color,
                    char consumoEnergetico,
                    float peso,
                    int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public float precioFinal() {
        float precio=super.precioFinal();
        if(this.getCarga()>30){
            precio += 50;
        }
        return precio;
    }
}