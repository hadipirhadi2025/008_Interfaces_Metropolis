package de.mymovie.film;

import de.mymovie.flughafen.Flieger;
import de.mymovie.flughafen.Tower;
import de.mymovie.lebewesen.Spatz;
import de.mymovie.lebewesen.Superman;
import de.mymovie.maschinen.Batwing;
import de.mymovie.maschinen.Flugzeug;

/**
 * <pre>
 *     Beschreibt den Ablauf des Films >Metropolis Airport<
 *     copyright Alfa Movies
 * </pre>
 * @author Susanne
 */
public class MetropolisAirport {

    /**
     * Ablauf des Films.
     * @param args wird hier nicht verwendet
     */
    public static void main(String[] args) {
        System.out.println("Willkommen auf dem Flughafen von Metropolis!");
        System.out.println("Hier ist einiges los, lehn dich zurück und genieße die Show.\n");

        Tower beobachter = new Tower();

        Spatz jack = new Spatz();
        Flugzeug beluga = new Flugzeug();
        Superman S = new Superman();
        Batwing batmansFlieger = new Batwing();

        System.out.println("Jack " + jack.getClass().getSimpleName() + " kommt vorbei und möchte landen.");
        beobachter.erteilenLandeerlaubnis(jack);
        System.out.println();

        System.out.println("Beluga " + beluga.getClass().getSimpleName() + " kommt vorbei und möchte laden.");
        beobachter.erteilenLandeerlaubnis(beluga);
        System.out.println();

        System.out.println(S.getClass().getSimpleName() + " hat Lex bei verdächtigen Aktivitäten entdeckt und" +
                " möchte landen.");
        beobachter.erteilenLandeerlaubnis(S);
        System.out.println();

        System.out.println("Batman kommt im seinem " + batmansFlieger.getClass().getSimpleName() +
                " vorbei und möchte die Welt retten");
        beobachter.erteilenLandeerlaubnis(batmansFlieger);
        System.out.println();

        System.out.println("ACHTUNG! ANCHTING! DRAMATISCHE ENTWICKLUNG IN METROPOLIS: " +
                "ALLES, WAS FLIEGEN KANN MUSS RAUS AUS METROPOLIS!");
        Flieger[]  allesWasFliegt = {jack, beluga, S, batmansFlieger};
        for(Flieger einFlieger : allesWasFliegt){
            System.out.println(einFlieger.getClass().getSimpleName() + " startet und verlässt Metropolis.");
            einFlieger.starten();
            einFlieger.fliegen();
            System.out.println();
        }


    }
}
