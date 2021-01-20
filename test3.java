import java.util.ArrayList;
    public class test3 {
        public static void main(String[] args) {
            ArrayList<Etudiant> etudiants = new ArrayList<>();
            etudiants.add(new Etudiant("P303797","GUEYE","MODOU",new Filiere("CPI1"),new Classe("L1")));
            etudiants.add(new Etudiant("P303897","MBAYE","AWA",new Filiere("CPI1"),new Classe("L1")));
            etudiants.add(new Etudiant("P303997","DIALLO","ALPHA",new Filiere("CPI1"),new Classe("L1")));
            ListeEtudiant listeEtudiant = new ListeEtudiant("L1","CPI1",etudiants);
        }
    }
