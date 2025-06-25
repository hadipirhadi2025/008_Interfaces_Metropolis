package de.mymovie.maschinen;

/**
 * <pre>
 *     Template für Machinen Objekte
 *     Referenztyp für Machinen Objekte und Objekte von erbenden Typen
 *
 *     Referenzen
 *     Machine machineReferenz = new Machine(); --- gewartetWerden, toString, getClass, hashCode, equals
 *     Objekt objectReferenz = new Machine(); --- toString, getClass, hashCode, equals
 *
 *     Casting
 *     Machine objektZuMaschine = (Maschine) objectReferenz
 * </pre>
 */
public class Maschine {

    /**
     * Jede Machine muss gewartet werden
     */
    public void gewartetWerden(){
        System.out.println("Alles sollte jetzt laufen....");
    }
}
