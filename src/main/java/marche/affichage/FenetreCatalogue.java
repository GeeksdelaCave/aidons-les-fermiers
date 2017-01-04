package marche.affichage;

import javax.swing.*;
import java.awt.*;

/**
 * Création de la fenêtre affichant le catalogue contenant les offres de vendeurs
 * @author Thibaud CENENT
 * @version 1.0
 */
public class FenetreCatalogue extends JFrame {

    /**
     * Panneau désignant le composant où va être placé la zone de texte contenant les offres du catalogue.
     * @see FenetreCatalogue#FenetreCatalogue(String)
     */
    private JPanel panneauCatalogue = new JPanel();

    /**
     * Zone de Texte où va être placé les offres crées par les vendeurs.
     * @see FenetreCatalogue#FenetreCatalogue(String)
     */
    private JTextArea zoneTexteCatalogue = new JTextArea();

    /** Constructeur de la fenêtre catalogue
     *
     * @param titre désignant le titre de la fenêtre
     */
    public FenetreCatalogue(String titre){
        super(titre);
        this.setSize(350,400);
        panneauCatalogue.setLayout(new BorderLayout());
        panneauCatalogue.add(zoneTexteCatalogue);
        this.setContentPane(panneauCatalogue);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /*public static void main(String[] args){
        new FenetreCatalogue("Catalogue");
    }*/
}
