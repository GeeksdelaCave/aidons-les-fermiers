package marche.traitement.label;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Tests unitaires de la classe LabelRouge
 * @version 1.0
 */
public class LabelRougeTest {
    /**
     * Teste si le produit a une qualité supérieure ou non
     */
    @Test
    public void testGetIsQualiteSuperieureProduit()
    {
        LabelRouge labelRouge = new LabelRouge(true);
        assert labelRouge.isQualiteSuperieureProduit();
    }
}
