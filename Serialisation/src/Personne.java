import java.io.IOException;
import java.io.Serializable;

public class Personne implements Serializable {
    static private final long serialVersionUID = 6L;
    private String nom;
    private String prenom;
    Personne(String nom,String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    @Override
    public String toString (){
        return "nom : "+ nom + " prenom : " + prenom;
    }
}
