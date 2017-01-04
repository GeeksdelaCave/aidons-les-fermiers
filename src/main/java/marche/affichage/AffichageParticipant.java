package marche.affichage;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Thibaud on 04/01/2017.
 */
public class AffichageParticipant extends JFrame {
    private JPanel panneauAffichageParticipant = new JPanel();
    private JMenuBar barreMenu = new JMenuBar();
    private JMenu menu = new JMenu("Menu");
    private ArrayList<JMenuItem>  menuItems = new ArrayList<JMenuItem>();

    public AffichageParticipant(String titre)
    {
        super(titre);
        panneauAffichageParticipant.setLayout(new BorderLayout());
        menuItems.add(new JMenuItem("Creer Participant"));
        menuItems.add(new JMenuItem("Paramètres"));
        menuItems.add(new JMenuItem("Documentation"));
        menuItems.add(new JMenuItem("A propos de "));
        menuItems.add(new JMenuItem("Quitter l'application"));
        for(JMenuItem jMenuItem : menuItems)
            menu.add(jMenuItem);
        barreMenu.add(menu);
        this.setJMenuBar(barreMenu);
        this.setContentPane(panneauAffichageParticipant);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new AffichageParticipant("Fenêtre principal");
    }
}
