package de.mymovie.flughafen;

/**
 * <pre>
 *     Ein Datentyp, ein Referenztyp.
 *
 *
 * Methoden aus dem Interface können mit dieser Referenz aufrufen werden(zu starten)
 * Durchgeführt werden die Methoden von einem object
 * Die Methoden brauchen keinen Körper, keinen Inhalt, keine{}, Methoden sind 'abstract'
 * </pre>
 */
public interface Flieger {
    /**
     * eine abstaracte Methode: Kein Körper, kein{}, statt dessen:
     * Methoden im Interface sind immmer public
     */
    void starten();
    void fliegen();
    void landen();
}
