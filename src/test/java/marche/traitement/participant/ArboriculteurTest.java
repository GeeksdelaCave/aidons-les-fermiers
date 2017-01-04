package marche.traitement.participant;

import marche.traitement.cotisation.CotisationGenerale;
import marche.traitement.exceptions.SoldeNonDisponibleException;
import marche.traitement.production.UniteDeProduction;
import marche.traitement.produits.ProduitFermier;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Tests unitaire de la classe Arboriculteur
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Thibaud CENENT
 *
 * @see Arboriculteur
 */
public class ArboriculteurTest {

    /**
     * Test du nouveau solde de l'arboriculteur après prélévement de la cotisation
     */
    @Test
    public void testPayerCotisation_SoldeDebite() {
        ArrayList<ProduitFermier> pf = new ArrayList<ProduitFermier>();
        ArrayList<UniteDeProduction> udp = new ArrayList<UniteDeProduction>();

        Arboriculteur arboriculteur = new Arboriculteur(pf,udp,150.0);

        arboriculteur.payerCotisation(new CotisationGenerale());

        assertTrue(arboriculteur.getSolde() == 142.5);
    }
}
