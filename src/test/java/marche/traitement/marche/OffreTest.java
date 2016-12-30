package marche.traitement.marche;

import org.junit.Test;

/**
 * Batterie de tests relatifs aux offres.
 *
 * @author Tristan Dietz
 *
 * @version 1.0
 *
 * @see Offre
 */
public class OffreTest {

    @Test
    /**
     * Test de la bonne incrémentation du numéro de l'offre
     */
    public void testIncrementationOffres() {
        Offre offre1 = new Offre(10, null);
        Offre offre2 = new Offre(40, null);

        assert offre1.getIDOffre() != offre2.getIDOffre();
    }

}
