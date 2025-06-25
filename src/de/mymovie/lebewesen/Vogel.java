package de.mymovie.lebewesen;

/**
 * <pre>
 *     Template für Vogel-Objekte
 *     Referenztyp für Vogel-Objekte und Objekte, deren Typ von Vogel erbt.
 *
 *     Referenzen für Vogel-Objekte
 *     Vogel vogelReferenz = new Vogel();  --- federkleidPutzen, getClass, equals, toString, hashCode
 *     Object objectReferenz = new Vogel(); --- getClass, equals, toString, hashCode
 *
 *     Casting
 *     Vogel objectZuVogel = (Vogel) objectReferenz;
 *
 * </pre>
 */
public class Vogel {

    /**
     * Jeder Vogel hat Federn und kann sie in Ordnung bringen
     */
    public void federkleidPutzen(){
        System.out.println("Das Federkleid wird in Ordnung gebracht");
    }
}
