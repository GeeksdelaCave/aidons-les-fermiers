package marche.affichage;

import marche.traitement.marche.Controleur;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Création de la fenêtre représentant les prix moyens des produits fermiers
 * @author Thibaud CENENT
 * @version 1.0
 */
public class FenetrePrixMoyenProduit extends FenetreGenerale {

    /** Constructeur de la classe FenetrePrixMoyenProduit
     *
     * @param titre désigne le titre du produit
     */
    public FenetrePrixMoyenProduit(String titre) {
        super(titre);

        /**
         * On gére le remplissage des produits fermiers via un JTable
         */
        String[][] donnees = new String[7][1];
        for(int i = 0; i < donnees.length; ++i)
        {
            for(int j = 0; j < donnees[i].length; ++j)
                donnees[i][j] = Controleur.affichagePrixMoyen().get(i);
        }
        String[] entetes = {"Prix Moyen Produit Fermier"};
        JTable tableau = new JTable(donnees, entetes);
        this.getContentPane().add(tableau.getTableHeader(), BorderLayout.NORTH);
        this.getContentPane().add(tableau,BorderLayout.CENTER);

        this.setSize(300,175);
        this.setVisible(true);

    }

}
