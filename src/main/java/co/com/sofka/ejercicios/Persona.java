package co.com.sofka.ejercicios;
/*
public class Persona {
    private static int imc_dePeso = -1;
    private static int imc_idealPeso = 0;
    private static int imc_sobrePeso = 1;
    private String nombre;
    private int edad;
    private int dni;
    private  int peso;
    private  int altura;
    private char generoDefault = 'M';
    private char genero;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
        this.genero = generoDefault;
    }

    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, int peso, int altura, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = ;
        this.peso = peso;
        this.altura = altura;
        this.genero = genero;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", peso=" + peso +
                ", altura=" + altura +
                ", genero='" + genero + '\'' +
                '}';
    }

    public static int calcularIMC(int peso,int altura) {
       Double imc = peso / altura;
        if (imc < 20) {
            imc = imc_dePeso;
            System.out.println("está por debajo de su peso ideal");
        }
        if (20 <= imc && imc <= 25) {
            imc = imc_idealPeso;
            System.out.println("está en su peso ideal");
        } else {
            imc = imc_sobrePeso;
            System.out.println("está por encima de su peso ideal");
        }
        return imc;

    }

 public static void comprobarSexo(char genero){
        if (genero == 'M' || genero == 'F')
            genero=genero;
        else
            genero='H';
 }
}
*/
import java.util.Random;

import static java.lang.Math.pow;

public class Persona {
    private String nombre;
    private final String dni;
    private int edad;
    private char sexo;
    private float peso;
    private float altura;
    private final char SEXO = 'm';
    private final int SOBREPESO = 1;
    private final int PESO_IDEAL = 0;
    private final int PESO_POR_DEBAJO_IDEAL = -1;
    private final int IMC_LIMITE1 = 20;
    private final int IMC_LIMITE2 = 25;
    private final float PESO_DEFAULT = 60;
    private final float ALTURA_DEFAULT = (float) 1.60;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = generarDNI();
        this.sexo = this.SEXO;
        this.peso = this.getPESO_DEFAULT();
        this.altura = this.getALTURA_DEFAULT();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = this.getPESO_DEFAULT();
        this.altura = this.getALTURA_DEFAULT();
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.peso = peso;
        this.altura = altura;
        this.sexo = comprobarSexo(sexo);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public char getSEXO() {
        return SEXO;
    }

    public int getSOBREPESO() {
        return SOBREPESO;
    }

    public int getPESO_IDEAL() {
        return PESO_IDEAL;
    }

    public int getPESO_POR_DEBAJO_IDEAL() {
        return PESO_POR_DEBAJO_IDEAL;
    }

    public int getIMC_LIMITE1() {
        return IMC_LIMITE1;
    }

    public int getIMC_LIMITE2() {
        return IMC_LIMITE2;
    }

    public float getPESO_DEFAULT() {
        return PESO_DEFAULT;
    }

    public float getALTURA_DEFAULT() {
        return ALTURA_DEFAULT;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public boolean serMayorDeEdad() {
        return (this.getEdad() >= 18);
    }

    public int calularIMC() {
        double imc = this.getPeso() / pow(this.getAltura(), 2);
        if (imc < this.getIMC_LIMITE1()) {
            return this.getPESO_POR_DEBAJO_IDEAL();
        } else if ((imc >= this.getIMC_LIMITE1()) && (imc <= this.getIMC_LIMITE2())) {
            return this.getPESO_IDEAL();
        } else {
            return this.getSOBREPESO();
        }
    }

    private char comprobarSexo(char sexo) {
        if ((sexo == 'h') || (sexo == 'm')) {
            return sexo;
        } else {
            return this.getSEXO();
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre='" + this.getNombre() + '\'' + ", Dni='" + this.getDni() + '\'' +
                ", Edad=" + this.getEdad() + ", Sexo=" + this.getSexo() + ", Peso=" + this.getPeso() +
                ", Altura=" + this.getAltura() + '}';
    }

    private String generarDNI() {
        Random random = new Random();
        int randomNumber;
        StringBuilder dniAuxiliar = new StringBuilder();
        randomNumber = random.nextInt(10);
        for (int i = 0; i < 7; i++) {
            dniAuxiliar.append(randomNumber);
            randomNumber = random.nextInt(10);
        }
        return dniAuxiliar.toString();
    }
}