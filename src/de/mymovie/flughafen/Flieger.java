package de.mymovie.flughafen;

/**
 * <pre>
 *     Ein Datentyp, ein Referenztyp.
 *
 * Methoden aus dem Interface können mit dieser Referenz aufgerufen werden(zb starten)
 * Durchgeführt werden die Methoden von einem Objekt.
 * Die Methoden brauchen keinen Körper, keinen Inhalt, keine{}, Methoden sind 'abstrakt'
 *
 * </pre>
 */
public interface Flieger {

    /**
     * eine abstrakte Methode: Kein Körper, keine {}, statt dessen ;
     * Methoden im Interface sind immer public.
     * Deshalb kann das public-Schlüsselwort hier weggelassen werden
     */
     void starten();

    /**
     * Kann zb Superman
     */
    void fliegen();

    /**
     * Wird im Tower in der erteilenLandeerlaubnis Methode verwendet
     */
    void landen();
}
