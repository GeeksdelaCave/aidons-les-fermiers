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
public class FenetreParticipant extends JFrame {
    /**
     * Panneau composant permettant de gérer l'affichage des participants.
     * @see FenetreParticipant#FenetreParticipant(String)
     */
    private JPanel panneauAffichageParticipant = new JPanel();

    /**
     * Barre de Menu qui permettra l'accès au Menu.
     * @see
     */
    private JMenuBar barreMenu = new JMenuBar();

    /**
     * Menu permettant d'accéder aux différents choix possibles.
     */
    private JMenu menu = new JMenu("Menu");

    /**
     *
     * @param titre
     */
    public FenetreParticipant(String titre)
    {
        super(titre);
        panneauAffichageParticipant.setLayout(new BorderLayout());
        JMenuItem item1 = new JMenuItem("Creer Participant");
        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("1");
            }
        });
        JMenuItem item2 = new JMenuItem("Paramètres");
        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("2");
            }
        });
        JMenuItem item3 = new JMenuItem("Documentation");
        item3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("3");
            }
        });
        JMenuItem item4 = new JMenuItem("A propos de ");
        item4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("4");
            }
        });
        JMenuItem item5 = new JMenuItem("Quitter l'application");
        item5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new FenetreQuitterApplication();
            }
        });
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        menu.add(item5);
        barreMenu.add(menu);
        this.setJMenuBar(barreMenu);
        this.setContentPane(panneauAffichageParticipant);
        this.setSize(500,400);
        this.setVisible(true);
    }

    /*public static void main(String[] args) {

        new FenetreParticipant("Fenêtre principal");
    }*/
}
