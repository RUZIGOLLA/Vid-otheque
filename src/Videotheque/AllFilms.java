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

    public void getFilmBySupport() {

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
               film.ToString();

        }
    }
    public void researchFilm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ecrivez le nom du film");
        String nom = sc.nextLine();

        boolean filmFound = false;

        for(Film film : listeFilm) {
            if (film.Nom.contains(nom)) {
                film.ToString();
                filmFound = true;
            }
        }

        if (!filmFound)
            System.out.println("Aucun film de ce nom n'a été trouvé");
    }


    public void GetFilmDispo(Boolean bool) {
        for (Film film : listeFilm) {
            if (film.isLouer == bool) {
                film.ToString();
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
