package marche.traitement.marche;

import marche.traitement.participant.Acheteur;
import marche.traitement.participant.Horticulteur;
import marche.traitement.participant.ProducteurDeViande;
import marche.traitement.participant.Vendeur;
import marche.traitement.production.EnclosCochon;
import marche.traitement.production.UniteDeProduction;
import marche.traitement.produits.Cochon;
import marche.traitement.produits.ProduitFermier;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Tests unitaire de la classe LivreMarcher
 *
 * @author Romain COLONNA D'ISTRIA
 *
 * @see LivreMarche
 *
 * @version 1.0
 */
public class LivreMarcheTest {

    @Test
    public void testAjouterTransaction() {
        ArrayList<ProduitFermier> pf = new ArrayList<ProduitFermier>();
        ArrayList<UniteDeProduction> udp = new ArrayList<UniteDeProduction>();

        ArrayList<ProduitFermier> pf2 = new ArrayList<ProduitFermier>();

        EnclosCochon ec = new EnclosCochon(10, "PACA");
        Cochon c = new Cochon(150.0f, LocalDate.of(2100, Month.NOVEMBER, 28), (short) 55, 5.0f, "Cochondelait", ec);

        udp.add(ec);
        pf.add(c);

        Acheteur acheteur = new Acheteur(new Horticulteur(pf2, udp, 1000));
        acheteur.setDenomination("Colonna", "Romain");
        Vendeur vendeur = new Vendeur(new ProducteurDeViande(pf, null, 1000));
        vendeur.setDenomination("Abdel", "Jean");

        Offre offre = new Offre(1000, vendeur.getInventaire(), vendeur);

        Controleur.transfererBiens(acheteur, vendeur, offre, Marche.getMarcheInstance());

        assertNotNull(LivreMarche.getHistorique());
    }
}
