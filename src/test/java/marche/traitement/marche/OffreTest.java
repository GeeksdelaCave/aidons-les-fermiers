package marche.traitement.marche;

import marche.traitement.exceptions.SoldeNonDisponibleException;
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

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 * Batterie de tests relatifs aux offres.
 *
 * @author Tristan Dietz
 * @author Nicolas GUIGOU
 * @author Romain COLONNA D'ISTRIA
 *
 * @version 1.0
 *
 * @see Offre
 */
public class OffreTest {

    /**
     * Test de la bonne incrémentation du numéro de l'offre
     */
    @Test
    public void testIncrementationOffres() {
        Offre offre1 = new Offre(10, null, null);
        Offre offre2 = new Offre(40, null, null);

        assert offre1.getIDOffre() != offre2.getIDOffre();
    }

    /**
     * Test d'achat d'une offre
     */
    @Test
    public void testAchat() {
        ArrayList<ProduitFermier> pf = new ArrayList<ProduitFermier>();
        ArrayList<UniteDeProduction> udp = new ArrayList<UniteDeProduction>();

        ArrayList<ProduitFermier> pf2 = new ArrayList<ProduitFermier>();

        EnclosCochon ec = new EnclosCochon(10, "PACA");
        Cochon c = new Cochon(150.0f, LocalDate.of(2100, Month.NOVEMBER, 28), (short) 55, 5.0f, "Cochondelait", ec);
        pf.add(c);

        Acheteur acheteur = new Acheteur(new Horticulteur(pf2, udp, 1000));
        Vendeur vendeur = new Vendeur(new ProducteurDeViande(pf, null, 1000));

        Offre offre = new Offre(45,pf,vendeur);

        try {
            offre.acheter(acheteur, Marche.getMarcheInstance());
        } catch (SoldeNonDisponibleException e) {
            //TODO faire fenetre exception
        }

        System.out.println();
        assertTrue(acheteur.getInventaire().contains(c));
    }
}
