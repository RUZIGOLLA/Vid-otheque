package Videotheque;
import java.util.*;

public class AllFilm {
    public List<Film> listeFilm = new ArrayList<Film>();
    public AllFilm() {

    }

    void addFilm() {
        Film film = new Film();
        listeFilm.add(film);
    }

    void getFilmBySupport() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Rechercher des film par support? (veuillez écrire le chiffre correspondant à votre choix");  
        System.out.print("1.K7    2.Clé Usb    3.Blue-Ray      4.DVD");
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
    void researchFilm(String nom) {
        System.out.println("Aucun film de ce nom n'a été trouvé");

        for(Film film : listeFilm) {
            if (film.Nom == nom)
                film.ToString();
        }
        System.out.println("Aucun film de ce nom n'a été trouvé");
    }

    void GetFilmDispo() {
        for (Film film : listeFilm) {
            if (!film.isLouer) {
                film.ToString();
            }
        }
    }
    void deleteFilm(String nom) {
        for(Film film : listeFilm) {
            if (film.Nom == nom)
                listeFilm.remove(film);
        }
    }
}
