package co.com.sofka.ejercicios;


public class Television extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;

    final int RESOLUCION = 20;
    final boolean SINTONIZADOR_TDT=false;

    public Television() {
        this.resolucion = RESOLUCION;
        this.sintonizadorTDT = SINTONIZADOR_TDT;
    }

    public Television(float precioBase, float peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.resolucion = RESOLUCION;
        this.sintonizadorTDT = SINTONIZADOR_TDT;
    }

    public Television(float precioBase,
                      String color,
                      char consumoEnergetico,
                      float peso, int resolucion,
                      boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public float precioFinal() {
        float precio=super.precioFinal();
        if(this.getResolucion()>40){
            precio += precio*0.3;
        }
        if(this.isSintonizadorTDT()){
            precio += 50;
        }
        return precio;
    }
}
