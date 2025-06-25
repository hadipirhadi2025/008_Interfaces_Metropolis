package de.mymovie.maschinen;

import de.mymovie.flughafen.Flieger;

/**
 * <pre>
 *     Template/Datentyp(Referenztyp)
 *
 *     Ein Flugzeug ist eine Maschine: extends
 *     Ein Flugzeug ist ein Flieger: implements
 *
 *     Referenzen:
 *     Flugzeug flugzeugReferenz = new Flugzeug();  --- starten, fliegen, landen, gewartetWerden, toString, getClass, hashCode, equals
 *     Maschine maschineReferenz = new Flugzeug(); --- gewartetWerden,  toString, getClass, hashCode, equals
 *     Object objectReferenz = new Flugzeug();   ---  toString, getClass, hashCode, equals
 *     Flieger fliegerReferenz = new Flugzeug(); --- starten, fliegen, landen, toString, getClass, hashCode, equals
 *
 *     Casting:
 *     Flugzeug cast1 = (Flugzeug) maschinenReferenz;
 *     Flugzeug cast2 = (Flugzeug) objectReferenz;
 *     Maschine cast3 = (Maschine) objectReferenz;
 *
 *     Flugzeug cast4 = (Flugzeug) fliegerReferenz;
 *     Maschine cast5 = (Maschine) fliegerReferenz;
 *     Flieger cast6 = (Flieger) maschinenReferenz;
 *     Flieger cast7 = (Flieger) objectReferenz;
 *
 *     AUSPROBIEREN!
 *
 * </pre>
 */
public class Flugzeug extends Maschine implements Flieger {
    /** jedes Flugzeug muss vor dem Start gewartet werden */
    public void starten(){
        gewartetWerden();
        System.out.println("Ohren zu, jetzt wird es laut");
    }
    /** ist die Entfernung groß genug, hört man das Flugzeug nicht mehr */
    public void fliegen(){
        System.out.println("~~~ über den Wolken... ~~~");
    }
    /** */
    public void landen(){
        System.out.println("Von weit weit her komme ich....");
        gewartetWerden();
    }
}
