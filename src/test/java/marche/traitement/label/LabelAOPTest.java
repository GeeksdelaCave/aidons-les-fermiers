package marche.traitement.label;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Tests unitaires de la classe LabelAOP
 * @version 1.2
 */
public class LabelAOPTest {
    /**
     * Teste l'identifiant du label
     */
   @Test
    public void testGetIdLabel()
   {
       Label label = new LabelAOP("Roquefort");
       assert label.getIdLabel() == 1000;
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
