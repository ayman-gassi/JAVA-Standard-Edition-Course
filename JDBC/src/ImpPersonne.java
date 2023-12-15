import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ImpPersonne implements  IPersonne{
    Connection con = Connect.getCon();
    @Override
    public void addPersonne(Personne P) {

    }

    @Override
    public void updatePersonne(Personne p) {

    }

    @Override
    public Personne getPersonne(int indice) {
        Personne p = null;
        String req = "SELECT * FROM personne WHERE id= ?";
        try {
                PreparedStatement ps = con.prepareStatement(req);
                ps.setInt(1,indice);
                ResultSet res = ps.executeQuery();
                if (res.next()){
                     p = new Personne(indice,res.getString("nom"),res.getString("prenom"));
                }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return p;
    }

    @Override
    public List<Personne> getPersonne() {
        return null;
    }
}
