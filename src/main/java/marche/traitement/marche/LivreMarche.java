package marche.traitement.marche;

import marche.traitement.participant.Acheteur;
import marche.traitement.participant.Vendeur;

import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;

/**
 * Classe LivreMarche
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Nicolas Guigou
 * @author Tristan DIETZ
 *
 * @version 1.2
 * @see Controleur#transfererBiens(Acheteur, Vendeur, Offre, Marche)
 */
public class LivreMarche implements Serializable {

    /**
     * Historique de toute les transactions
     */
    private static ArrayList<String> historique;

    /**
     * Méthode permettant d'ajouter une transaction à notre historique de transaction
     * @param str Chaîne à ajouter au livre d'or sur une nouvelle ligne.
     */
    public static void ajouterTransaction(String str){
        if (historique == null)
            historique = new ArrayList<String>();
        historique.add(str);
    }

    /**
     * Méthode permettant de récupérer l'historique des transactions
     * @return historique
     */
    public static ArrayList<String> getHistorique(){return historique;}


    /**
     * Méthode qui permet d'enregistrer dans un fichier les transactions effectuées.
     */
    public static void enregistrer () {
        try {
            FileOutputStream fos = new FileOutputStream("LivreDOr.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(historique);
            oos.close();
            fos.close();
            //TODO faire fenetre succe
        } catch (IOException e) {
            //TODO faire fenetre exception
        }
    }


}