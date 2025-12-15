class Personne {
    private String nom;
    private String prenom;
    private int age;
    private String ville;

    public Personne(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }

    public Personne(String nom, int age, String ville) {
        this.nom = nom;
        this.age = age;
        this.ville = ville;
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public int getAge() { return age; }
    public String getVille() { return ville; }

    @Override
    public String toString() {
        return nom + " " + prenom + " (" + age + ")";
    }
}
