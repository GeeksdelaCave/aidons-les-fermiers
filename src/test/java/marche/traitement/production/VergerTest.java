package marche.traitement.production;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

/**
 * Classe VergerTest gérant les test unitaires effectués sur la classe Verger
 * @version 1.0
 */
public class VergerTest {

    /**
     * Teste de créer des cagettes de pommes et vérifie leurs identifiants
     */
    @Test
    public void testCreerCagettePomme()
    {
        Verger verger = new Verger(500,"Normandie");
        assertTrue(verger.creerCagette(15.0f,LocalDate.of(2016,12,6),(short) 55.0,2.0f,"Reinette",8).getIdCagette() == 1000);
        assertTrue(verger.creerCagette(15.0f,LocalDate.of(2016,12,6),(short) 60.0,3.0f,"Granit",8).getIdCagette() == 1100);

    }
}
