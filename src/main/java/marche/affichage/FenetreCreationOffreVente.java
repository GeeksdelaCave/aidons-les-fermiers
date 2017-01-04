package marche.affichage;

import marche.traitement.cotisation.Visitable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Thibaud on 04/01/2017.
 */
public class FenetreCreationOffreVente extends FenetreGenerale implements Observable {

    public FenetreCreationOffreVente(String title) throws HeadlessException {

        super(title);

        JPanel panneauCreationOffreVente = new JPanel();
        panneauCreationOffreVente.setLayout(new BorderLayout());

        JLabel produitFermier = new JLabel("Produit Fermier");
        String produitsfermiers[] = {"Cochon","Fromage","Lait","Miel","Oeuf","Pomme","Vache"};
        JComboBox comboBoxInventaireVendeur = new JComboBox(produitsfermiers);

        JLabel quantite = new JLabel("Quantité : ");
        JTextField zoneTexteQuantite = new JTextField();

        JLabel prix = new JLabel("Prix : ");
        JTextField zoneTextePrix = new JTextField();

        JButton validation = new JButton("Valider");

        JPanel panneauCorps = new JPanel();
        panneauCorps.setLayout(new GridLayout(7,0,10,7));
        panneauCorps.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
        panneauCorps.add(produitFermier);
        panneauCorps.add(comboBoxInventaireVendeur);
        panneauCorps.add(quantite);
        panneauCorps.add(zoneTexteQuantite);
        panneauCorps.add(prix);
        panneauCorps.add(zoneTextePrix);
        panneauCorps.add(validation);
        panneauCreationOffreVente.add(panneauCorps);


        this.setSize(300,300);
        this.setContentPane(panneauCreationOffreVente);
        this.setVisible(true);



    }

    public void ajouterObservateur(Observateur observateur) {

    }

    public void enleverObservateur(Observateur observateur) {

    }

    public void notifierObservateur() {

    }

    public static void main(String[] args){
        new FenetreCreationOffreVente("Creer Offre de Vente");
    }
}
