package de.mymovie.lebewesen;

import de.mymovie.film.TolleElternKlasse;
import de.mymovie.flughafen.Flieger;

/**
 * <pre>
 *     Superman kann fliegen, das macht er, um die Welt zu retten.
 *
 *     Wenn Superman landet, ist die Welt wieder einmal gerettet.
 *     Superman zählt mit, wie oft er die Welt gerettet hat.
 *
 *     Im gesamten Projekt soll jeder wissen dürfen, wie oft Superman die Welt
 *     gerade gerettet hat.
 *
 *     Superman: Es kann nur einen geben! TODO
 * </pre>
 */
public class Superman implements Flieger {
    /** erhöht sich, wenn Superman landet */
    private int anzahlWeltrettungen;

    /**
     * In einer Telefonzelle zieht sich Superman um und macht sich auf, die Welt zu retten
     */
    public void starten(){
        System.out.println("Wo ist die nächste Telefonzelle? Ich mache mich auf, " +
                "die Welt zu retten!");
    }

    /**
     * Nichts und niemand fliegt so schnell wie Superman...
     * Oder ?!
     */
    public void fliegen(){
        System.out.println("WUUUUUUSCHHH");
    }

    /** Ändert die Anzahl der Weltrettungen */
    public void landen(){
        anzahlWeltrettungen = anzahlWeltrettungen + 1; //++ auch möglich
        System.out.println("Ich bin da, die Welt ist zum " + anzahlWeltrettungen + "ten Mal gerettet");
    }

    /** public: kann überall genutzt werden */
    public int getAnzahlWeltrettungen() {
        return anzahlWeltrettungen;
    }
}
