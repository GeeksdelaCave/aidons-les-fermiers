package marche.affichage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Fenêtre permettant de voir l'ensemble des participants et d'accéder au Menu.
 * @author Thibaud CENENT
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

        JPanel panneauAffichageParticipant = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panneauAffichageParticipant.setLayout(new BorderLayout());

        this.setJMenuBar(new BarreMenu());
        this.setContentPane(panneauAffichageParticipant);
        this.setSize(800,600);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static InterfaceALF getInstance() {
        if (instance == null)
            instance = new InterfaceALF("Aidons les Fermiers");
        return instance;
    }
}
