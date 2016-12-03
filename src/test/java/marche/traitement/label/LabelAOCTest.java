package marche.traitement.label;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Tests unitaires de la classe LabelAOC
 * @version 1.0
 */
public class LabelAOCTest {
    /**
     * Teste la région où a été créé le produit
     */
    @Test
    public void getRegionCreationProduit()
    {
        LabelAOC labelAOC = new LabelAOC(950,"Alsace",true);
        assertTrue(labelAOC.getRegionCreationProduit().equals("Alsace"));
    }

    /**
     * Teste si le produit est authentique
     */
    @Test
    public void getIsAuthenticiteProduit()
    {
        LabelAOC labelAOC = new LabelAOC(900,"Alsace",true);
        assertTrue(labelAOC.isAuthenticiteProduit() == true);
    }
}
