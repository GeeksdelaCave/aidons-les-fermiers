package marche.traitement.label;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Tests unitaires de la classe LabelAOP
 *
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @version 1.3
 * @see LabelAOP
 */
public class LabelAOPTest {
    /**
     * Teste l'identifiant du label
     */
   @Test
    public void testGetIdLabel()
   {
       Label label = new LabelAOP("Roquefort");
       assertTrue(label.getIdLabel() == 1 || label.getIdLabel() == 3);
   }

    /**
     * Teste le nom de lieu de création du produit en rapport avec le label
     */
   @Test
    public void testGetNomLieuCreation()
   {
       LabelAOP labelAOP = new LabelAOP("Champagne");
       assert labelAOP.getNomLieuCreation().equals("Champagne");
   }
}
