package ElementoMultimediale;

import Interfaces.Play;
import Interfaces.Volume;

public class RegistrazioneAudio extends ElementoMultimediale implements Play, Volume {
    int volume=5;
    public RegistrazioneAudio(String titolo) {
        super(titolo);
    }
    @Override
    public void play() {}

    @Override
    public void alzaVolume() {
    }

    @Override
    public void abbassaVolume() {

    }
}
