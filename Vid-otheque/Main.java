import Videotheque.*;
import java.util.*;
import java.io.*;

public class Main {
    public List<Integer> arrianePath = new ArrayList<>();
    public static AllFilms films = new AllFilms();
    public static AllClients clients = new AllClients();

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        Scanner fs = new Scanner(System.in);
        Integer choice = null;

        do {
            do {
                clearConsole();
                showMenu("mainMenu.txt");
                choice = convertStringToInt(fs.nextLine());
            } while (choice == null && choice != 9);

            switch (choice) {
                case 1 -> films.addFilm();
                case 2 -> {
                    Film film = films.searchFilm();
                    if (film != null)
                        System.out.println(film.toString());
                    else
                        System.out.println("Aucun film n'a été trouvé !");
                    break;
                }
                case 3 -> {
                    ArrayList<Film> filmsDispo = films.GetFilmDispo(false);
                    for (Film film : filmsDispo) {
                        System.out.println(film.toString());
                    }
                }
                case 4 -> {
                    List<Film> filmsLouer;
                    for (Client client : clients.listeClients) {
                        filmsLouer = client.getFilms();
                        for (Film film : filmsLouer) {
                            System.out.println(film.toString() + " | Client : " + client.getName());
                        }
                    }
                }
                case 5 -> {
                    ArrayList<Film> filmsBySupport = films.getFilmsBySupport();
                    if (filmsBySupport.size() > 0) {
                        for (Film film: filmsBySupport) {
                            System.out.println(film.toString());
                        }
                    } else
                        System.out.println("Il n'y a aucun film sous ce support.");
                }
                case 6 -> {
                    Client client = clients.addClient();
                    System.out.println("Client " + client.getName() + " à bien été créé.");
                }
                case 7 -> {
                    AllFilms filmsDispo = new AllFilms(films.GetFilmDispo(false));
                    clients.louerFilm(filmsDispo);
                }
                case 8 -> {
                    Client client = clients.searchClient();
                    for (Film film : client.getFilms()){
                        if (film != null)
                            System.out.println(film.toString());
                    }
                }
                default -> {}
            }
            if (choice != 9)
                pressEnter();
        } while (choice != 9);

        clearConsole();

    }

    private static void showMenu(String file) {
        try {
            BufferedReader bisMenu = new BufferedReader(new FileReader("./" + file));
            String ligne;
            while((ligne = bisMenu.readLine()) != null)
                System.out.println(ligne);
            bisMenu.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private static Integer convertStringToInt(String choice) {
        try {
            return Integer.parseInt(choice);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static void clearConsole()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    private static void pressEnter() {
        Scanner sc = new Scanner(System.in);
        String newLine = System.getProperty("line.separator");
        System.out.println(newLine + "Appuyez sur entrer pour continuer...");
        sc.nextLine();
    }
}
