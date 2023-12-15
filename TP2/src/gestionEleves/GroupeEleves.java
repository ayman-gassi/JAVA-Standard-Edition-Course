package gestionEleves;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class GroupeEleves {
    private ArrayList<Eleve> listEleves = new ArrayList<Eleve>();
    public int nombre(){
        return listEleves.size();
    }
    public void ajouterEleve(Eleve eleve){
        listEleves.add(eleve);
    }
    public Eleve chercher(String nom){
        Iterator<Eleve> it = listEleves.iterator();
        while (it.hasNext()){
            Eleve now = it.next();
            if (now.getNom().equals(nom)){
                return now;
            }
        }
        return null;
    }
    public void lister(){
        Iterator<Eleve> it = listEleves.iterator();
        while (it.hasNext()){
            it.next().toString();
        }
    }
    public void trierEleve(){
        TreeSet<GroupeEleves> tree = new TreeSet<GroupeEleves>();

    }
}
