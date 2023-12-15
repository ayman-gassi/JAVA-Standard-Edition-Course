import java.sql.SQLException;
import java.util.List;

public interface IPersonne {
    void addPersonne(Personne P);
    void updatePersonne(Personne p);
    Personne getPersonne(int indice) throws SQLException;
    List<Personne> getPersonne();
}
