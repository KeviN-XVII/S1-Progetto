package ElementoMultimediale;

import Interfaces.Luminosita;
import Interfaces.Play;
import Interfaces.Volume;

public class Video extends ElementoMultimediale implements Play, Luminosita, Volume {
     private int volume;
     private int durata;
     private int luminosita;

    public Video(String titolo,int volume,int durata,int luminosita) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
        this.luminosita = luminosita;
    }
//    -------------LISTA OVERRIDE
    @Override
    public void play() {
        String valoreVolume="";
        String valoreLuminosita ="";
        for(int i=0;i<luminosita;i++){
            valoreLuminosita+="*";
        }

        for (int i = 0; i < volume; i++) {
            valoreVolume += "!";
        }
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + "" + valoreLuminosita + "" + valoreVolume);
        }
    }

    @Override
    public void alzaVolume() {
        if(volume >= 0 && volume < 5){
            volume++;
        }
    }

    @Override
    public void abbassaVolume() {
        if(volume > 0 && volume <= 5){
            volume--;
        }
    }
    @Override
    public void alzaLuminosita() {
        if (luminosita >= 0 && luminosita < 5) {
            luminosita++;
        }
    }

    @Override
    public void abbassaLuminosita() {
        if (luminosita > 0 && luminosita <= 5){
            luminosita--;
        }
    }
}
