package marche.traitement.label;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests unitaires de la classe LabelIGP
 *
 * @author Romain COLONNA DISTRIA
 * @author Thibaud CENENT
 * @version 1.1
 */
public class LabelIGPTest {
    /**
     * Teste le lieu géographique du produit
     */
    @Test
    public void testGetLieuGeographiqueProduit() {
        LabelIGP labelIGP = new LabelIGP("Roquefort");
        assertEquals(labelIGP.getLieuGeographiqueProduit(), "Roquefort");
    }
}
