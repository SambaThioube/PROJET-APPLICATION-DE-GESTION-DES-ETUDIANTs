import java.util.ArrayList;
public class test1 {
    public static void main(String[] args) {
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("P303797","NIANG","MODOU",new Filiere("CPI2"),new Classe("L2")));
        etudiants.add(new Etudiant("P303897","MBAYE","AWA",new Filiere("CPI2"),new Classe("L2")));
        etudiants.add(new Etudiant("P303997","DIALLO","ASSANE",new Filiere("CPI2"),new Classe("L2")));
        ListeEtudiant listeEtudiant = new ListeEtudiant("L2","CPI2",etudiants);
    }
}
