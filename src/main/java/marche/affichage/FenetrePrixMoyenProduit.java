package marche.affichage;

import marche.traitement.marche.Controleur;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Thibaud on 04/01/2017.
 */
public class FenetrePrixMoyenProduit extends FenetreGenerale {

    private JTextArea zoneTextePrixMoyen = new JTextArea();
    private JPanel panneauPrixMoyen = new JPanel();

    public FenetrePrixMoyenProduit(String titre) {
        super(titre);
        this.setSize(400,500);
        for(String str : Controleur.affichagePrixMoyen())
        {
            zoneTextePrixMoyen.setText(zoneTextePrixMoyen.getText() + str + '\n' + '\n');
        }
        panneauPrixMoyen.setLayout(new BorderLayout());
        panneauPrixMoyen.add(zoneTextePrixMoyen);
        this.setContentPane(panneauPrixMoyen);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    /*public static void main (String[] args){
        new FenetrePrixMoyenProduit("Prix Moyen Produit");
    }*/
}
