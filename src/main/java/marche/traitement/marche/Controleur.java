package marche.traitement.marche;

/**
 * Singleton Controleur représentant le système
 */
public class Controleur {
    /**
     * Instance du Singleton
     */
    private static Controleur ourInstance = new Controleur();

    /**
     * Permet de récuperer l'instance unique car notre classe est un Singleton
     * @return l'instance unique
     */
    public static Controleur getInstance() {
        return ourInstance;
    }

    /**
     * Constructeur privé
     */
    private Controleur() {
    }

    /**
     * Méthode permettant de selectionner les acheteurs
     */
    public void choisirAcheteur(){ //prend en paramètre : Collection<IAcheteur> acheteurs
        //TODO implémenter la méthode
    }

    /**
     * Méthode permettant le transfert de biens
     */
    public void transfererBiens(){ // prend en paramètre : Offre offre
        //TODO  implémenter la méthode
    }

    /**
     * Méthode permettant de créditer une somme par rapport à une offre
     */
    public void crediterSomme(){ // prend en paramètre : Offre offre
        //TODO implémenter la méthode
    }

    /**
     * Méthode permettant de réguler les prix des produits en fonction du seuil définit
     */
    public void regulerPrix(){ // prend en paramètre : ProduitFermier produit
        //TODO implémenter la méthode
    }

    /**
     * Méthode permettant d'ajouter une offre à un marché
     */
    public void ajouterOffre(){ //prend en paramètre : Offre offre, Marche marche
        //TODO implémenter la méthode
    }
}
