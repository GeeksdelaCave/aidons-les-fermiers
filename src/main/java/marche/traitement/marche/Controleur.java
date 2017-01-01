package marche.traitement.marche;

import marche.traitement.exceptions.SoldeNonDisponibleException;
import marche.traitement.participant.Acheteur;
import marche.traitement.participant.Vendeur;
import marche.traitement.produits.ProduitFermier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

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
    public static Acheteur choisirAcheteur(Offre offre){
        Random random= new Random();
        ArrayList<Acheteur> liste = new ArrayList<Acheteur>();
        liste = offre.getAcheteursPotentiels();
        int index = random.nextInt(liste.size());
        return liste.get(index); //Le controleur choisit un élément aléatoire de la liste
        //TODO ajouter une deuxième algorithme
    }

    /**
     * Méthode permettant le transfert de biens
     */
    public static void transfererBiens(Acheteur acheteur, Vendeur vendeur, Offre offre, Marche marche){

        for ( ProduitFermier p : offre.getProduits() ){
            acheteur.ajoutProduit(p);
            vendeur.enleverProduit(p);
        }

        String strTransaction = acheteur.getPrenomActeur() + acheteur.getNomActeur() + "a effectué un achat de : " + offre.getPrix() + " euros à " + vendeur.getPrenomActeur() + vendeur.getNomActeur() + "le :" + LocalDate.now();
        LivreMarche.ajouterTransaction(strTransaction);
        marche.enleverOffre(offre);
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
    public static void regulerPrix(ProduitFermier produit){
        //TODO implémenter la méthode
    }

    /**
     * Méthode permettant d'ajouter une offre à un marché
     */
    public static void ajouterOffre(Offre offre, Marche marche){
        marche.ajouterOffre(offre);
    }

    /**
     * Méthode permettant de valider une offre si son prix n'est pas trop élever
     * @param offre
     * @return
     */
    public static boolean valider(Offre offre){
        if(offre.getPrix()> 100000){
            return false;
        }
        return true;
        //TODO méthode à revoir
    }
}
