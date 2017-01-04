package marche.affichage;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;



/**
 * @author Nicolas Guigou
 */
public class FenetreCreationParticipant extends JFrame {

    private String acteurs[] = {"Fermier","Traider","Grossiste","Centrale d'achat"};
    private JPanel panneauCreationParticipant = new JPanel();
    private JComboBox comboBox = new JComboBox(acteurs);

    private JLabel label1 = new JLabel("Choisir votre type d'acteur");

    public FenetreCreationParticipant(String titre)
    {
        super(titre);
        panneauCreationParticipant.setLayout(new BorderLayout());
        JPanel panneau = new JPanel();
        panneau.setLayout(new GridLayout(4,1));
        panneauCreationParticipant.add(panneau);

        panneau.add(label1);
        panneau.add(comboBox);

        this.setSize(300,300);
        this.setContentPane(panneauCreationParticipant);
        this.setVisible(true);
    }

    /*public static void main(String[] args) {
        new FenetreCreationParticipant("Fenêtre de création de participant");
    }*/

}
