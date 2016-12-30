package marche.traitement.marche;

import java.util.ArrayList;

/**
 * Classe LivreMarche
 * @author Nicolas Guigou
 */
public class LivreMarche {

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
}
