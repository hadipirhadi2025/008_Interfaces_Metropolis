package de.mymovie.maschinen;

import de.mymovie.flughafen.Flieger;

/**
 * <pre>
 *     Template/DatenTyp(Referenztyp)
 *
 *     Einflugzeug ist eine Machine: extends
 *     Ein Flugzeug ist ein Flieger : Implements
 *
 *     Referenzen:
 *     Flugzeug flugzeugReferenz = new Flugzeug(); --- starten, fliegen, landen, gewartetWerden, toString, getClass, hashCode, equals
 *     Machine maschineReferenz = new Flugzeug(); --- gewartetWerden , toString, getClass, hashCode, equals
 *     Object objectReferenz = new Flugzeug() ; --- , toString, getClass, hashCode, equals
 *
 *     Casting
 *     Flugzeug cast1 = (Flugzeug) maschineReferenz;
 *     Flugzeug cast2 = (Flugzeug) maschineReferenz;
 *     Maschine cast2 = (Maschine) maschineReferenz;
 *
 * </pre>
 */
public class Flugzeug extends Maschine implements Flieger {

    /** jedes Flugzeug muss vor dem Start gewartet werden */
    public void starten(){
        gewartetWerden();
        System.out.println("Ohne zu, jetzt wird es laut");
    }

    public void fliegen(){
        System.out.println("~~~ über den Wolken ~~~");

    }

    public void landen(){
        System.out.println("Von weit weit her komme ich...");
        gewartetWerden();
    }
}
