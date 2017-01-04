package marche.affichage;

import javax.swing.*;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

/**
 * Fenetre Principale de l'application où celle-ci va appeller les fenêtres principales à l'ouverture de l' application.
 * @author Thibaud CENENT
 * @version 1.0
 */
public class FenetreHelpFarmer extends FenetreGenerale {



    public FenetreHelpFarmer() {

        super("Logo");

        JLabel label = new JLabel(new ImageIcon("src/main/resources/img/logo.png"));
        this.add(label);

        this.setUndecorated(true);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(new JFrame(),
                    "TimeUnit n'est pas supporté sur votre distribution." + "\n\n" + "Merci de mettre à jour votre distribution ou machine virtuelle Java.",
                    "Erreur",
                    JOptionPane.ERROR_MESSAGE);
        }

        new FenetreParticipant("Participants");
        new FenetreCatalogue("Catalogue");
        new FenetrePrixMoyenProduit("Prix moyen");

        this.dispose();
    }

    public static void main(String[] args)
    {
        System.out.println(System.getProperty("user.dir"));
        new FenetreHelpFarmer();
    }
}
