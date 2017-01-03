package marche.traitement.label;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests unitaires de la classe LabelAOP
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @version 1.3
 * @see LabelAOP
 */
public class LabelAOPTest {

    /**
     * Teste le nom de lieu de création du produit en rapport avec le label
     */
   @Test
    public void testGetNomLieuCreation() {
       LabelAOP labelAOP = new LabelAOP("Champagne");
       assertEquals(labelAOP.getNomLieuCreation(), "Champagne");
   }
}