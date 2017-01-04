package marche.traitement.cotisation;

import marche.traitement.participant.Arboriculteur;
import marche.traitement.participant.ProducteurDeViande;
import org.junit.Test;

public class CotisationTest {

    @Test
    /**
     * Test du calcul du montant de la cotisation pour un producteur de viande
     */
    public void testCalculMontantCotisationProducteurDeViande()
    {
        ProducteurDeViande producteurDeViande = new ProducteurDeViande(null,null,150.0);
        double cotisationAPayer = producteurDeViande.payerCotisation(new CotisationGenerale());
        assert cotisationAPayer == 3.0;
    }


    @Test
    /**
     *  Test du calcul du montant de la cotisation pour un arboculteur
     */
    public void testCalculMontantCotisationArboriculteur()
    {
        Arboriculteur arboriculteur = new Arboriculteur(null,null,200.0);
        double cotisationAPayer = arboriculteur.payerCotisation(new CotisationGenerale());
        assert cotisationAPayer == 10.0;
    }
}