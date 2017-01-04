package marche.affichage;

import marche.traitement.marche.Controleur;
import marche.traitement.marche.Marche;
import marche.traitement.participant.*;
import marche.traitement.production.UniteDeProduction;
import marche.traitement.produits.ProduitFermier;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;


/**Classe qui permet d'ajouter des participant par l'intermédiaire d'une IHM
 * @author Nicolas Guigou
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
                    if(e.getItem() == "Grossiste" || e.getItem() == "Centrale d'achat"){
                        labelPrenom.setVisible(false);
                        labelNom.setVisible(false);
                        fieldNom.setVisible(false);
                        fieldPrenom.setVisible(false);
                        labelDenomination.setVisible(true);
                        fieldDenomination.setVisible(true);
                        labelAcheteur.setVisible(true);
                        checkAcheteur.setVisible(true);
                        labelVendeur.setVisible(true);
                        checkVendeur.setVisible(true);
                        boutonCreer.setVisible(true);

                    }
                    if(e.getItem() == "Arboriculteur" || e.getItem() == "Horticulteur" || e.getItem() == "ProducteurDeViande" || e.getItem() == "ProducteurLaitier" || e.getItem() == "Trader"){
                        labelPrenom.setVisible(true);
                        labelNom.setVisible(true);
                        fieldNom.setVisible(true);
                        fieldPrenom.setVisible(true);
                        labelDenomination.setVisible(false);
                        fieldDenomination.setVisible(false);
                        labelAcheteur.setVisible(true);
                        checkAcheteur.setVisible(true);
                        labelVendeur.setVisible(true);
                        checkVendeur.setVisible(true);
                        boutonCreer.setVisible(true);
                    }
                }
            }
        });

        panneau.add(labelNom);
        panneau.add(fieldNom);

        labelNom.setVisible(false);
        fieldNom.setVisible(false);

        panneau.add(labelPrenom);
        panneau.add(fieldPrenom);

        labelPrenom.setVisible(false);
        fieldPrenom.setVisible(false);

        panneau.add(labelDenomination);
        panneau.add(fieldDenomination);

        labelDenomination.setVisible(false);
        fieldDenomination.setVisible(false);

        panneau.add(labelAcheteur);
        panneau.add(checkAcheteur);

        labelAcheteur.setVisible(false);
        checkAcheteur.setVisible(false);

        panneau.add(labelVendeur);
        panneau.add(checkVendeur);

        labelVendeur.setVisible(false);
        checkVendeur.setVisible(false);

        panneau.add(boutonCreer);
        boutonCreer.setVisible(false);
        boutonCreer.addActionListener(this);




        this.setSize(300,300);
        this.setContentPane(panneauCreationParticipant);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

   public void actionPerformed(ActionEvent e){
        if(comboBox.getSelectedItem() == "Arboriculteur"){
            if(checkAcheteur.isSelected()){
                Acheteur acheteur = new Acheteur(new Arboriculteur(new ArrayList<ProduitFermier>(),new ArrayList<UniteDeProduction>(),1000));
                acheteur.setDenomination(fieldNom.getText(),fieldNom.getText());
                Marche.getMarcheInstance().ajouterActeur(acheteur);
            }
            else{
                Vendeur vendeur = new Vendeur(new Arboriculteur(new ArrayList<ProduitFermier>(),new ArrayList<UniteDeProduction>(),1000));
                vendeur.setDenomination(fieldNom.getText(),fieldPrenom.getText());
                Marche.getMarcheInstance().ajouterActeur(vendeur);
            }

        }

       if(comboBox.getSelectedItem() == "ProducteurDeViande"){
           if(checkAcheteur.isSelected()){
               Acheteur acheteur = new Acheteur(new ProducteurDeViande(new ArrayList<ProduitFermier>(),new ArrayList<UniteDeProduction>(),1000));
               acheteur.setDenomination(fieldNom.getText(),fieldNom.getText());
               Marche.getMarcheInstance().ajouterActeur(acheteur);
           }
           else{
               Vendeur vendeur = new Vendeur(new ProducteurDeViande(new ArrayList<ProduitFermier>(),new ArrayList<UniteDeProduction>(),1000));
               vendeur.setDenomination(fieldNom.getText(),fieldPrenom.getText());
               Marche.getMarcheInstance().ajouterActeur(vendeur);
           }

       }

       if(comboBox.getSelectedItem() == "ProducteurDeLait"){
           if(checkAcheteur.isSelected()){
               Acheteur acheteur = new Acheteur(new ProducteurLaitier(new ArrayList<ProduitFermier>(),new ArrayList<UniteDeProduction>(),1000));
               acheteur.setDenomination(fieldNom.getText(),fieldNom.getText());
               Marche.getMarcheInstance().ajouterActeur(acheteur);

           }
           else{
               Vendeur vendeur = new Vendeur(new ProducteurLaitier(new ArrayList<ProduitFermier>(),new ArrayList<UniteDeProduction>(),1000));
               vendeur.setDenomination(fieldNom.getText(),fieldPrenom.getText());
               Marche.getMarcheInstance().ajouterActeur(vendeur);
           }

       }

       if(comboBox.getSelectedItem() == "Horticulteur"){
           if(checkAcheteur.isSelected()){
               Acheteur acheteur = new Acheteur(new Horticulteur(new ArrayList<ProduitFermier>(),new ArrayList<UniteDeProduction>(),1000));
               acheteur.setDenomination(fieldNom.getText(),fieldNom.getText());
               Marche.getMarcheInstance().ajouterActeur(acheteur);
           }
           else{
               Vendeur vendeur = new Vendeur(new Horticulteur(new ArrayList<ProduitFermier>(),new ArrayList<UniteDeProduction>(),1000));
               vendeur.setDenomination(fieldNom.getText(),fieldPrenom.getText());
               Marche.getMarcheInstance().ajouterActeur(vendeur);
           }

       }

       if(comboBox.getSelectedItem() == "Grossiste"){
           if(checkAcheteur.isSelected()){
               Acheteur acheteur = new Acheteur(new Grossiste(fieldDenomination.getText()));
               acheteur.setDenomination(fieldDenomination.getText(),null);
               Marche.getMarcheInstance().ajouterActeur(acheteur);
           }
           else{
               Vendeur vendeur = new Vendeur(new Grossiste(fieldDenomination.getText()));
               vendeur.setDenomination(fieldDenomination.getText(),null);
               Marche.getMarcheInstance().ajouterActeur(vendeur);
           }

       }

       if(comboBox.getSelectedItem() == "Centrale d'achat"){
           if(checkAcheteur.isSelected()){
               Acheteur acheteur = new Acheteur(new CentraleAchat(fieldDenomination.getText()));
               acheteur.setDenomination(fieldDenomination.getText(),null);
               Marche.getMarcheInstance().ajouterActeur(acheteur);
           }
           else{
               Vendeur vendeur = new Vendeur(new CentraleAchat(fieldDenomination.getText()));
               vendeur.setDenomination(fieldDenomination.getText(),null);
               Marche.getMarcheInstance().ajouterActeur(vendeur);
           }

       }

       if(comboBox.getSelectedItem() == "Trader"){
           if(checkAcheteur.isSelected()){
               Acheteur acheteur = new Acheteur(new Trader());
               acheteur.setDenomination(fieldNom.getText(),fieldNom.getText());
               Marche.getMarcheInstance().ajouterActeur(acheteur);
           }
           else{
               Vendeur vendeur = new Vendeur(new Trader());
               vendeur.setDenomination(fieldNom.getText(),fieldPrenom.getText());
               Marche.getMarcheInstance().ajouterActeur(vendeur);
           }

       }

   }

   public Acteur creerDecorateur(Acteur acteur, boolean acheteur, boolean vendeur) {
       return null;
   }

    public static void main(String[] args) {
        new FenetreCreationParticipant("Fenêtre de création de participant");
    }

}
