package ElementoMultimediale;

import Interfaces.Luminosita;
import Interfaces.Show;

public class Immagine extends ElementoMultimediale implements Show, Luminosita {
    private int luminosita;
    public Immagine(String titolo) {
        super(titolo);
        this.luminosita = 5;
    }

    @Override
    public void show() {
        System.out.println("Luminosita: ");
        for (int i = 0; i < this.luminosita; i++) {
            System.out.println("*");
        }
        System.out.println("");
    }

    @Override
    public void alzaLuminosita() {
        luminosita++;
    }

    @Override
    public void abbassaLuminosita() {
        luminosita--;
    }
}
