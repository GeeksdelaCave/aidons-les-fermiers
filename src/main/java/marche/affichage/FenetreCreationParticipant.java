package marche.affichage;

import marche.traitement.marche.Controleur;
import marche.traitement.participant.Horticulteur;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


/**
 * @author Nicolas Guigou
 * Classe qui permet d'ajouter des participant par l'intermédiaire d'une IHM
 */
public class FenetreCreationParticipant extends FenetreGenerale implements ActionListener{

    private String acteurs[] = {"Arboriculteur","Trader","Grossiste","Centrale d'achat", "Horticulteur","ProducteurDeViande", "ProducteurLaitier", };
    private JPanel panneauCreationParticipant = new JPanel();
    private JComboBox comboBox = new JComboBox(acteurs);

    private JLabel labelTypeActeur = new JLabel("Choisir votre type d'acteur");
    private JLabel labelNom = new JLabel("Nom");
    private JLabel labelPrenom = new JLabel("Prenom");
    private JLabel labelDenomination = new JLabel("Denomination");
    private JLabel labelAcheteur = new JLabel("Acheteur");
    private JLabel labelVendeur = new JLabel("Vendeur");

    private JTextField fieldNom = new JTextField();
    private JTextField fieldPrenom = new JTextField();
    private JTextField fieldDenomination = new JTextField();

    private JButton boutonCreer = new JButton("Créer");

    private JCheckBox checkAcheteur = new JCheckBox();
    private JCheckBox checkVendeur = new JCheckBox();



    public FenetreCreationParticipant(String titre)
    {
        super(titre);
        panneauCreationParticipant.setLayout(new BorderLayout());

        JPanel panneau = new JPanel();
        panneau.setLayout(new GridLayout(13,0));
        panneau.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));

        panneauCreationParticipant.add(panneau);

        panneau.add(labelTypeActeur);
        panneau.add(comboBox);

        comboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED){
                    if(e.getItem() == "Grossiste" || e.getItem() == "Trader" || e.getItem() == "Centrale d'achat"){
                        labelPrenom.setVisible(false);
                        labelNom.setVisible(false);
                        fieldNom.setVisible(false);
                        fieldPrenom.setVisible(false);
                        labelDenomination.setVisible(true);
                        fieldDenomination.setVisible(true);
                    }
                    if(e.getItem() == "Arboriculteur" || e.getItem() == "Horticulteur" || e.getItem() == "ProducteurDeViande" || e.getItem() == "ProducteurLaitier"){
                        labelPrenom.setVisible(true);
                        labelNom.setVisible(true);
                        fieldNom.setVisible(true);
                        fieldPrenom.setVisible(true);
                        labelDenomination.setVisible(false);
                        fieldDenomination.setVisible(false);
                    }
                }
            }
        });

        panneau.add(labelNom);
        panneau.add(fieldNom);

        panneau.add(labelPrenom);
        panneau.add(fieldPrenom);

        panneau.add(labelDenomination);
        panneau.add(fieldDenomination);

        panneau.add(labelAcheteur);
        panneau.add(checkAcheteur);

        panneau.add(labelVendeur);
        panneau.add(checkVendeur);

        panneau.add(boutonCreer);
        boutonCreer.addActionListener(this);




        this.setSize(300,300);
        this.setContentPane(panneauCreationParticipant);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

   public void actionPerformed(ActionEvent e){
        if(comboBox.getSelectedItem() == "Arboriculteur"){
            if(checkAcheteur.isSelected()){

            }
            else{

            }

        }

       if(comboBox.getSelectedItem() == "ProducteurDeViande"){
           if(checkAcheteur.isSelected()){

           }
           else{

           }

       }

       if(comboBox.getSelectedItem() == "ProducteurDeLair"){
           if(checkAcheteur.isSelected()){

           }
           else{

           }

       }

       if(comboBox.getSelectedItem() == "Horticulteur"){
           if(checkAcheteur.isSelected()){

           }
           else{

           }

       }

       if(comboBox.getSelectedItem() == "Grossiste"){
           if(checkAcheteur.isSelected()){

           }
           else{

           }

       }

       if(comboBox.getSelectedItem() == "Centrale d'achat"){
           if(checkAcheteur.isSelected()){

           }
           else{

           }

       }

       if(comboBox.getSelectedItem() == "Trader"){
           if(checkAcheteur.isSelected()){

           }
           else{

           }

       }

   }

    public static void main(String[] args) {
        new FenetreCreationParticipant("Fenêtre de création de participant");
    }

}
