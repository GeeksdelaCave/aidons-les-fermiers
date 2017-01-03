package marche.traitement.label;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests unitaires de la classe LabelAOC
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @version 1.3
 */
public class LabelAOCTest {
    /**
     * Teste la région où a été créé le produit
     */
    @Test
    public void testGetRegionCreationProduit() {
        LabelAOC labelAOC = new LabelAOC("Alsace",true);
        assertEquals(labelAOC.getRegionCreationProduit(), "Alsace");
    }

    /**
     * Teste si le produit est authentique
     */
    @Test
    public void testGetIsAuthenticiteProduit() {
        LabelAOC labelAOC = new LabelAOC("Alsace",true);
        assertTrue(labelAOC.isAuthenticiteProduit());
    }
}
