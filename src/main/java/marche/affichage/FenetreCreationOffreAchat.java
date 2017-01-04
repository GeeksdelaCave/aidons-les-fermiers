package marche.affichage;

import marche.traitement.marche.Marche;
import marche.traitement.marche.Offre;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Thibaud on 04/01/2017.
 */
public class FenetreCreationOffreAchat extends FenetreGenerale {

    public FenetreCreationOffreAchat(String title) throws HeadlessException {

        super(title);
        JPanel panneauCreationOffreAchat = new JPanel();
        JPanel panneauCorps = new JPanel();
        panneauCorps.setLayout(new GridLayout(3,0,15,8));
        String[] numerosOffresMarche = new String[Marche.getMarcheInstance().getCatalogue().size()];
        int cpt = 0;
        for(Offre offre : Marche.getMarcheInstance().getCatalogue() ){
            numerosOffresMarche[cpt] = String.valueOf(offre.getIDOffre());
            ++cpt;
        }
        JLabel numeroOffre = new JLabel("Offre Numéro ");
        JComboBox comboBoxListeOffreVente = new JComboBox(numerosOffresMarche);
        JButton validation = new JButton("Valider");
        panneauCorps.add(numeroOffre);
        panneauCorps.add(comboBoxListeOffreVente);
        panneauCorps.add(validation);
        panneauCreationOffreAchat.add(panneauCorps);
        this.setContentPane(panneauCreationOffreAchat);
        this.setSize(300,150);
        this.setVisible(true);


    }

    public static void main(String[] args){
        new FenetreCreationOffreAchat("Creer Offre d'Achat");
    }
}
