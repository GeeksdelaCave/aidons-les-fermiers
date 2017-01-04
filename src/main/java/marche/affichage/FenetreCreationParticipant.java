package marche.affichage;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


/**
 * @author Nicolas Guigou
 */
public class FenetreCreationParticipant extends FenetreGenerale {

    private String acteurs[] = {"Fermier","Trader","Grossiste","Centrale d'achat"};
    private JPanel panneauCreationParticipant = new JPanel();
    private JComboBox comboBox = new JComboBox(acteurs);

    private JLabel labelTypeActeur = new JLabel("Choisir votre type d'acteur");
    private JLabel labelNom = new JLabel("Nom");
    private JLabel labelPrenom = new JLabel("Prenom");
    private JLabel labelDenomination = new JLabel("Denomination");

    private JTextField fieldNom = new JTextField();
    private JTextField fieldPrenom = new JTextField();
    private JTextField fieldDenomination = new JTextField();

    private JButton boutonCreer = new JButton("Créer");


    public FenetreCreationParticipant(String titre)
    {
        super(titre);
        panneauCreationParticipant.setLayout(new BorderLayout());

        JPanel panneau = new JPanel();
        panneau.setLayout(new GridLayout(7,0));
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
                }
            }
        });

        panneau.add(labelNom);
        panneau.add(fieldNom);

        panneau.add(labelPrenom);
        panneau.add(fieldPrenom);

        panneau.add(boutonCreer);

        this.setSize(300,300);
        this.setContentPane(panneauCreationParticipant);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FenetreCreationParticipant("Fenêtre de création de participant");
    }

}
