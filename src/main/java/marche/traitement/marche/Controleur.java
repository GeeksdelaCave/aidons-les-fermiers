package marche.traitement.marche;

import marche.traitement.exceptions.SoldeNonDisponibleException;
import marche.traitement.participant.Acheteur;
import marche.traitement.participant.Vendeur;
import marche.traitement.produits.ProduitFermier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Singleton Controleur représentant le système
 *
 * @author Nicolas Guigou
 * @author Tristan DIETZ
 *
 * @version 1.1
 * @see Offre
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
    private static final HashMap<String,Double> associationPrixMoyensProduitsFermiers = new HashMap<String, Double>() {{
        put("Vache",1300.0);
        put("Cochon",45.0);
        put("Fromage",8.0);
        put("Lait",20.0);
        put("Miel",15.0);
        put("Oeuf",6.0);
        put("Pomme",14.0);
    }};

    /**
     * Méthode permettant de selectionner les acheteurs
     */
    public static Acheteur choisirAcheteur(Offre offre, int val){
        ArrayList<Acheteur> liste = new ArrayList<Acheteur>();
        liste = offre.getAcheteursPotentiels();
        if(val == 1) {
            Random random = new Random();
            int index = random.nextInt(liste.size());
            return liste.get(index); //Le controleur choisit un élément aléatoire de la liste
        }
        else{
            return liste.get(0); // Le contrôleur choisit l'acheteur ayant proposer une offre en premier
        }

    }

    /**
     * Méthode permettant le transfert de biens
     */
    public static void transfererBiens(Acheteur acheteur, Vendeur vendeur, Offre offre, Marche marche){

        int cpt = 0;
        for ( ProduitFermier p : offre.getProduits() ){
            acheteur.ajoutProduit(p);
            ++cpt;
        }

        String nomProduit = offre.getProduits().get(0).getClass().getCanonicalName();
        String strTransaction = acheteur.getDenomination() + " a effectué un achat de : " + cpt + nomProduit + "(s)" + " au prix de "+ offre.getPrix() + " euros à " + vendeur.getDenomination() + vendeur.getDenomination() + "le :" + LocalDate.now();
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
     * Méthode permettant de réguler le prix d'une offre
     */
    public static void regulerPrix(Offre offre, int quantite){
        double prixMoyen = quantite * associationPrixMoyensProduitsFermiers.get(offre.getProduits().get(0).getClass().getCanonicalName());
        if(prixMoyen - prixMoyen * 0.2 > offre.getPrix()){
            offre.setPrix(prixMoyen - prixMoyen * 0.2);
        }else{
            offre.setPrix(prixMoyen + prixMoyen * 0.2);
        }

    }

    /**
     * Méthode permettant d'ajouter une offre à un marché
     */
    public static void ajouterOffre(Offre offre, Marche marche){
        marche.ajouterOffre(offre);
    }

    /**
     * Méthode permettant de valider une offre si son prix n'est pas trop élevé.
     *
     * @param offre Offre à valider par le controler
     * @param quantite Quantité de produits contenus dans l'offre
     * @return Si l'offre est composée de produits exclusivement commercialisables, qu'ils sont dans l'inventaire et que le prix est acceptable.
     */
    public static boolean valider(Offre offre,int quantite){

        double prixMoyen = 0.0;

        for(ProduitFermier p : offre.getProduits()){
            if(!p.isCommercialisable())
                return false;
            prixMoyen += associationPrixMoyensProduitsFermiers.get(p.getClass().getCanonicalName());
        }

        if( !( prixMoyen - prixMoyen * 0.2 <= offre.getPrix()  && offre.getPrix() <= prixMoyen + prixMoyen * 0.2)) {
            Controleur.regulerPrix(offre,quantite);
        }
        return true;

    }

    /**
     * Méthode permettant d'afficher les prix moyens des produits
     */
    public static void affichagePrixMoyen(){
        for(String mapKey : associationPrixMoyensProduitsFermiers.keySet()){
            System.out.println("Produit : " + mapKey + " , prix moyen : " + associationPrixMoyensProduitsFermiers.get(mapKey) + " euros") ;
            System.out.println();
        }
    }
}
