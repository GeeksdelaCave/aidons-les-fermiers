package marche.traitement.participant;

/** Tests unitaire de la classe Decorateur
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Nicolas Guigou
 *
 * @see Decorateur
 *
 * @version 1.0
 */

import marche.traitement.exceptions.SoldeNonDisponibleException;
import marche.traitement.marche.MarcheBasique;
import marche.traitement.marche.Offre;
import marche.traitement.production.EnclosCochon;
import marche.traitement.production.UniteDeProduction;
import marche.traitement.produits.Cochon;
import marche.traitement.produits.ProduitFermier;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DecorateurTest {

    @Test
    /**
     * Test d'ajout du montant de l'offre vendu et de retrait du montant de l'offre achetée
     */
    public void TestAjouterSoldeEtEnleverSolde() {
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

        try {
            acheteur.enleverSolde(offre.getPrix());
        } catch (SoldeNonDisponibleException e) {
            e.printStackTrace();
        }

        vendeur.ajouterSolde(offre.getPrix());

        assertTrue(acheteur.getSolde() == 0 && vendeur.getSolde() == 2000);
    }

}
