package marche.traitement.label;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Tests unitaires de la classe LabelRouge
 *
 * @author Thibaud CENENT
 *
 * @version 1.1
 */
public class LabelRougeTest {
    /**
     * Teste si le produit a une qualité supérieure ou non
     */
    @Test
    public void testGetIsQualiteSuperieureProduit() {
        LabelRouge labelRouge = new LabelRouge(true);
        assertTrue(labelRouge.isQualiteSuperieureProduit());
    }
}
