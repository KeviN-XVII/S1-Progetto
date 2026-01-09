package ElementoMultimediale;

import java.util.Scanner;

public abstract class ElementoMultimediale {
   private String titolo;
   Scanner  scanner = new Scanner(System.in);


   public ElementoMultimediale(String titolo) {
       this.titolo = titolo;
   }

   public String getTitolo() {
       return titolo;
   }



}
