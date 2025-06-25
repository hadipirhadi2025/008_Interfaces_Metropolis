package de.mymovie.flughafen;

import de.mymovie.film.TolleElternKlasse;
import de.mymovie.lebewesen.Spatz;
import de.mymovie.lebewesen.Superman;
import de.mymovie.maschinen.Flugzeug;

/**
 * <pre>
 *     Überwacht den Flughafen von Metropolis.
 *     Alles was in Metropolis fliegt, wird vom Tower beobachtet
 *     Wer oder was in Metropolis landen möchte, braucht dazu eine Landeerlaubnis des Towers.
 *
 *     Prüfungen später....
 *
 *     Wunsch: Referenztyp, der landen-Methode aufrufen kann und Adressen von allen drei (Superman, Spatz, Flugzeug
 *     enthalten kann.: NUR Referenztyp, kein Template: interface
 * </pre>
 */
public class Tower {
    /**
     * Eine Methode für alle Objekte, die mit dem Referenztyp Flieger angesprochen werden
     * können
     * @param flieger Referenz auf ein Objekt, das starte/fliegen/landen kann
     */
    public void erteilenLandeerlaubnis(Flieger flieger){
        System.out.println("Prüfung war erfolgreich");
        System.out.println(flieger.getClass().getSimpleName() + ", schön dass du da bist, du darfst landen.");
        flieger.landen();
    }

//    public void erteilenLandeerlaubnis(Spatz flieger){
//        System.out.println("Prüfung war erfolgreich");
//        System.out.println(flieger.getClass().getSimpleName() + ", schön dass du da bist, du darfst landen.");
//        flieger.landen();
//    }
//
//    public void erteilenLandeerlaubnis(Flugzeug flieger){
//        System.out.println("Prüfung war erfolgreich");
//        System.out.println(flieger.getClass().getSimpleName() + ", schön dass du da bist, du darfst landen.");
//        flieger.landen();
//    }
//
//    public void erteilenLandeerlaubnis(Superman flieger){
//        System.out.println("Prüfung war erfolgreich");
//        System.out.println(flieger.getClass().getSimpleName() + ", schön dass du da bist, du darfst landen.");
//        flieger.landen();
//    }
//
//    public void erteilenLandeerlaubnis(Object flieger){
//        System.out.println("Prüfung war erfolgreich");
//        System.out.println(flieger.getClass().getSimpleName() + ", schön dass du da bist, du darfst landen.");
//        if(flieger instanceof Spatz) {
//            Spatz spatz = (Spatz)flieger;
//            spatz.landen();
//        }
//    }
//    public void erteilenLandeerlaubnis(TolleElternKlasse flieger){
//        System.out.println("Prüfung war erfolgreich");
//        System.out.println(flieger.getClass().getSimpleName() + ", schön dass du da bist, du darfst landen.");
//        flieger.landen();
//    }

}
