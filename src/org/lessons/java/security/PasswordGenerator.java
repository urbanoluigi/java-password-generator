package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        //creo uno scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        //chiedo all'utente di inserire le informazioni
        System.out.println("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();
        System.out.println("Inserisci il tuo cognome: ");
        String cognome = scanner.nextLine();
        System.out.println("Inserisci il tuo colore preferito: ");
        String colorePreferito = scanner.nextLine();
        System.out.println("Inserisci il giorno di nascita: ");
        int giornoNascita = scanner.nextInt();
        System.out.println("Inserisci il mese di nascita: ");
        int meseNascita = scanner.nextInt();
        System.out.println("Inserisci l'anno di nascita: ");
        int annoNascita = scanner.nextInt();

        //Calcolo la somma del giorno, mese e anno di nascita
        int sommaDataNascita = giornoNascita + meseNascita + annoNascita;

        //genero la password concatenando le info
        String password = nome + "_" + cognome + "_" + colorePreferito + "_" + sommaDataNascita;

        //stampo la password
        System.out.println("La tua password generata è: " + password);

        //chiudo lo scanner
        scanner.close();
    }
}
