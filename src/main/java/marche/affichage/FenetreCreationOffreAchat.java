package marche.affichage;

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
        panneauCorps.setLayout(new GridLayout(3,0,10,8));
        JLabel numeroOffre = new JLabel("Offre Numéro ");
        JComboBox comboBoxListeOffreVente = new JComboBox();


    }
}
