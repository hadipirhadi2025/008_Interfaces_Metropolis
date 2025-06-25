package de.mymovie.lebewesen;

/**
 * <pre>
 *     Superman kann fliegen, das macht er, um die Welt zu retten
 *
 *     Wenn Supermen landet, ist die Welt wieder einmal gerettet.
 *     Superman zält mit, wie oft er die Welt gerettet hat.
 *
 *     Im gesamten Project soll jeder wissen dürfen, wie oft Superman die Welt
 *     gerade gerettet hat.
 *
 *     Superman: Es kann nur einen geben! TODO
 * </pre>
 */
public class Superman {


    /**erhöht sich, wenn Superman landet*/
    private int anzahlWeltrettungen;

    /** In einer Telefonselle zeiht sich Sperman um und macht sich auf, die Welt zu retten*/
    public void starten(){
        System.out.println("Wio ist die nächste Telefonzelle? Ich mache mich auf,"
        + "die Welt zu retten");

    }

    /**
     * Nicts und niemand fliegt so schnell wie Superman
     * Oder?!
     */
    public void fliegen(){
        System.out.println("WUUUUUSCHHHH");
    }

    /**Ändert die Anzahl der ...*/
    public void landen(){
        anzahlWeltrettungen = anzahlWeltrettungen+1;
        System.out.println("Ich bin da, die Welt ist zum " +anzahlWeltrettungen + "ten Mal gerettet");
    }
    /** public: kann überall genutzt werden */
    public int getAnzahlWeltrettungen() {
        return anzahlWeltrettungen;
    }
}
