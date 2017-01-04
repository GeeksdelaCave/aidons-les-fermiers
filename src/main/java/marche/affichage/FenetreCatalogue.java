package marche.affichage;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Thibaud on 04/01/2017.
 */
public class FenetreCatalogue extends JFrame {
    private JPanel panneauCatalogue = new JPanel();
    private JTextArea zoneTexteCatalogue = new JTextArea();
    public FenetreCatalogue(String titre){
        super(titre);
        this.setSize(350,400);
        panneauCatalogue.setLayout(new BorderLayout());
        panneauCatalogue.add(zoneTexteCatalogue);
        this.setContentPane(panneauCatalogue);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args){
        new FenetreCatalogue("Catalogue");
    }
}
