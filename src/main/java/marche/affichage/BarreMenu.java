package marche.affichage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;

import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 * Barre de menu de l'interface ALF
 *
 * @author Tristan DIETZ
 *
 * @version 1.1
 * @see InterfaceALF
 */
public class BarreMenu extends JMenuBar {

    public BarreMenu() {
        this.add(addMenu());
        this.add(addLivreTransactions());


        System.setProperty("apple.laf.useScreenMenuBar", "true");
        System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Test");
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
    }

    /**
     * Fonction de création de l'onglet du menu de base.
     *
     * @return Le menu de base
     */
    public JMenu addMenu() {
        JMenu menu = new JMenu("Menu");

        JMenuItem participant = new JMenuItem("Creer Participant");
        participant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("1");
            }
        });

        JMenuItem parametre = new JMenuItem("Paramètres");
        parametre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("2");
            }
        });

        /*
         * Lien vers la documentation
         */
        JMenuItem documentation = new JMenuItem("Documentation");
        documentation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                URI uri = URI.create("https://github.com/GeeksdelaCave/aidons-les-fermiers/tree/master/doc");
                try {
                    Desktop.getDesktop().browse(uri);
                } catch (IOException e1) {
                    JOptionPane.showMessageDialog(new JFrame(),
                            "Desktop n'est pas supporté sur votre distribution." + "\n\n" + "Merci de mettre à jour votre distribution ou machine virtuelle Java.",
                            "Erreur",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        /*
         * Informations supplémentaires sur l'application
         */
        JMenuItem aPropos = new JMenuItem("A propos de ");
        aPropos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(new JFrame(),
                        "Le projet Aidons les Fermiers est un projet collaboratif" + "\n" +"open-source." + "\n\n" +
                                "Réalisé par 4 étudiants dans le cadre de leurs études, ce" + "\n" + "programme se veut avant tout simple d'utilisation." + "\n\n" +
                                "",
                        "Informations",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        /*
         * Bouton pour quitter l'application
         */
        JMenuItem quitter = new JMenuItem("Quitter l'application");
        quitter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                if(JOptionPane.showConfirmDialog(InterfaceALF.getInstance(),"Voulez-vous vraiment quitter ?","",YES_NO_OPTION) == JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });

        menu.add(participant);
        menu.add(parametre);
        menu.add(documentation);
        menu.add(aPropos);
        menu.add(quitter);

        return menu;
    }

    /**
     * Fonction de création de l'onglet des livres.
     * - Permet l'enregistrement manuel du livre des transactions.
     * @return L'onglet Livre
     */
    public JMenu addLivreTransactions() {
        JMenu livre = new JMenu("Livre");

        JMenuItem enregistrer = new JMenuItem("Enregistrer");
        enregistrer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //TODO appeler la fonction d'enregistrement
            }
        });

        livre.add(enregistrer);

        return livre;
    }
}
