import Vidéothèque.*;
import java.util.*;

public class Main {
    public List<Integer> arrianePath = new ArrayList<>();
    public static void main(String[] args) {
    }
    
    public void initProg() {
            
    }

    static Client addClient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est votre prénom ? ");
        String prenom = sc.nextLine();
        System.out.println("Quel est votre nom de famille ? ");
        String nom = sc.nextLine();
        System.out.println("Quel est votre adresse ? ");
        String adresse = sc.nextLine();
        System.out.println("Quel est votre adresse email ? ");
        String mail = sc.nextLine();
        Client clt = new Client(nom, prenom, adresse, mail);
        return clt;
    }
}
