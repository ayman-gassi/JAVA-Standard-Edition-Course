import gestionEleves.*;
public class Main {
    public static void main(String[] args) {
        Eleve eleve1 = new Eleve("Alice");
        Eleve eleve2 = new Eleve("Bob");
        Eleve eleve3 = new Eleve("Charlie");

        // Ajout de notes aux élèves
        eleve1.ajouterNote(15);
        eleve1.ajouterNote(18);

        eleve2.ajouterNote(12);
        eleve2.ajouterNote(14);
        eleve2.ajouterNote(16);

        eleve3.ajouterNote(10);
        eleve3.ajouterNote(9);

        // Création d'un groupe d'élèves
        GroupeEleves groupe = new GroupeEleves();

        // Ajout des élèves au groupe
        groupe.ajouterEleve(eleve1);
        groupe.ajouterEleve(eleve2);
        groupe.ajouterEleve(eleve3);

        // Affichage de la liste des élèves
        System.out.println("Liste des élèves :");
        groupe.lister();

        // Recherche d'un élève par nom
        String nomRecherche = "Bob";
        Eleve eleveRecherche = groupe.chercher(nomRecherche);
        if (eleveRecherche != null) {
            System.out.println("Élève trouvé : " + eleveRecherche.getNom());
        } else {
            System.out.println("Aucun élève trouvé avec le nom : " + nomRecherche);
        }
    }
}