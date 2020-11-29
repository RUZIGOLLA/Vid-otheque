package Videotheque;
import java.utils.*;

public class AllClients {
    public ArrayList<Client> listeClients = new ArrayList<Client>();
    public AllClients() {

    }

    public void addClient() {
        Client client = new Client();
        listeClients.add(client);
    }

    public Client searchClient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ecrivez le nom du client  ");
        String name = sc.nextLine();
        for (Client client : listeClients) {
            if (client.getName() == name) {
                return client;
            }
        }
        return null;
    }

    public void louerFilm() {
        Client client = getClient();
        if ( client != null) {
            Film film = AllFilms.searchFilm();
            if (film != null ) {
                if (client.louer(film)) {
                    System.out.println(MessageFormat.format("Film {0} louer avec succès pour le client {1}", film.getName(), client.getName()));
                } else {
                    System.out.prinln(MessageFormat.format("Le client {0} à déjà 5 films de loués !", client.getName()));
                }
            }
        }
    }
}