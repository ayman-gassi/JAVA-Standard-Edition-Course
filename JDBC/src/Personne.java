public class Personne {
        private int num;
        private String nom;
        private String prenom;
        public Personne(int num, String nom, String prenom){
            this.num = num;
            this.nom = nom;
            this.prenom = prenom;
        }

        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public int getNum() {
            return num;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

    @Override
    public String toString() {
        return "nom : "+ nom + " et prenom : "+ prenom ;
    }
}
