package marche.traitement.production;

import marche.traitement.exceptions.InventairePleinException;
import marche.traitement.produits.Oeuf;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Classe PoulaillerTest représentant les tests unitaires effectués sur la classe
 * @version 1.0
 */
public class PoulaillerTest {

    /**
     *  Teste si l'ajout à l'inventaire est possible
     */
    @Test (expected = InventairePleinException.class)
    public void testAjouterInventaire() throws InventairePleinException {
        Poulailler poulailler = new Poulailler(1,"Limoges");
        Oeuf packoeuf = poulailler.creerPackOeuf(3.0f, LocalDate.of(2016,10,28),(short)50.0);

        Oeuf packoeuf2 = poulailler.creerPackOeuf(4.0f,LocalDate.of(2016,10,28),(short) 75.0);
    }
}
