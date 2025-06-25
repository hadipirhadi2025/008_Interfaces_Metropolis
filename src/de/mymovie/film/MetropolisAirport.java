package de.mymovie.film;

import de.mymovie.flughafen.Tower;
import de.mymovie.lebewesen.Spatz;
import de.mymovie.lebewesen.Superman;
import de.mymovie.maschinen.Flugzeug;

/**
 * <pre>
 *     Bwschreibt den Ablauf des Films >Metropolis Airport<
 *     Copyright Alfa Movies
 * </pre>
 * @author Susanne
 */
public class MetropolisAirport {
    /**
     * Ablauf des Films
     * @param args wird hier nicht verwendet
     */
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");

        Tower beobachter = new Tower();

        Spatz jack = new Spatz();
        Flugzeug beluga = new Flugzeug();
        Superman S = new Superman();

        System.out.println("Jack " + jack.getClass().getSimpleName()+" kommt vorbei und möchte landen");
        beobachter.erteilenLandeerlaubnis(jack);
        System.out.println();

        System.out.println("Beluga " + beluga.getClass().getSimpleName() + "Konnt vorbei und möchte landen");
        beobachter.erteilenLandeerlaubnis(beluga);
        System.out.println();

        System.out.println(S.getClass().getSimpleName() + "hat Lex bei verdächtigen Aktivitäten entdeckt und" +
                "möchte landen");
        beobachter.erteilenLandeerlaubnis(S);
        System.out.println();
    }
}
