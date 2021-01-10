package Videotheque;
import java.util.*;
import java.text.*;

public class Film {
    public String Nom;
    public String Acteur;
    public String AnneeSortie;
    public String Real;
    public boolean isLouer;
    public String Type;
    public Film() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quelle est le nom du film? ");
        Nom = sc.nextLine();
        System.out.print("Quelle est le nom de l'acteur principal? ");
        Acteur = sc.nextLine();
        System.out.print("Quelle est le nom du réalisateur ? ");
        Real = sc.nextLine();
        System.out.print("Quelle est l'annee de sortie du film? ");
        AnneeSortie = sc.nextLine();
        setType();
        isLouer = false;
        System.out.println(MessageFormat.format("Le film {0} à bien été crée", Nom));
    }

    public void setType() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quelle est le type de support du film? (veuillez écrire le chiffre correspondant à votre choix");
        System.out.println("1.K7    2.Clé Usb    3.Blue-Ray      4.DVD");
        int i = sc.nextInt();
        switch (i) {
            case 1:
            Type = "K7";
            break;
            case 2:
            Type = "USB";
            break;
            case 3:
            Type = "Blue-Ray";
            break;
            case 4:
            Type = "DVD";
            break;
        }
    }

    public String toString() {
        return MessageFormat.format("Nom: {0}, Acteur: {1}, Année: {2}, Réal.: {3}, Support: {4}", this.Nom, this.Acteur, this.AnneeSortie, this.Real, this.Type);
    }

    public String getName() { return this.Nom; }
}
