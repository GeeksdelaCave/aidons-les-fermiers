package marche.affichage;

import javax.swing.*;

/**
 * La liste des popups d'erreur affichées en cas d'exception.
 *
 * @author Tristan DIETZ
 *
 * @version 1.0
 * @see marche.traitement.exceptions.InventairePleinException
 * @see marche.traitement.exceptions.ProduitPerimeException
 * @see marche.traitement.exceptions.SoldeNonDisponibleException
 */
public class ExceptionsPopups {

    public static void InventairePleinPopup() {
        JOptionPane.showMessageDialog(new JFrame(),
                "L'inventaire est plein.",
                "Erreur",
                JOptionPane.ERROR_MESSAGE);
    }

    public static void ProduitPerimePopup() {
        JOptionPane.showMessageDialog(new JFrame(),
                "Le produit est périmé.",
                "Erreur",
                JOptionPane.ERROR_MESSAGE);
    }

    public static void SoldeNonDispoPopup() {
        JOptionPane.showMessageDialog(new JFrame(),
                "Le solde n'est pas disponible.",
                "Erreur",
                JOptionPane.ERROR_MESSAGE);
    }

}
