package de.mymovie.maschinen;

import de.mymovie.flughafen.Flieger;

/**
 * <pre>
 *     Datentyp und Template
 *
 *     Ein Batwing ist eine Maschine, ein Batwing ist ein Flieger
 *
 *     Wenn der Batwing landet, ist Batman da und die Welt ist gerettet.
 *     Batman sagt: Welt retten ist Aufgabe von Menschen, Superman als Außerordischer
 *     soll sich da eher raus halten. Bei jeder Landung sagt er: die bisher durch Superman
 *     erfolgten Weltrettungen spielen keine Rolle.
 *
 *     implements Flieger: Versprechen, dass Objekte des Typs Batwing die starten,
 *     fliegen und landen Methode durchführen können.
 *
 *     Flieger fliegerReferenz = new Batwing():
 *     fliegerReferenz.flieger();
 * </pre>
 *
 */
public class Batwing extends Maschine implements Flieger {
    /**
     * Implementiert die Methode aus dem Interface: Überschreiben
     */
    @Override
    public void starten() {
        gewartetWerden();
        System.out.println("Auf geht's, Die Welt der Menschen muss gerettet werden.");
    }

    /**
     * Genau so schnell wie Superman!
     */
    @Override
    public void fliegen() {
        System.out.println("ZIIIIIIIIIIIIIIISCHHHHHHHHHHHHHHHHHHHHH");
    }

    @Override
    public void landen() {
        int anzahlVonSupermansWeltrettungen = 9; //NUR EIN Platzhalter: Übung
        System.out.println("Supermans " + anzahlVonSupermansWeltrettungen + " spielen keine Rolle mehr! Batman ist " +
                "da, um die Welt zu retten");
        gewartetWerden();
    }
}
