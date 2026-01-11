package ElementoMultimediale;

import Interfaces.Play;
import Interfaces.Volume;

public class RegistrazioneAudio extends ElementoMultimediale implements Play, Volume {
    private int volume;
    private int durata;


    public RegistrazioneAudio(String titolo,int durata,int volume) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

//  ------------------- LISTA OVERRIDE
    @Override
    public void play() {
        String valoreVolume="";

        for(int i=0;i<volume;i++){
            valoreVolume += "!";
        }
        for(int i=0;i<durata;i++){
            System.out.println(getTitolo()+ "" + valoreVolume);
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
}
