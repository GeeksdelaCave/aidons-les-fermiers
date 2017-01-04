package marche.traitement.marche;

import marche.traitement.participant.*;
import marche.traitement.production.UniteDeProduction;
import marche.traitement.produits.ProduitFermier;
import marche.traitement.exceptions.SoldeNonDisponibleException;
import marche.traitement.production.EnclosCochon;
import marche.traitement.produits.Cochon;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

import static org.junit.Assert.*;

/** Tests unitaires de la classe Controleur
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Tristan DIETZ
 * @author Nicolas GUIGOU
 *
 * @version 1.3
 * @see Controleur
 */
public class ControleurTest {

    ArrayList<ProduitFermier> pf = new ArrayList<ProduitFermier>();
    ArrayList<UniteDeProduction> udp = new ArrayList<UniteDeProduction>();

    ArrayList<ProduitFermier> pf2 = new ArrayList<ProduitFermier>();

    EnclosCochon ec = new EnclosCochon(10, "PACA");
    Cochon c = new Cochon(150.0f, LocalDate.of(2100, Month.NOVEMBER, 28), (short) 55, 5.0f, "Cochondelait", ec);

    Acheteur acheteur = new Acheteur(new Horticulteur(pf2, udp, 1000));
    Vendeur vendeur = new Vendeur(new ProducteurDeViande(pf, null, 1000));

    MarcheBasique marche = new MarcheBasique("Bazard");

    @Test
    public void testChoisirAcheteur_PremierDeLaListe() {
        Acheteur acheteur2 = new Acheteur(new Horticulteur(pf2, udp, 1000));

        udp.add(ec);
        pf.add(c);

        acheteur.setDenomination("Colonna", "Romain");
        vendeur.setDenomination("Abdel", "Jean");

        Offre offre = new Offre(1000, vendeur.getInventaire(), vendeur);

        acheteur.proposerOffreAchat(offre);
        acheteur2.proposerOffreAchat(offre);

        assertSame(Controleur.choisirAcheteur(offre, 0), acheteur);
    }


    @Test
    public void testTransfererBiens() {
        udp.add(ec);
        pf.add(c);

        acheteur.setDenomination("Colonna", "Romain");
        vendeur.setDenomination("Abdel", "Jean");

        Offre offre = new Offre(1000, vendeur.getInventaire(), vendeur);

        Controleur.transfererBiens(acheteur, vendeur, offre, marche);

        assertEquals(acheteur.getInventaire(), vendeur.getInventaire());
    }

    @Test
    public void testCrediterSomme() {
        udp.add(ec);
        pf.add(c);

        acheteur.setDenomination("Colonna", "Romain");
        vendeur.setDenomination("Abdel", "Jean");

        Offre offre = new Offre(1000, vendeur.getInventaire(), vendeur);

        try {
            Controleur.crediterSomme(acheteur, vendeur, offre);
        } catch (SoldeNonDisponibleException e) {
            e.printStackTrace();
        }

        assertTrue(vendeur.getSolde() == 2000);
    }

    @Test
    public void testRegulerPrix() {
        udp.add(ec);
        pf.add(c);

        Offre offre = new Offre(1000000, vendeur.getInventaire(), vendeur);

        acheteur.setDenomination("Colonna", "Romain");
        vendeur.setDenomination("Abdel", "Jean");

        Controleur.regulerPrix(offre);

        assertTrue(offre.getPrix() == 54);
    }

    @Test
    public void testAjouterOffre() {
        udp.add(ec);
        pf.add(c);

        Offre offre = new Offre(1000000, vendeur.getInventaire(), vendeur);

        acheteur.setDenomination("Colonna", "Romain");
        vendeur.setDenomination("Abdel", "Jean");

        marche.ajouterOffre(offre);

        assertTrue(marche.getCatalogue().contains(offre));
    }

    @Test
    public void testValider_OffreValide() {
        udp.add(ec);
        pf.add(c);

        Offre offre = new Offre(45, vendeur.getInventaire(), vendeur);

        acheteur.setDenomination("Colonna", "Romain");
        vendeur.setDenomination("Abdel", "Jean");

        assertTrue(Controleur.valider(offre));
    }

    @Test
    public void testValider_OffreNonValide() {
        Cochon c2 = new Cochon(150.0f, LocalDate.of(2100, Month.NOVEMBER, 28), (short) 12, 5.0f, "Cochondelait", ec);
        udp.add(ec);
        pf.add(c2);

        Offre offre = new Offre(45, vendeur.getInventaire(), vendeur);

        acheteur.setDenomination("Colonna", "Romain");
        vendeur.setDenomination("Abdel", "Jean");

        assertFalse(Controleur.valider(offre));
    }

    @Test
    public void testCalculerPrixMoyen() {
        Cochon c2 = new Cochon(150.0f, LocalDate.of(2100, Month.NOVEMBER, 28), (short) 55, 5.0f, "Cochondelait", ec);
        Cochon c3 = new Cochon(150.0f, LocalDate.of(2100, Month.NOVEMBER, 28), (short) 55, 5.0f, "Cochondelait", ec);
        udp.add(ec);
        pf.add(c);
        pf.add(c2);
        pf.add(c3);

        Offre offre = new Offre(1000000, vendeur.getInventaire(), vendeur);

        acheteur.setDenomination("Colonna", "Romain");
        vendeur.setDenomination("Abdel", "Jean");

        assertTrue(Controleur.calculerPrixMoyen(offre) == 135);
    }
}
