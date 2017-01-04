package marche.affichage;

import marche.traitement.marche.Marche;
import marche.traitement.marche.Offre;

import javax.swing.*;
import java.awt.*;

/**
 * Création de la fenêtre permettant la création d'une offre d'achat sur une offre disponible dans le catalogue
 * @author Thibaud CENENT
 * @version 1.0
 */
public class FenetreCreationOffreAchat extends FenetreGenerale {

    /** Constructeur de la classe FenetreCréationOffreAchat
     *
     * @param title représente le titre de la JFrame
     */
    public FenetreCreationOffreAchat(String title){

        super(title);
        JPanel panneauCreationOffreAchat = new JPanel();
        JPanel panneauCorps = new JPanel();
        panneauCorps.setLayout(new GridLayout(3,0,15,8));

        /**
         * Gére et remplit la comboBox des offres de vente disponible dans catalogue via la méthode String.valueOf
         */
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
