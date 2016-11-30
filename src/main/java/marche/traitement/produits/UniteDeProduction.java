package marche.traitement.produits;


public abstract class UniteDeProduction {

    /**
     * capacité de production (en nombre de lots vendable, exemple pour le lait: 1 = 3l de lait)
     */
    private int capaciteProduction;

    //TODO Ajouter la liste des fermiers proprietaires

    /**
     * Constructeur par défault
     */
    public UniteDeProduction () {
        capaciteProduction = 100;
        //TODO initialiser liste des proprio
    }

    public abstract ProduitFermier creerProduitFermier();
}
