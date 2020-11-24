package Vidéothèque;

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String mail;
    private Integer limitFilms;
    private Film[] films;

    public Client(String nom, String prenom, String adresse, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.limitFilms = 5;
    }

    public void Louer(Film film) {

    }
}
