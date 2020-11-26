import Videotheque.*;
import java.util.*;
import java.io.*;

public class Main {
    public List<Integer> arrianePath = new ArrayList<>();
    public static AllFilms films = new AllFilms();

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
                case 1 -> films.addFilm();
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

    private static Integer convertStringToInt(String choice) {
        try {
            return Integer.parseInt(choice);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private void searchMenu() {
        Scanner fs = new Scanner(System.in);
        Integer choice = null;

        do {
            do {
                clearConsole();
                showMenu("searchMenu.txt");
                choice = convertStringToInt(fs.nextLine());
            } while (choice == null || (choice < 1 || choice > 4) && choice != 9);

            switch (choice) {
                case 1 -> films.researchFilm();
            }
        } while (choice != 9);
    }


    public static void clearConsole()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public void initProg() {
            
    }
}
