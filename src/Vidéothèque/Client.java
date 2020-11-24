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

    public boolean louer(Film film) {
        if (this.films.length < this.limitFilms) {
            this.film = push(this.films, film);
            return true;
        } else {
            return false;
        }
    }

    public Film[] getFilms() {
        return this.films;
    }
}
