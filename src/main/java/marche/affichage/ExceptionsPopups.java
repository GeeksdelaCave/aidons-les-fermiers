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

    public static void inventairePleinPopup() {
        JOptionPane.showMessageDialog(new JFrame(),
                "L'inventaire est plein.",
                "Erreur",
                JOptionPane.ERROR_MESSAGE);
    }

    public static void produitPerimePopup() {
        JOptionPane.showMessageDialog(new JFrame(),
                "Le produit est périmé.",
                "Erreur",
                JOptionPane.ERROR_MESSAGE);
    }

    public static void soldeNonDispoPopup() {
        JOptionPane.showMessageDialog(new JFrame(),
                "Le solde n'est pas disponible.",
                "Erreur",
                JOptionPane.ERROR_MESSAGE);
    }

    public static void pasAssezObjets() {
        JOptionPane.showMessageDialog(new JFrame(),
                "Les objets n'existent pas dans" + "\n" +
                        "l'inventaire du vendeur.",
                "Erreur",
                JOptionPane.ERROR_MESSAGE);
    }

    public static void produitFermierNonCommercialisable() {
        JOptionPane.showMessageDialog(new JFrame(),
                "La qualité du produit laisse trop à" + "\n" +
                        "désirer, ou le produit est périmé.",
                "Erreur",
                JOptionPane.ERROR_MESSAGE);
    }

    public static void livreEnregistre() {
        JOptionPane.showMessageDialog(new JFrame(),
                "Le Livre des Transactions a bien" + "\n" +
                    "été enregistré.",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void livreNonEnregistre() {
        JOptionPane.showMessageDialog(new JFrame(),
                "Une erreur est survenue lors de" + "\n" +
                        "l'enregistrement du Livre des" + "\n" +
                        "Transactions.",
                "Erreur",
                JOptionPane.ERROR_MESSAGE);
    }

}
