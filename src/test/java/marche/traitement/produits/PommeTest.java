package marche.traitement.produits;

import marche.traitement.production.Verger;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 * PommeTest désigne le test unitaire effectué sur la classe Pomme sur tous ces getter() crées
 *
 * @author Romain COLONNA D'ISTRIA
 * @version 1.6
 */
public class PommeTest {

    Pomme pommeNonPerime = new Pomme(20.0f,LocalDate.of(2100, Month.NOVEMBER,28), (short) 55,  6.0f, "Reinette",8, new Verger(50,"Normandie"));
    Pomme pommePerime    = new Pomme(20.0f,LocalDate.of(2000, Month.NOVEMBER,28), (short) 55,  6.0f, "Reinette",8, new Verger(50,"Normandie"));

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
     * Teste le poids de la cagette
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
}
