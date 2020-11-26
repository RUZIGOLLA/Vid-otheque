import Videotheque.*;
import java.util.*;
import java.io.*;

public class Main {
    public List<Integer> arrianePath = new ArrayList<>();
    public static ArrayList<Film> films =  new ArrayList<Film>();

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
            } while (choice == null || (choice < 1 || choice > 5) && choice != 9);

            switch (choice) {
                case 1 -> addFilm();
            }

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

    private static void addFilm() {
        Film film = new Film();
        films.add(film);
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
    
    public void initProg() {
            
    }
}
