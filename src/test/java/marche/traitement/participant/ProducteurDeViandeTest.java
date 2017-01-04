package marche.traitement.participant;

import marche.traitement.cotisation.CotisationGenerale;
import marche.traitement.production.UniteDeProduction;
import marche.traitement.produits.ProduitFermier;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Tests unitaire de la classe ProducteurDeViande
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Thibaud CENENT
 *
 * @see ProducteurDeViande
 */
public class ProducteurDeViandeTest {

    /**
     * Test du nouveau solde du producteur de viande après prélévement de la cotisation
     */
    @Test
    public void testPayerCotisation_SoldeDebite() {
        ArrayList<ProduitFermier> pf = new ArrayList<ProduitFermier>();
        ArrayList<UniteDeProduction> udp = new ArrayList<UniteDeProduction>();

        ProducteurDeViande producteurDeViande = new ProducteurDeViande(pf,udp,150.0);

        producteurDeViande.payerCotisation(new CotisationGenerale());

        System.out.println(producteurDeViande.getSolde());

        assertTrue(producteurDeViande.getSolde() == 147.0);
    }
}
