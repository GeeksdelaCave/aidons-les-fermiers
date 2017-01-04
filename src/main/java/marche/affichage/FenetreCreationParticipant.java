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
 *
 * @author Nicolas Guigou
 * @author Tristan DIETZ
 *
 * @version 1.2
 * @see Acteur
 */
public class FenetreCreationParticipant extends FenetreGenerale implements ActionListener,Observable{

    /**
     * Attribut permettant de remplir le combobox, ce sont les différents acteurs qui peuvent être créer
     */
    private String acteurs[] = {"Arboriculteur","Trader","Grossiste","Centrale d'achat", "Horticulteur","ProducteurDeViande", "ProducteurLaitier", };

    /**
     * Panneau permettant de contenir les objets de la fenêtre
     */
    private JPanel panneauCreationParticipant = new JPanel();

    /**
     * Liste permettant de sélectionner le type d'acteur que l'on veut créer
     */
    private JComboBox comboBox = new JComboBox(acteurs);

    /**
     * Label permettant à l'utilisateur de savoir quoi faire
     */
    private JLabel labelTypeActeur = new JLabel("Choisir votre type d'acteur");

    /**
     * Label permettant à l'utilisateur de connaitre le champs à remplir
     */
    private JLabel labelNom = new JLabel("Nom");

    /**
     * Label permettant à l'utilisateur de connaitre le champas à remplir
     */
    private JLabel labelPrenom = new JLabel("Prenom");

    /**
     * Label permettant à l'utilisateur de connaitre le champas à remplir
     */
    private JLabel labelDenomination = new JLabel("Denomination");

    /**
     * Label permettant à l'utilisateur de connaitre le champas à remplir
     */
    private JLabel labelAcheteur = new JLabel("Acheteur");

    /**
     * Label permettant à l'utilisateur de connaitre le champas à remplir
     */
    private JLabel labelVendeur = new JLabel("Vendeur");

    /**
     * Zone de texte permettant de choisir le nom de l'acteur
     */
    private JTextField fieldNom = new JTextField();

    /**
     * Zone de texte permettant de choisir le prenom de l'acteur
     */
    private JTextField fieldPrenom = new JTextField();

    /**
     * Zone de texte permettant de choisir la dénomination de l'acteur
     */
    private JTextField fieldDenomination = new JTextField();

    /**
     * Bouton permettant à l'utilisateur de lancer le processus de création d'un acteur
     */
    private JButton boutonCreer = new JButton("Créer");

    /**
     * Case à cocher permettant à l'utilisateur d'indiquer qu'il veut son acteur soit capable d'acheter
     */
    private JCheckBox checkAcheteur = new JCheckBox();

    /**
     * Case à cocher permettant à l'utilisateur d'indiquer qu'il veut son acteur soit capable de vendre
     */
    private JCheckBox checkVendeur = new JCheckBox();


    /**
     * Constructeur de la classe FenetreCreationParticipant
     * @param titre
     */
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

    /**
     * Méthode permettant de créer les acteurs
     * @param e
     */
   public void actionPerformed(ActionEvent e) {
        Acteur acteur;

        if(comboBox.getSelectedItem() == "Arboriculteur") {
            acteur = new Arboriculteur(new ArrayList<ProduitFermier>(), new ArrayList<UniteDeProduction>(), 1000);
            acteur.setDenomination(fieldNom.getText(), fieldPrenom.getText());
        }

       else if(comboBox.getSelectedItem() == "ProducteurDeViande") {
           acteur = new ProducteurDeViande(new ArrayList<ProduitFermier>(), new ArrayList<UniteDeProduction>(), 1000);
           acteur.setDenomination(fieldNom.getText(), fieldPrenom.getText());
       }

       else if(comboBox.getSelectedItem() == "ProducteurDeLait") {
           acteur = new ProducteurLaitier(new ArrayList<ProduitFermier>(),new ArrayList<UniteDeProduction>(),1000);
           acteur.setDenomination(fieldNom.getText(), fieldPrenom.getText());
        }

       else if(comboBox.getSelectedItem() == "Horticulteur") {
           acteur = new Horticulteur(new ArrayList<ProduitFermier>(),new ArrayList<UniteDeProduction>(),1000);
           acteur.setDenomination(fieldNom.getText(), fieldPrenom.getText());
       }

       else if(comboBox.getSelectedItem() == "Grossiste") {
            acteur = new Grossiste(fieldDenomination.getText());
       }

       else if(comboBox.getSelectedItem() == "Centrale d'achat") {
           acteur = new CentraleAchat(fieldDenomination.getText());
       }

       else if(comboBox.getSelectedItem() == "Trader") {
           acteur = new Trader();
           acteur.setDenomination(fieldNom.getText(), fieldPrenom.getText());
       }
       /* Choix impossible mais nécessaire pour la compilation */
       else {
            System.out.println("Choix impossible");
            acteur = null;
        }

       Marche.getMarcheInstance().ajouterActeur(creerDecorateur(acteur, checkAcheteur.isSelected(), checkVendeur.isSelected()));

   }

    public void ajouterObservateur(Observateur observateur) {

    }

    public void enleverObservateur(Observateur observateur) {

    }

    public void notifierObservateur() {

    }

   public Acteur creerDecorateur(Acteur acteur, boolean acheteur, boolean vendeur) {
       if (acheteur && vendeur)
           return new Vendeur(new Acheteur(acteur));
       else if (acheteur)
           return new Acheteur(acteur);
       else if (vendeur)
           return new Vendeur(acteur);
       else
           return acteur;

   }



}
