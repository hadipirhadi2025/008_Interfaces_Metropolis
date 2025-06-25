package de.mymovie.lebewesen;

/**
 * <pre>
 *    Template für Spatzobjekte.
 *    Referenztyp für Spatz-Objekte und Objekte von erben Typen
 *
 *    Wunsch: Ein Spatz kann auch mit einer Referenz vom Typ Flieger angesprochen werden
 *
 *    Ein Spatz ist ein Vogel : extends Vogel
 *    Ein Spatz ist ein Flieger : Implements Flieger (Flieer ist Interface)
 * </pre>
 */
public class Spatz extends Vogel{
    /**
     * Überzetzung: Ich mache auf, Kirschen zu suchen
     */

    public void starten(){
        federkleidPutzen();
        System.out.println("Piep");
    }
    /**
     * Uberzetzung: Ich suche und suche und suche nach Kirschen
     */
    public void flieger(){
        System.out.println("Piepe");
    }

    /**
     * Übersetzung: Das sieht lecker aus, ich lande
     */
    public void landen(){
        System.out.println("Piepe");
        federkleidPutzen();
    }
}
