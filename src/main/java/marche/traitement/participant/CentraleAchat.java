package marche.traitement.participant;

/** Classe Central d'achat
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Tristan DIETZ
 *
 * @version 1.2
 */
public class CentraleAchat extends Acteur {

    /**
     * Donnée membre correspondant à la dénomination social de la central d'achat.
     */
    private String nomCentraleAchat;

    /**
     * Constructeur de la classe CentraleAchat
     * @param nomCentraleAchat Correspond à la dénomination social de la central d'achat.
     */
    public CentraleAchat(String nomCentraleAchat) {
        super();
        this.nomCentraleAchat = nomCentraleAchat;
    }

    /**
     * Getteur de la dénomination.
     * @return nomCentraleAchat qui correspond au nom de la centrale d'achat
     */
    public String getDenomination() {
        return nomCentraleAchat;
    }

    /**
     * Setteur du nom et du prenom. Dans ce cas, seul le nom sera pris en compte (une
     * entreprise n'a pas de prenom).
     * @param nom Correspond à la dénomination social de l'entreprise.
     * @param prenom Correspond au prenom mais n'est pas utilisé ici.
     */
    public void setDenomination(String nom, String prenom) {
        this.nomCentraleAchat = nom;
    }
}
