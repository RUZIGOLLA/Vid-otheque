package Vidéothèque;
import java.util.*;

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String mail;
    private Integer limitFilms;
    private List<Film> films;

    public Client(String nom, String prenom, String adresse, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.limitFilms = 5;
    }

    public boolean louer(Film film) {
        if (this.films.size() < this.limitFilms) {
            this.films.add(film);
            return true;
        } else {
            return false;
        }
    }

    public List<Film> getFilms() {
        return this.films;
    }

    public String toString() {
        String result = "Client : " + nom + " " + prenom;
        return result;
    }
}
