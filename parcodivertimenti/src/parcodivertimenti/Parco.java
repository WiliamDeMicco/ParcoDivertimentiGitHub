package parcodivertimenti;

import java.util.Scanner;

public class Parco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Calcolo del guadagno netto totale
        System.out.print("Inserisci il prezzo del biglietto: ");
        double prezzoBiglietto = scanner.nextDouble();

        int randomNum = (int)(Math.random() * 101);  // da 0 a 100
        System.out.println(randomNum);//visitatori randomici

        System.out.print("Inserisci i costi del parco: ");
        double costiParco = scanner.nextDouble();

        double guadagnoTotale = (prezzoBiglietto * randomNum) - costiParco;
        System.out.println("Il guadagno netto totale è: " + guadagnoTotale);

        // 2. Attrazione più visitata
        System.out.print("Inserisci il numero di attrazioni: ");
        int numeroAttrazioni = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline rimasto

        String attrazionePiuVisitata = "";
        int maxVisitatori = 0;

        for (int i = 1; i <= numeroAttrazioni; i++) {
            System.out.print("Inserisci il nome dell'attrazione " + i + ": ");
            String nomeAttrazione = scanner.nextLine();

            System.out.print("Inserisci il numero di visitatori per " + nomeAttrazione + ": ");
            int visitatoriAttrazione = scanner.nextInt();
            scanner.nextLine(); 

            if (visitatoriAttrazione > maxVisitatori) {
                maxVisitatori = visitatoriAttrazione;
                attrazionePiuVisitata = nomeAttrazione;
            }
        }
        System.out.println("L'attrazione più visitata è: " + attrazionePiuVisitata);

        // 3. Tempo medio di attesa per attrazione
        double tempoTotaleAttesa = 0;

        for (int i = 1; i <= numeroAttrazioni; i++) {
            System.out.print("Inserisci il tempo di attesa medio per l'attrazione " + i + " (in minuti): ");
            double tempoAttesa = scanner.nextDouble();
            tempoTotaleAttesa += tempoAttesa;
        }

        double tempoMedioAttesa = tempoTotaleAttesa / numeroAttrazioni;
        System.out.println("Il tempo medio di attesa per attrazione è: " + tempoMedioAttesa + " minuti.");

        // 4. Calcolo della percentuale di visitatori soddisfatti (autonoma)
        double percentualeSoddisfatti;
        if (tempoMedioAttesa < 15) {
            percentualeSoddisfatti = 90; // Alta soddisfazione se il tempo medio di attesa è basso
        } else if (tempoMedioAttesa < 35) {
            percentualeSoddisfatti = 70; // Media soddisfazione
        } else {
            percentualeSoddisfatti = 45; // Bassa soddisfazione
        }

        System.out.println("La percentuale di visitatori soddisfatti è stimata al: " + percentualeSoddisfatti + "%.");
    }
}