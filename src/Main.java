import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menuChoice;
        Database superheroDatabase = new Database();

        do {
            System.out.println("Velkommen til SUPERHERO UNIVERSET. \n 1. Opret superhelt \n 9. Afslut");
            Scanner keyboard = new Scanner(System.in);
            menuChoice = keyboard.nextInt();
            if (menuChoice == 1) {
                System.out.println("Tilføj superhelt: indtast superheltens navn: ");
                String superHeroName = keyboard.next();

                System.out.println("Indtast superheltens RIGTIGE navn: ");
                String superHeroRealName = keyboard.next();

                System.out.println("Indtast superheltens superkraft: ");
                String superHeroSuperPower = keyboard.next();

                System.out.println("Indtast året superhelten blev skabt: ");
                int superHeroYearCreated = keyboard.nextInt();

                System.out.println("Er superhelten et menneske? [j/n]");
                char isHumanInput = keyboard.next().charAt(0);
                boolean isSuperheroHuman = true;
                switch (isHumanInput) {
                    case 'j' -> {
                    }
                    case 'n' -> isSuperheroHuman = false;
                }

                System.out.println("Hvor stærk er superhelten(i tal)?");
                int superHeroStrength = keyboard.nextInt();


                superheroDatabase.createSuperhero(superHeroName, superHeroRealName, superHeroSuperPower, superHeroYearCreated, isSuperheroHuman, superHeroStrength);
            }
        } while (menuChoice != 9);
    }
}

