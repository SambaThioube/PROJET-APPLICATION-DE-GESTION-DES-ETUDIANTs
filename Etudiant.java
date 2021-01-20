public class Etudiant {
    private String numeroCarte;
    private String nom;
    private String prenom;
    private Filiere filiere;
    private Classe classe;

    public Etudiant() {
    }

    public Etudiant(String numeroCarte, String nom, String prenom, Filiere filiere, Classe classe) {
        this.numeroCarte = numeroCarte;
        this.nom = nom;
        this.prenom = prenom;
        this.filiere = filiere;
        this.classe = classe;
    }

    public String getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "numeroCarte='" + numeroCarte + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", filiere=" + filiere +
                ", classe=" + classe +
                '}';
    }

}
