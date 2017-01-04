package marche.affichage;

import javax.swing.*;
import java.awt.*;

/**
 * Created by pyrrha on 04/01/2017.
 */
public abstract class FenetreGenerale extends JFrame {

    public FenetreGenerale(String title) throws HeadlessException {
        super(title);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
