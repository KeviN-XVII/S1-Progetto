package ElementoMultimediale;

import java.util.Scanner;

public abstract class ElementoMultimediale {
    Scanner scanner = new Scanner(System.in);
   private String titolo;

   public ElementoMultimediale(String titolo) {
       this.titolo = titolo;
   }

   public String getTitolo() {
       return titolo;
   }



}
