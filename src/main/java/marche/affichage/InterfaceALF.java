package marche.affichage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Fenêtre permettant de voir l'ensemble des participants et d'accéder au Menu.
 *
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @version 1.0
 */
public class InterfaceALF extends FenetreGenerale {

    private static InterfaceALF instance;
    /**
     * Fenêtre principale de l'application
     * @param titre Titre de l'application
     */
    private InterfaceALF(String titre)
    {
        super(titre);

        this.setJMenuBar(new BarreMenu());
        this.setContentPane(new JLabel(new ImageIcon("src/main/resources/img/background.jpg")));

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setResizable(false);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static InterfaceALF getInstance() {
        if (instance == null)
            instance = new InterfaceALF("Aidons les Fermiers");
        return instance;
    }
}
