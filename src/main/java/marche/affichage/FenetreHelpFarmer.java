package marche.affichage;

import javax.swing.*;

/**
 * Fenetre Principale de l'application où celle-ci va appeller les fenêtres principales à l'ouverture de l' application.
 * @author Thibaud CENENT
 * @version 1.0
 */
public class FenetreHelpFarmer extends JFrame {
    private ImageIcon image = new ImageIcon("ApplicationHELPFARMERSLogo.png");
    private JLabel label = new JLabel(image);
    public FenetreHelpFarmer(){
        super();
        this.add(label);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new FenetreHelpFarmer();
    }
}
