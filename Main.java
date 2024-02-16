import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int scelta = 0;
        int[]numeri = new int[100];
        int n;
        int posizione;
        boolean esci=false;
        int num;
        int dimensione;
        do {

            System.out.println("scegli tra una di queste opzioni:");
            System.out.println("1: inserimento da tastiera");
            System.out.println("2: caricamento random");
            System.out.println("3: visualizzazione");
            System.out.println("4: inserimento in posizione");
            System.out.println("5: cancellazione di un elemento cercato");
            System.out.println("inserisci la tua scelta");
            scelta = in.nextInt();


            switch (scelta) {
                case 1:
                    System.out.println("inserisci il numero di elementi dell'array");
                    n = in.nextInt();
                    for(int i=0;i<n;i++){
                        System.out.println("inserisci un numero");
                        num=in.nextInt();
                        numeri[i]=num;
                    }
                    break;

                case 2:
                    for (int i = 0; i < 100; i++) {
                        numeri[i] = 1 + gen.nextInt(49);
                    }
                    System.out.println("array casuale eseguito");
                    break;
                case 3:
                    System.out.println("in che posizione vuoi inserire il numero?");
                    posizione=in.nextInt();
                    System.out.println("inserisci un numero");
                    num=in.nextInt();
                    for (int i = num; i < posizione; i--) {
                        numeri[i] = numeri[i - 1];

                    }
                    num--;
                    break;
                case 4:
                    System.out.println("inserisci la  dimensione dell'array?");
                    dimensione=in.nextInt();
                    System.out.println("in che posizione vuoi inserire il numero?");
                    posizione=in.nextInt();
                    System.out.println("inserisci un numero");
                    num=in.nextInt();
                    numeri[posizione]=num;
                    for(int i=num;i<num-1;i++){
                        numeri[i]=numeri[i+1];
                    }
                    num--;
                    break;

                case 5:


                case 6:
                    esci=true;
                    break;

            }
        }while(esci==false);

    }
}