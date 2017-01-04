package marche.traitement.marche;

import marche.traitement.participant.*;
import marche.traitement.production.EnclosCochon;
import marche.traitement.production.UniteDeProduction;
import marche.traitement.produits.Cochon;
import marche.traitement.produits.ProduitFermier;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/** Tests unitaires de la classe Controleur
 *
 * @author Romain COLONNA D'ISTRIA
 *
 * @see Controleur
 */
public class ControleurTest {

    @Test
    public void testTransfererBiens() {
        ArrayList<ProduitFermier> pf = new ArrayList<ProduitFermier>();
        ArrayList<UniteDeProduction> udp = new ArrayList<UniteDeProduction>();

        ArrayList<ProduitFermier> pf2 = new ArrayList<ProduitFermier>();
        ArrayList<ProduitFermier> pf3 = new ArrayList<ProduitFermier>();

        EnclosCochon ec = new EnclosCochon(10, "PACA");
        udp.add(ec);

        Cochon c = new Cochon(150.0f, LocalDate.of(2100, Month.NOVEMBER, 28), (short) 55, 5.0f, "Cochondelait", ec);
        pf.add(c);
        pf3.add(c);

        Acheteur acheteur = new Acheteur(new Horticulteur(pf2, udp, 100000000));
        acheteur.setDenomination("Colonna", "Romain");

        Vendeur vendeur = new Vendeur(new ProducteurDeViande(pf, null, 123456));
        vendeur.setDenomination("Abdel", "Jean");

        for (ProduitFermier p : acheteur.getInventaire())
            System.out.println("1"+p);
        for (ProduitFermier p : vendeur.getInventaire())
            System.out.println("2"+p);

        Offre offre = new Offre(1000, vendeur.getInventaire(), vendeur);

        MarcheBasique marche = new MarcheBasique("Bazard");

        Controleur.transfererBiens(acheteur, vendeur, offre, marche);

        for (ProduitFermier p : acheteur.getInventaire())
            System.out.println("3"+p);
        for (ProduitFermier p : vendeur.getInventaire())
            System.out.println("4"+p);
        assert (acheteur.getInventaire() == vendeur.getInventaire());
    }

}
