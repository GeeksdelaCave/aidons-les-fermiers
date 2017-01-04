package marche.traitement.participant;

public class CentraleAchat extends Acteur {

    private String nomCentraleAchat;

    public CentraleAchat(String nomCentraleAchat) {
        super();
        this.nomCentraleAchat = nomCentraleAchat;
    }

    public String getDenomination() {
        return nomCentraleAchat;
    }

    public void setDenomination(String nom, String prenom) {
        this.nomCentraleAchat = nom;
    }
}
