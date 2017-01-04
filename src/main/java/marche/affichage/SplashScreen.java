package marche.affichage;

import javax.swing.*;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

/**
 * Fenêtre splash-screen, à lancer avant la fenêtre principale de l'application.
 *
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @version 1.2
 */
public class SplashScreen extends FenetreGenerale {

    /**
     * Constructeur du splash-screen
     */
    public SplashScreen() {

        super("Logo");

        JLabel label = new JLabel(new ImageIcon("src/main/resources/img/logo.png"));
        this.add(label);

        this.setUndecorated(true);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(new JFrame(),
                    "TimeUnit n'est pas supporté sur votre distribution." + "\n\n" +
                            "Merci de mettre à jour votre distribution ou machine virtuelle Java.",
                    "Erreur",
                    JOptionPane.ERROR_MESSAGE);
        }

        InterfaceALF.getInstance();

        new FenetrePrixMoyenProduit("");

        this.dispose();
    }

    public static void main(String[] args) {
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Menu");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        System.out.println("Une erreur ? Pas de soucis ! Vous n'avez juste pas Mac ;)");

        new SplashScreen();
    }
}
