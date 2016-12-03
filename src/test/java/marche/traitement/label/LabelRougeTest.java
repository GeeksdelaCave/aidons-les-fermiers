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
    public void getIsQualiteSuperieureProduit()
    {
        LabelRouge labelRouge = new LabelRouge(750,true);
        assertTrue(labelRouge.isQualiteSuperieureProduit() == true);
    }
}
