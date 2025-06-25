package de.mymovie.flughafen;

import de.mymovie.lebewesen.Spatz;
import de.mymovie.lebewesen.Superman;
import de.mymovie.maschinen.Flugzeug;

/**
 * <pre>
 *     Überwacht den Flughafen von Metropolis
 *     Alles was in Metropolis fliegt, wird vom Tower beobeachtet
 *     Wer oder was in Metropolis landen möchte, bracht dazu eine Landeerlaubnis des Towers.
 *
 *     Prüfungen später....
 *
 *     Wünsch: Referenztyp, der landen-Methode aufrufen kann Adressen von allen drei (Superman, Spatz, Flugzeug
 *     enthalten kann.
 *
 * </pre>
 */
public class Tower {

    /**
     * Eine Methoe für alle Objekte, diemit dem Referenztyp Flieger angesprochen werden können.
     * @param flieger Referenz auf ein Objekt, das start/fliegen/landen kann
     */
    public void erteilenLandeerlaubnis(Flieger flieger/*jemandDerInMetropolisFliegenKannUnd*/){
        System.out.println("Prüfung war erfolgreich");
        System.out.println(flieger.getClass().getSimpleName() + ", schön dass du da bist, du darfst landen.");
        flieger.landen();
    }

    public void erteilenLandeerlaubnis(Flugzeug flieger){
        System.out.println("Prüfung war erfolgreich");
        System.out.println(flieger.getClass().getSimpleName() + ", schön dass du da bist, du darfst landen.");
        flieger.landen();
    }


    public void erteilenLandeerlaubnis(Superman flieger){
        System.out.println("Prüfung war erfolgreich");
        System.out.println(flieger.getClass().getSimpleName() + ", schön dass du da bist, du darfst landen.");
        flieger.landen();
    }

    public void erteilenLandeerlaubnis(Object flieger){
        System.out.println("Prüfung war erfolgreich");
        System.out.println(flieger.getClass().getSimpleName() + ", schön dass du da bist, du darfst landen.");
        if (flieger instanceof Spatz){
            Spatz spatz = (Spatz) flieger;
            spatz.landen();
        }

    }

}
