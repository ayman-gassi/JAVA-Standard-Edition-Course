package gestionEleves;
import java.util.ArrayList;
import java.util.Iterator;


public class Eleve implements Comparable<Eleve> {
    String nom;
    ArrayList<Integer> notes = new ArrayList<Integer>();
    double moyenne = 0;
    public Eleve(String nom){
        this.nom = nom;
    }

    public double getMoyenne() {
        return moyenne;
    }
    public void ajouterNote(int Note){

        notes.add(Note);
        double sum = 0;
        Iterator<Integer> it = notes.iterator();
        while (it.hasNext()) {
            sum += it.next();
        }
        moyenne = sum / notes.size();
    }

    public String getNom() {
        return nom;
    }
    public ArrayList<Integer> getListesNotes(){
        return notes;
    }
    @Override
    public String toString(){
        return (
                "nom : " + nom + " moyenne : " + moyenne + "note " + getListesNotes()
                );
    }

    @Override
    public int compareTo(Eleve o) {
       return Double.compare(this.moyenne, o.moyenne);
    }
}
