package marche.affichage;

import javax.swing.*;
import java.awt.*;

/**
 * Fenêtre de base pour les autres fenêtres.
 *
 * Peut être développée pour un style propre à l'application.
 *
 * @author Tristan DIETZ
 *
 * @version 1.0
 * @see JFrame
 */
public abstract class FenetreGenerale extends JFrame {

    public FenetreGenerale(String title) {
        super(title);
        setLocationRelativeTo(null);
    }
}
