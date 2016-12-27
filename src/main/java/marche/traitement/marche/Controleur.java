package marche.traitement.marche;

import marche.traitement.exceptions.SoldeNonDisponibleException;
import marche.traitement.participant.Acheteur;
import marche.traitement.participant.Vendeur;
import marche.traitement.produits.ProduitFermier;

/**
 * Singleton Controleur représentant le système
 * @author Nicolas Guigou
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
    public static void transfererBiens(Acheteur acheteur, Vendeur vendeur, Offre offre){
        for ( ProduitFermier p : offre.getProduits() ){
            acheteur.ajoutProduit(p);
            vendeur.enleverProduit(p);
        }
    }

    /**
     * Méthode permettant de créditer une somme par rapport à une offre
     */
    public static void crediterSomme(Acheteur acheteur,Vendeur vendeur, Offre offre) throws SoldeNonDisponibleException {

            acheteur.enleverSolde(offre.getPrix());
            vendeur.ajouterSolde(offre.getPrix());

    }

    /**
     * Méthode permettant de réguler les prix des produits en fonction du seuil définit
     */
    public void regulerPrix(ProduitFermier produit){
        //TODO implémenter la méthode
    }

    /**
     * Méthode permettant d'ajouter une offre à un marché
     */
    public void ajouterOffre(Offre offre, Marche marche){
        marche.ajouterOffre(offre);
    }
}
