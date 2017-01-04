package marche.traitement.marche;

import marche.traitement.participant.Acheteur;
import marche.traitement.participant.Horticulteur;
import marche.traitement.participant.ProducteurDeViande;
import marche.traitement.participant.Vendeur;
import marche.traitement.production.Ruche;
import marche.traitement.production.UniteDeProduction;
import marche.traitement.produits.Miel;
import marche.traitement.produits.ProduitFermier;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Tests unitaire de la classe MarcheBasique.
 *
 * @author Romain COLONNA D'ISTRIA
 *
 * @see Marche
 *
 * @version 1.0
 */
public class MarcherBasiqueTest {

    @Test
    public void testAjouterOffre() {
        ArrayList<ProduitFermier> pf = new ArrayList<ProduitFermier>();
        ArrayList<ProduitFermier> pf2 = new ArrayList<ProduitFermier>();

        ArrayList<UniteDeProduction> udp = new ArrayList<UniteDeProduction>();

        Ruche ruche = new Ruche(100, "PACA");
        Miel miel = new Miel(40, LocalDate.of(2100, Month.NOVEMBER, 28), (short) 89, 1, "abeilles", ruche);

        udp.add(ruche);
        pf.add(miel);

        Acheteur acheteur = new Acheteur(new Horticulteur(pf, udp, 1000));
        Vendeur vendeur = new Vendeur(new ProducteurDeViande(pf2, null, 1000));

        Offre offre = new Offre(40, pf, vendeur);

        Marche.getMarcheInstance().ajouterOffre(offre);

        assertTrue(Marche.getMarcheInstance().getCatalogue().contains(offre));
    }

    @Test
    public void testEnleverOffre() {
        for (Offre offre : Marche.getMarcheInstance().getCatalogue())
            Marche.getMarcheInstance().enleverOffre(offre);

        ArrayList<ProduitFermier> pf = new ArrayList<ProduitFermier>();
        ArrayList<ProduitFermier> pf2 = new ArrayList<ProduitFermier>();

        ArrayList<UniteDeProduction> udp = new ArrayList<UniteDeProduction>();

        Ruche ruche = new Ruche(100, "PACA");
        Miel miel = new Miel(40, LocalDate.of(2100, Month.NOVEMBER, 28), (short) 89, 1, "abeilles", ruche);

        udp.add(ruche);
        pf.add(miel);

        Acheteur acheteur = new Acheteur(new Horticulteur(pf, udp, 1000));
        Vendeur vendeur = new Vendeur(new ProducteurDeViande(pf2, null, 1000));

        Offre offre = new Offre(40, pf, vendeur);


        Marche.getMarcheInstance().ajouterOffre(offre);
        Marche.getMarcheInstance().enleverOffre(offre);

        assertTrue(Marche.getMarcheInstance().getCatalogue().isEmpty());
    }

}
