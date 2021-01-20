import java.util.ArrayList;
import java.util.List;

public class Filiere {
    private String nom;
    private List<Classe> classes;

    public Filiere() {
    }

    public Filiere(String nom) {
        this.nom = nom;
        this.classes = new ArrayList<>();
        this.classes.add(new Classe("L1"));
        this.classes.add(new Classe("L2"));
        this.classes.add(new Classe("L3"));
        this.classes.add(new Classe("M1"));
        this.classes.add(new Classe("M2"));
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Filiere{" +
                "nom='" + nom + '\'' +
                ", classes=" + classes +
                '}';
    }
}

