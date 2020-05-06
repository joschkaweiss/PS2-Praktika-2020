/**
 * Eine Klasse, deren Exemplare Informationen über ein Buch halten.
 * Dies könnte Teil einer größeren Anwendung sein, einer
 * Bibliothekssoftware beispielsweise.
 *
 * @author (Joschka Weiss)
 * @version (06.05.2020)
 */
class Buch
{
    // Exemplarvariablen
    private String autor;
    private String titel;
    private int seiten;
    private String refNummer;
    private int ausgeliehen;

    /**
     * Setze den Autor und den Titel, wenn ein Exemplar erzeugt wird.
     */
    public Buch(String buchautor, String buchtitel, int buchseiten)
    {
        autor = buchautor;
        titel = buchtitel;
        seiten = buchseiten;
        String refNummer = "";
        ausgeliehen = 0;
    }
    
    /**
     * Gibt Name des Autors zurück
     */
    public String gibAutor(){
        return autor;
    }
    
    /**
     * Gibt Name des Buches zurück
     */
    public String gibTitel(){
        return titel;
    }
    
    /**
     * Gibt Seitenzahl des Buches zurück
     */
    public int gibSeiten(){
        return seiten;
    }
    
    /**
     *  Gibt Name des Autors auf der Konsole aus
     */
    public void autorAusgeben(){
        System.out.println(autor);
    }
    
    /**
     * Gibt Titel des Buches auf der Konsole aus
     */
    public void titelAusgeben(){
        System.out.println(titel);
    }
    
    /**
     * Gibt alle Details auf der Konsole aus
     */
    public void detailsAusgeben(){
        System.out.println("Titel: " + titel);
        System.out.println("Autor: " + autor);
        System.out.println("Seiten: " + seiten);
        
        if (refNummer != null){
            System.out.println("Referenz Nummer: " + refNummer);
        } else {
            System.out.println("ZZZ");
        }
        
        System.out.println("Ausgeliehen: " + ausgeliehen + " mal");
    }
    
    /**
     * Setze Referenz Nummer für das Buch
     */
    public void setzeRefNummer(String ref){
        if (ref.length() >= 3) {
            refNummer = ref;
        } else {
            System.out.println("Die Referenz Nummer sollte mindestens 3 Zeichen umfassen");
        }
    }
    
    /**
     * Gibt Referenznummer zurück
     */
    public String gibRefNummer(){
        return refNummer;
    }
    
    /**
     * Erhöhe den Zähler, der angibt wie oft das Buch ausgeliehen wurde um 1
     */
    public void ausleihen(){
        ausgeliehen++;
    }
    
    /**
     * Gib zurück wie oft das Buch ausgeliehen wurde
     */
    public int gibAusgeliehen(){
        return ausgeliehen;
    }


}
