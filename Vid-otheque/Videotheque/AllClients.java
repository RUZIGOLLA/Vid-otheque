package Videotheque;
import java.util.*;
import java.text.MessageFormat;

public class AllClients {
    public ArrayList<Client> listeClients = new ArrayList<Client>();
    public AllClients() {

    }

    public Client addClient() {
        Client client = new Client();
        listeClients.add(client);
        return client;
    }

    public Client searchClient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ecrivez le nom du client : ");
        String name = sc.nextLine();
        for (Client client : listeClients) {
            if (client.getName().equals(name)) {
                return client;
            }
        }
        return null;
    }

    public void louerFilm(AllFilms filmsDispo) {
        Client client = searchClient();
        if ( client != null) {
            Film film = filmsDispo.searchFilm();
            if (film != null ) {
                if (client.louer(film)) {
                    System.out.println(MessageFormat.format("Film {0} louer avec succès pour le client {1}", film.getName(), client.getName()));
                } else {
                    System.out.println(MessageFormat.format("Le client {0} à déjà 5 films de loués !", client.getName()));
                }
            } else {
                System.out.println("Aucun film n'a été trouvé.");
            }
        } else {
            System.out.println("Aucun client n'a été trouvé.");
        }
    }
}