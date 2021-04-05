package co.com.sofka.Main;

import co.com.sofka.ejercicios.Serie;
import co.com.sofka.ejercicios.VideoJuego;

import java.util.ArrayList;

public class MainEjercicio18 {
    private ArrayList<Serie> listaSeries;
    private ArrayList<VideoJuego> listaVideoJuegos;

    public MainEjercicio18() {
        this.listaSeries = new ArrayList<>();
        this.listaVideoJuegos =new ArrayList<>();
    }

    public void llenarListas(){

        Serie serie1 = new Serie();
        Serie serie2 = new Serie("Los sopranos", "Jhonatan");
        Serie serie3 = new Serie("Euphory", 5, "Comeria","Luis" );
        serie3.entregar();
        Serie serie4 = new Serie("South Park", 14, "Animada","Comedy center" );
        Serie serie5 = new Serie("lilo", 2, "terror","WB" );
        serie5.entregar();

        VideoJuego videoJuego1 = new VideoJuego();
        VideoJuego videoJuego2 = new VideoJuego("Transformer", 2 );
        videoJuego2.entregar();;
        VideoJuego videoJuego3 = new VideoJuego("21k", 10, "Deportes", "EA NBA");
        VideoJuego videoJuego4 = new VideoJuego("GTA", 30, "Accion", "EA Sport");
        videoJuego4.entregar();
        VideoJuego videoJuego5 = new VideoJuego("Crysys", 22, "Shooter", "Crytek");

        listaSeries.add(serie1);listaSeries.add(serie2);listaSeries.add(serie3);listaSeries.add(serie4);listaSeries.add(serie5);
        listaVideoJuegos.add(videoJuego2);listaVideoJuegos.add(videoJuego3);listaVideoJuegos.add(videoJuego4);listaVideoJuegos.add(videoJuego5);
    }

    public void operar(){
        int countSeriesEntrag=0;
        int countVideoJuegEntreg=0;

        Serie serieMaxTemp=null;
        VideoJuego videoJuegoMaxHor=null;

        Integer maxTemp=0; // mayor numer
        Integer maxVideo=0;
        for(Serie s:listaSeries){
            if(s.isEntregado()){
                countSeriesEntrag++;
            }
            if(s.getNumeroTemporados()> maxTemp){
                maxTemp=s.getNumeroTemporados();
                serieMaxTemp = s;
                //serieMaxTemp.equals(s);
            }
        }

        for (VideoJuego v: listaVideoJuegos){
            if(v.isEntregado()){
                countVideoJuegEntreg++;
            }
            if(v.getHorasEstimadas() > maxVideo){
                maxVideo = v.getHorasEstimadas();
                videoJuegoMaxHor = v;
                // videoJuegoMaxHor.equals(v);
            }
        }
        System.out.println("Series Entregadas: "+countSeriesEntrag);
        System.out.println("Video juegos entregadas: "+countVideoJuegEntreg);
        System.out.println("Serie mayor cantida de temporadas: \n"+serieMaxTemp.toString());
        System.out.println("Video juegos con mayor cantida de horas:  \n"+videoJuegoMaxHor.toString());

    }

    public static void main(String[] args) {
        MainEjercicio18 main = new MainEjercicio18();
        main.llenarListas();
        main.operar();
    }
}
