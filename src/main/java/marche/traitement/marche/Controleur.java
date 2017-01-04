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
 * @version 1.2
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
    private Controleur () {

    }

    /**
     *  Hash Map permettant d'associer un produit fermier à son prix moyen.
     *  @see Controleur#affichagePrixMoyen()
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
     * Elle présente plusieurs algorithmes :
     * - 1 : choisit aléatoirement l'acheteur
     * Autre : choisit le premier acheteur de la liste
     * @param offre Offre sujette à la recherche
     * @param val Choix de l'algorithme
     * @return L'acheteur choisit par l'algorithme <b>val</b>.
     */
    public static Acheteur choisirAcheteur(Offre offre, int val){
        ArrayList<Acheteur> liste = offre.getAcheteursPotentiels();
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
        String nomProduit = offre.getProduits().get(0).getClass().getSimpleName();
        String strTransaction = acheteur.getDenomination() + " a effectué un achat de " + cpt + " " + nomProduit + "(s)" + " au prix de "+ offre.getPrix() + " euros à " + vendeur.getDenomination() + " le " + LocalDate.now();
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
    public static void regulerPrix(Offre offre) {
        double prixMoyen = calculerPrixMoyen(offre);
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
     * @return Si l'offre est composée de produits exclusivement commercialisables, qu'ils sont dans l'inventaire et que le prix est acceptable.
     */
    public static boolean valider(Offre offre){

        double prixMoyen = 0.0;

        for(ProduitFermier p : offre.getProduits()){
            if(!p.isCommercialisable())
                return false;
        }

        prixMoyen = calculerPrixMoyen(offre);

        if( !( prixMoyen - prixMoyen * 0.2 <= offre.getPrix()  && offre.getPrix() <= prixMoyen + prixMoyen * 0.2)) {
            Controleur.regulerPrix(offre);
        }
        return true;

    }

    /**
     * Retourne un Array de String contenant le prix moyen des produits fermiers
     * @return tab
     */
    public static ArrayList<String> affichagePrixMoyen(){
        ArrayList<String> tab = new ArrayList<String>();
        for(String mapKey : associationPrixMoyensProduitsFermiers.keySet()){
            tab.add("Produit : " + mapKey + " , prix moyen : " + associationPrixMoyensProduitsFermiers.get(mapKey) + " euros") ;
        }
        return tab;
    }

    public static double calculerPrixMoyen(Offre offre) {
        double prixMoyen = 0;
        for (ProduitFermier pf : offre.getProduits())
            prixMoyen += associationPrixMoyensProduitsFermiers.get(pf.getClass().getSimpleName());
        return prixMoyen;
    }

    public static double calculerPrixMoyen(Offre offre) {
        double prixMoyen = 0;
        for (ProduitFermier pf : offre.getProduits())
            prixMoyen += associationPrixMoyensProduitsFermiers.get(pf.getClass().getSimpleName());
        return prixMoyen;
    }
}
