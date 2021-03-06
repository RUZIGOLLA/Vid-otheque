package Videotheque;
import java.util.*;

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String mail;
    private Integer limitFilms;
    private ArrayList<Film> films = new ArrayList<Film>();

    public Client() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est votre prénom ? ");
        this.prenom = sc.nextLine();
        System.out.println("Quel est votre nom de famille ? ");
        this.nom = sc.nextLine();
        System.out.println("Quel est votre adresse ? ");
        this.adresse = sc.nextLine();
        System.out.println("Quel est votre adresse email ? ");
        this.mail = sc.nextLine();


        this.limitFilms = 5;
    }

    public boolean louer(Film film) {
        if (this.films.size() < this.limitFilms) {
            this.films.add(film);
            film.isLouer = true;
            return true;
        } else {
            return false;
        }
    }

    public String getName() { return this.nom; }

    public List<Film> getFilms() {
        return this.films;
    }

    public String toString() {
        String result = "Client : " + nom + " " + prenom;
        return result;
    }
}
