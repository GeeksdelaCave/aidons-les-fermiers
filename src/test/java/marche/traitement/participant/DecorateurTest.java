package marche.traitement.participant;

/**
 * @author Nicolas Guigou
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecorateurTest {

    @Test
    /**
     * Test de création d'un Horticulteur pouvant vendre des produits
     */
    public void TestDecorateur(){
        Acteur vendeur_test = new Vendeur(new Horticulteur(null,null,0));
    }
}
