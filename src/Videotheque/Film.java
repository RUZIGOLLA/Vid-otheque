package Videotheque;
import java.util.*;

public class Film {
    public String Nom;
    public String Acteur;
    public Date AnneeSortie;
    public String Real;
    public Film() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle est le nom du film? ");
        Nom = sc.nextLine();
        System.out.println("Quelle est le nom de l'acteur principal? ");
        Acteur = sc.nextLine();
        System.out.println("Le film " + this.Nom + " à bien été crée");
    }
}
