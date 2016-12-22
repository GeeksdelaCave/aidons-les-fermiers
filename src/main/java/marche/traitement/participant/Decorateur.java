package marche.traitement.participant;

/**
 * Classe Decorateur
 * @author Nicolas Guigou
 */
public class Decorateur extends Acteur {
    /**
     * Donnée membre acteur
     */
    private Acteur acteur;

    public Decorateur(Acteur acteur){
        super();
        this.acteur = acteur;
    }
}
