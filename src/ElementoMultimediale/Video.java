package ElementoMultimediale;

import Interfaces.Luminosita;
import Interfaces.Play;
import Interfaces.Volume;

public class Video extends ElementoMultimediale implements Play, Luminosita, Volume {
    public Video(String titolo) {
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

    @Override
    public void alzaLuminosita() {

    }

    @Override
    public void abbassaLuminosita() {

    }
}
