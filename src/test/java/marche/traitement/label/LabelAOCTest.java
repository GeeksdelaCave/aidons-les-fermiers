package marche.traitement.label;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Tests unitaires de la classe LabelAOC
 * @version 1.2
 */
public class LabelAOCTest {
    /**
     * Teste la région où a été créé le produit
     */
    @Test
    public void testGetRegionCreationProduit()
    {
        LabelAOC labelAOC = new LabelAOC("Alsace",true);
        assert labelAOC.getRegionCreationProduit().equals("Alsace");
    }

    /**
     * Teste si le produit est authentique
     */
    @Test
    public void testGetIsAuthenticiteProduit()
    {
        LabelAOC labelAOC = new LabelAOC("Alsace",true);
        assert labelAOC.isAuthenticiteProduit();
    }
}
