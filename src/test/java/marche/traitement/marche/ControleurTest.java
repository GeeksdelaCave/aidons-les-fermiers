package marche.traitement.marche;

import marche.traitement.participant.*;
import marche.traitement.production.Etable;
import marche.traitement.production.UniteDeProduction;
import marche.traitement.produits.ProduitFermier;
import marche.traitement.produits.Vache;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Tests unitaires pour la classe Controleur
 *
 * @author Romain COLONNA D'ISTRIA
 *
 * @see Controleur
 *
 * @version 1.0
 */
public class ControleurTest {

    @Test
    public void testChoisirActeur() {

    }

    @Test
    public void testTransfererBiens_InventaireAcheteurCredite() {

        ArrayList<ProduitFermier> inventaire = new ArrayList<ProduitFermier>();
        ArrayList<UniteDeProduction> udp = new ArrayList<UniteDeProduction>();

        Etable etable = new Etable(10, "PACA");
        Vache vache = new Vache(150.0f, LocalDate.of(2100, Month.NOVEMBER,28), (short) 55, "vachetest",50.0f, etable);

        udp.add(etable);
        inventaire.add(vache);

        Vendeur vendeur = new Vendeur(new Horticulteur(inventaire, udp, 1000f));
        Acheteur acheteur = new Acheteur(new Grossiste());

        Offre offre = new Offre(1000, inventaire, vendeur);

        MarcheBasique mb = new MarcheBasique();

        Controleur.transfererBiens(acheteur, vendeur, offre, mb);

        assertTrue(acheteur.getInventaire() == inventaire);
    }
}