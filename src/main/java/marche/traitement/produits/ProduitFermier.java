package marche.traitement.produits;

import marche.traitement.exceptions.ProduitPerimeException;
import marche.traitement.label.*;
import marche.traitement.participant.Fermier;
import marche.traitement.production.UniteDeProduction;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 *Classe abstraite ProduitFermier représentant une idée d'un produit fermier
 *@author Thibaud CENENT
 * @version 2.2
 */
public abstract class ProduitFermier {

    /**
     * Map qui associe le type d'un produit à une région particulière pour l'attribution des labels. Elle n'est pas modifiable
     * @see ProduitFermier#validerLabel()
     */
    private static final HashMap<String, String> associationProduitRegion = new HashMap<String, String>() {{
       put("Pomme", "Bretagne");
       put("Fromage", "Normandie");
       put("Lait", "Aquitaine");
       put("Miel", "Occitanie");
       put("Oeuf", "Auvergne");
       put("Vache", "PACA");
       put("Cochon", "Corse");
    }};

    /**
     * Fermier propriétaire d'un produit fermier. Il n'est pas modifiable.
     */
    protected Fermier proprietaire;

    /**
     * le prix du produit.Il n'est pas modifiable
     *
     * @see ProduitFermier#getPrix()
     */
    protected float prix;

    /**
     * La date de peremption du produit. Elle n'est pas modifiable
     *
     * @see ProduitFermier#getDatePeremption()
     */
    protected LocalDate datePeremption;

    /**
     * La qualité du produit sur une échelle de 1 à 100.Elle n'est pas modifiable.
     *
     * @see ProduitFermier#getQualite()
     * @see ProduitFermier#isCommercialisable()
     */
    protected short qualite;

    /**
     * Unité de production qui est propre à un produit fermier. Elle n'est pas modifiable
     * @see ProduitFermier#getUniteDeProduction()
     */
    protected UniteDeProduction uniteDeProduction;

    /**
     * Labels qu'un produit fermier peut avoir. Non modifiable.
     */
    protected ArrayList<Label> labels;

    /** Retourne le prix du produit
     *
     * @return le prix du produit
     */
    public float getPrix(){

        return prix;
    }

    /** Retourne la date de peremption
     *
     * @return la date de peremption
     */
    public LocalDate getDatePeremption() throws ProduitPerimeException {
        if (datePeremption.isAfter(LocalDate.now()))
            return datePeremption;
        else
            throw new ProduitPerimeException();
    }

    /** Retourne la qualité du produit
     *
     * @return la qualité du produit
     */
    public short getQualite() {

        return qualite;
    }

    /** Retourne si le produit est commercialisable ou pas
     *
     * @return si le produit est commercialisable ou pas
     */
    public boolean isCommercialisable() {
        return this.getQualite() >= 30 && this.getDatePeremption().isAfter(LocalDate.now());
    }

    /** Retourne l'unité de production associé à un produit fermier
     *
     * @return l'unité de production associé à un produit fermier
     */
    public UniteDeProduction getUniteDeProduction() {

        return uniteDeProduction;
    }

    /**
     * Valider le choix d'un label en fonction des caractéristiques du produit fermier.
     */
    public void validerLabel() {
        if(this.isCommercialisable()) {
            if (associationProduitRegion.get(this.getClass().getCanonicalName()) == this.getUniteDeProduction().getRegionCreationProduit()) {
                // On lui ajoute ces deux labels en même temps car ils concernent la même situation d'attribution

                //this.ajouterLabel(new LabelAOC(idLabelAttribue, this.getUniteDeProduction().getRegionCreationProduit(), this.isCommercialisable()));
                //this.ajouterLabel(new LabelAOP(idLabelAttribue, this.getUniteDeProduction().getRegionCreationProduit()));
            }
            if (this.getQualite() > 70) {

                //this.ajouterLabel(new LabelRouge(idLabelAttribue, true));
                // this.ajouterLabel(new LabelIGP(idLabelAttribue, this.getUniteDeProduction().getRegionCreationProduit())); // Ce label n'est attribué que si on a attribué un label rouge avant
            }
        }

    }

    /** Retourne le propriétaire actuel du produit fermier
     *
     * @return le propriétaite actuel du produit fermier
     */
    public Fermier getProprietaire() {

        return proprietaire;
    }

    /** Met à jour le propriétaire courant à chaque vente d'un produit fermier
     *
     * @param proprietaire désignant le propriétaire courant d'un produit fermier
     */
    public void setProprietaire(Fermier proprietaire) {

        this.proprietaire = proprietaire;
    }

    /** Ajoute un label à un produit fermier
     *
     * @param label désigne le label qu'on va ajouter à un produit fermier
     */
    public void ajouterLabel(Label label) {

        labels.add(label);
    }

    /** Retourne les labels d'un produit fermier
     *
     * @return les labels d'un produit fermier.
     */
    public ArrayList<Label> getLabels() {
        return labels;
    }

    /**
     * Affiche les labels d'un produit fermier
     */
    public void displayLabels() {
        for(Label label : getLabels())
            System.out.println(label.toString());
    }
}
