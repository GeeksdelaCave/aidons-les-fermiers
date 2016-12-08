package marche.traitement.production;

import marche.traitement.exceptions.InventairePleinException;
import marche.traitement.produits.Oeuf;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

/**
 * Classe PoulaillerTest représentant les tests unitaires effectués sur la classe
 * @version 1.0
 */
public class PoulaillerTest {

    /**
     * Teste de créer deux packs d'oeufs et vérifie leur identification à la création
     */
    @Test
    public void testCreerOeuf() {
        Poulailler poulailler = new Poulailler(10,"Limoges");
        Oeuf packoeuf = poulailler.creerPackOeuf(3.0f, LocalDate.of(2016,10,28),(short)50.0);
        assertTrue(packoeuf.getIdPackOeuf() == 100);

        Oeuf packoeuf2 = poulailler.creerPackOeuf(4.0f,LocalDate.of(2016,10,28),(short) 75.0);
        assertTrue(packoeuf2.getIdPackOeuf() == 200);
    }

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
