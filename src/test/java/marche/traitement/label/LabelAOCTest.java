package marche.traitement.label;

import org.junit.Test;

/**
 * Tests unitaires de la classe LabelAOC
 *
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
