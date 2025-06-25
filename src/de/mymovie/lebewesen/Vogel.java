package de.mymovie.lebewesen;

/**
 * <pre>
 *     Template für Vogel-Objekte
 *     Referenztyp für Vogel-Objekte und Objekte, dren Typ von Vogel erbt.
 *
 *     Referenzen für Vogel-Objekte
 *     Vogel vogelRefenze = new Vogel(); --- federKleidPutzen, getClass, equals, toDtring, hashcode
 *     Objekt objektRefenz = new Vogel(); --- getClass, equals, toDtring, hashcode1
 *
 *     Casting
 *     Vogel objektZuVogel = (Vogel) objectReferenz;
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
