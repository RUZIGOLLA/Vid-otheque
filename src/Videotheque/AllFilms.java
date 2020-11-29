package Videotheque;
import java.util.*;

public class AllFilms {
    public ArrayList<Film> listeFilm = new ArrayList<Film>();
    public AllFilms() {

    }

    public void addFilm() {
        Film film = new Film();
        listeFilm.add(film);
    }

    public ArrayList<Film> getFilmsBySupport() {
        ArrayList<Film> films = new ArrayList<Film>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Rechercher des film par support? (veuillez écrire le chiffre correspondant à votre choix");
        System.out.println("1.K7    2.Clé Usb    3.Blue-Ray      4.DVD");
        int i = sc.nextInt();
        String tmpString;
        switch (i) {
            case 1:
            tmpString = "K7";
            break;
            case 2:
            tmpString = "USB";

            break;
            case 3:
            tmpString = "Blue-Ray";

            break;
            case 4: 
            tmpString = "DVD";
            
            break;
            default: tmpString="";
        }
        for(Film film : listeFilm) {
            if (film.Type == tmpString)
                films.add(film);
        }
        return films;
    }
    public Film searchFilm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ecrivez le nom du film");
        String nom = sc.nextLine();


        for(Film film : listeFilm) {
            if (film.Nom.contains(nom)) {
                return film;
            }
        }
        return null;

    }


    public void GetFilmDispo(Boolean bool) {
        for (Film film : listeFilm) {
            if (film.isLouer == bool) {
                film.toString();
            }
        }
    }
    public void deleteFilm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ecrivez le nom du film a supprimer");
        String nom = sc.nextLine();
        for(Film film : listeFilm) {
            if (film.Nom == nom)
                listeFilm.remove(film);
        }
    }
}
