package material;
public abstract class PieceDetachee {
    String nom;
    double poids;
    double prix;

    public PieceDetachee(String nom, double poids, double prix){
        this.nom = nom;
        this.poids = poids;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }
}
