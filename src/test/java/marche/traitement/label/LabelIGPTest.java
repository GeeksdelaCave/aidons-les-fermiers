package marche.traitement.label;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Tests unitaires de la classe LabelIGP
 * @version 1.0
 */
public class LabelIGPTest {
    /**
     * Teste le lieu géographique du produit
     */
    @Test
    public void testGetLieuGeographiqueProduit()
    {
        LabelIGP labelIGP = new LabelIGP(800,"Roquefort");
        assertTrue(labelIGP.getLieuGeographiqueProduit().equals("Roquefort"));
    }

}
