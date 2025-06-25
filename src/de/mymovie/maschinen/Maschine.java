package de.mymovie.maschinen;

/**
 * <pre>
 *     Template für Maschinen Objekte
 *     Referenztyp für Maschinen Objekte und Objekte von erbenden Typen
 *
 *     Referenzen
 *     Maschine maschineReferenz = new Maschine(); --- gewartetWerden, toString, getClass, hashCode, equals
 *     Objekct objectReferenz = new Maschine(); ---toString, getClass, hashCode, equals
 *
 *     Casting
 *     Maschine objectZuMaschine = (Maschine)objectReferenz
 *
 * </pre>
 */
public class Maschine {

    /** Jede Maschine muss gewartet werden */
    public void gewartetWerden(){
        System.out.println("Alles sollte jetzt laufen....");
    }
}
