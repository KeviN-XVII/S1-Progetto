import ElementoMultimediale.ElementoMultimediale;
import ElementoMultimediale.Video;
import ElementoMultimediale.Immagine;
import ElementoMultimediale.RegistrazioneAudio;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ElementoMultimediale[] listaElementi = new ElementoMultimediale[5];

//        -----------CREAZIONE ELEMENTI
        for (int i = 0; i < listaElementi.length; i++) {
            System.out.println("Inserisci un numero che corrispanda a un elemento: 1 - Video , 2 - Immagine , 3 - Registrazione Audio");
            String numero = scanner.nextLine();

            if (numero.equals("1")) {
                System.out.println("Video");
                System.out.println("Inserisci titolo:");
                String titVideo = scanner.nextLine();
                System.out.println("Inserisci volume desiderato da 1 a 5");
                int volVideo = Integer.parseInt(scanner.nextLine());
                System.out.println("Inserisci durata del video da 1 a 5 ");
                int durVideo = Integer.parseInt(scanner.nextLine());
                System.out.println("Inserisci luminosità del video da 1 a 5");
                int lumVideo = Integer.parseInt(scanner.nextLine());
                listaElementi[i]=new Video(titVideo,volVideo,durVideo,lumVideo);

            } else if (numero.equals("2")) {
                System.out.println("Immagine");
                System.out.println("Inserisci titolo:");
                String titImmagine =  scanner.nextLine();
                System.out.println("Inserisci luminosità dell'immagine tra 1 e 5");
                int lumImmagine = Integer.parseInt(scanner.nextLine());
                listaElementi[i]=new Immagine(titImmagine,lumImmagine);

            } else if  (numero.equals("3")) {
                System.out.println("Registrazione Audio");
                System.out.println("Inserisci titolo:");
                String titRegistrazione = scanner.nextLine();
                System.out.println("Inserisci durata del registrazione da 1 a 5");
                int durRegistrazione = Integer.parseInt(scanner.nextLine());
                System.out.println("Inserisci volume desiderato da 1 a 5");
                int volRegistrazione = Integer.parseInt(scanner.nextLine());
                listaElementi[i]=new RegistrazioneAudio(titRegistrazione,durRegistrazione,volRegistrazione);
            } else {
                System.out.println("Il numero selezionato non è valido");
            }

        };
//        -------------- STAMPA ELEMENTO SCELTO
        int numScelto;

        do {
            System.out.println("Scegli un elemento inserndo un numero da 1 a 5,scrivere il numero 0 per interrompere il processo");
            numScelto = scanner.nextInt();
            if(numScelto > 0 && numScelto <= 5) {
                ElementoMultimediale scelta =  listaElementi[numScelto-1];
                if(scelta instanceof Video) {
                    ((Video)scelta).play();
                } else if (scelta instanceof Immagine) {
                    ((Immagine)scelta).show();
                } else if  (scelta instanceof RegistrazioneAudio) {
                    ((RegistrazioneAudio)scelta).play();
                } else {
                    System.out.println("Hai scelto di interrompere il processo oppure hai inserito un numero non valido");
                }
            }
        }while(numScelto!=0);

    }
}