package de.mymovie.lebewesen;

import de.mymovie.flughafen.Flieger;

/**
 * <pre>
 *     Template für Spatzobjekte.
 *     Referenztyp für Spatz-Objekte und Objekte von erbenden Typen
 *
 *     Wunsch: Ein Spatz kann auch mit einer Referenz vom Tyo Flieger angesprochen werden
 *     Ein Spatz ist ein Vogel : extends Vogel
 *     Ein Spatz ist ein Flieger : implements Flieger (Flieger ist Interface)
 *
 * </pre>
 */
public class Spatz extends Vogel implements Flieger {
    /**
     * Übersetzung: Ich mache auf, Kirschen zu suchen
     */
    public void starten(){
        federkleidPutzen();
        System.out.println("Piep");
    }

    /**
     * Übersetzung: Ich suche und suche und suche nach Kirschen
     */
    public void fliegen(){
        System.out.println("Piep");
    }

    /**
     * Übersetztung: Das sieht lecker aus, ich lande
     */
    public void landen(){
        System.out.println("Piep");
        federkleidPutzen();
    }
}
