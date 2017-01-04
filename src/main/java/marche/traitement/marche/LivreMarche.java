package marche.traitement.marche;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe LivreMarche
 * @author Nicolas Guigou
 */
public class LivreMarche implements Serializable {

    /**
     * Historique de toute les transactions
     */
    private static ArrayList<String> historique;

    /**
     * Méthode permettant d'ajouter une transaction à notre historique de transaction
     * @param str
     */
    public static void ajouterTransaction(String str){
        historique.add(str);
    }

    /**
     * Méthode permettant de récupérer l'historique des transactions
     * @return historique
     */
    public ArrayList<String> getHistorique(){return historique;}
}
