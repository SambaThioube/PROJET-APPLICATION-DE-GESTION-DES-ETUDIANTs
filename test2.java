import java.util.ArrayList;
public class test2 {
    public static void main(String[] args) {
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("P303797","AIDARA","CHEIKH",new Filiere("GENIE INFO"),new Classe("ING1")));
        etudiants.add(new Etudiant("P303897","BOCOUM","ADAMA",new Filiere("GENIE INFO"),new Classe("ING1")));
        etudiants.add(new Etudiant("P303997","DIALLO","ALPHA",new Filiere("GENIE INFO"),new Classe("ING1")));
        etudiants.add(new Etudiant("P304097","THIOUBE","SAMBA",new Filiere("GENIE INFO"),new Classe("ING1")));
        etudiants.add(new Etudiant("P304197","SARR","MARCELLE",new Filiere("GENIE INFO"),new Classe("ING1")));
        etudiants.add(new Etudiant("P304297","THIAM","KHADIM",new Filiere("GENIE INFO"),new Classe("ING1")));
        etudiants.add(new Etudiant("P304397","BA","ABOUBACKRY",new Filiere("GENIE INFO"),new Classe("ING1")));
        etudiants.add(new Etudiant("P304497","DIALLO","CHERIF",new Filiere("GENIE INFO"),new Classe("ING1")));
        etudiants.add(new Etudiant("P304597","DIEYE","ARMAND",new Filiere("GENIE INFO"),new Classe("ING1")));
        etudiants.add(new Etudiant("P304697","FELIX","MOHAMED",new Filiere("GENIE INFO"),new Classe("ING1")));
        etudiants.add(new Etudiant("P304797","FALL","AWA",new Filiere("GENIE INFO"),new Classe("ING1")));
        etudiants.add(new Etudiant("P304897","GUEYE","FATIME",new Filiere("GENIE INFO"),new Classe("ING1")));
        etudiants.add(new Etudiant("P304997","THIAM","NGONE",new Filiere("GENIE INFO"),new Classe("ING1")));
        etudiants.add(new Etudiant("P305097","DIENE","AIDA",new Filiere("GENIE INFO"),new Classe("ING1")));
        etudiants.add(new Etudiant("P305197","DIALLO","BINETA",new Filiere("GENIE INFO"),new Classe("ING1")));
        etudiants.add(new Etudiant("P305297","SALEH","YOUHANIDOU",new Filiere("GENIE INFO"),new Classe("ING1")));
        ListeEtudiant listeEtudiant = new ListeEtudiant("L3","GENIE INFO",etudiants);
    }
}