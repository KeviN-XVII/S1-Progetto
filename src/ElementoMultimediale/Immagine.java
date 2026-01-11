package ElementoMultimediale;

import Interfaces.Luminosita;
import Interfaces.Show;

public class Immagine extends ElementoMultimediale implements Show, Luminosita {
    private int luminosita;
    public Immagine(String titolo,int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    @Override
    public void show() {
        String valoreLuminosita = "";
        for (int i = 0; i < luminosita; i++) {
            valoreLuminosita += "*";
        }
        System.out.println(getTitolo()+ "" + valoreLuminosita);
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
