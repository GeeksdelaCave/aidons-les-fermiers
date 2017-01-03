package marche.traitement.produits;

import marche.traitement.exceptions.ProduitPerimeException;
import marche.traitement.production.Verger;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
/**
 * PommeTest désigne le test unitaire effectué sur la classe Pomme sur tous ces getter() crées
 *
 * @author Romain COLONNA D'ISTRIA
 * @version 1.7
 */
public class PommeTest {

    Verger verger = new Verger(50,"Normandie");
    Pomme pommeNonPerime = new Pomme(20.0f, LocalDate.of(2100, Month.NOVEMBER,28), (short) 55,  6.0f, "Reinette",8, verger);
    Pomme pommePerime    = new Pomme(20.0f, LocalDate.of(2000, Month.NOVEMBER,28), (short) 55,  6.0f, "Reinette",8, verger);

    /**
     * Teste l'identifiant de la cagette de pomme.
     * La première condition sert pour quand le test est lancé seul, la seconde
     * pour quand tout les tests sont lancés ensembles.
     */
    @Test
    public void testGetIdCagette() {
        assertTrue(pommeNonPerime.getIdCagette() == 1000 || pommeNonPerime.getIdCagette() == 1700); //Car 7 autres pomme instanciées avant
    }

    /**
     * Teste le poids de la cagette de pommme
     */
    @Test
    public void testGetPoidsCagette() {
        assertTrue(pommeNonPerime.getPoidsCagette() == 6.0f);
    }

    /**
     * Teste le type de pomme
     */
    @Test
    public void testGetTypePomme() {
        assertTrue(pommeNonPerime.getTypePomme().equals("Reinette"));
    }

    /**
     * Teste le nbre de pommes dans une cagette
     */
    @Test
    public void testGetNbPommes() {
        assertTrue(pommeNonPerime.getNbPommes() == 8);
    }

    /**
     * Test la date de péremption d'une cagette de pomme
     */
    @Test
    public void testGetDatePeremption() {
        assertEquals(LocalDate.of(2100, Month.NOVEMBER,28), pommeNonPerime.getDatePeremption());
    }

    /**
     * Test de l'exception ProduitPerimeException lors de l'accès a la date de péremption
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetDatePeremption_ProduitPerimeException() {
        assertEquals(LocalDate.of(2000, Month.NOVEMBER,28), pommePerime.getDatePeremption());
    }

    /**
     * Test de la valeur de la qualité d'une cagette de pomme
     */
    @Test
    public void testGetQualite() {
        assertTrue(pommeNonPerime.getQualite() == (short) 55);
    }

    /**
     * Test l'unité de production d'une cagette de pomme
     */
    @Test
    public void testGetUniteDeProduction() {
        assertSame(verger, pommeNonPerime.getUniteDeProduction());
    }

    /**
     * Teste si la cagette de pomme est commercialisable
     */
    @Test
    public void testGetIsCommercialise() {
        assertTrue(pommeNonPerime.isCommercialisable());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de la vérification pour la commercialisation
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetIsCommercialise_ProduitPerimeException() throws ProduitPerimeException {
        assertTrue(pommePerime.isCommercialisable());
    }
}