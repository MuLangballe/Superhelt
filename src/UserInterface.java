import java.util.Scanner;

public class UserInterface {
    public void startProgram() {
        int menuChoice;
        Database superheroDatabase = new Database();

        do {
            System.out.println("Velkommen til SUPERHERO UNIVERSET. \n " +
                    "1. Opret superhelt \n " +
                    "2. Se liste af superhelte \n " +
                    "3. Søg efter superhelt \n " +
                    "4. Rediger eksistrende superhelt \n" +
                    "9. Afslut");
            Scanner keyboard = new Scanner(System.in);
            menuChoice = keyboard.nextInt();
            keyboard.nextLine();
            if (menuChoice == 1) {
                System.out.println("Tilføj superhelt: indtast superheltens navn: ");
                String superHeroName = keyboard.nextLine();

                System.out.println("Indtast superheltens RIGTIGE navn: ");
                String superHeroRealName = keyboard.nextLine();

                System.out.println("Indtast superheltens superkraft: ");
                String superHeroSuperPower = keyboard.nextLine();

                System.out.println("Indtast året superhelten blev skabt: ");
                int superHeroYearCreated = keyboard.nextInt();
                keyboard.nextLine();

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
                superheroDatabase.seeAllHeroes();
            } else if (menuChoice == 2) {
                System.out.println("Liste af superhelte: ");
                superheroDatabase.seeAllHeroes();

            } else if (menuChoice == 3) {
                System.out.println("indtast søgning: ");
                String searchSuperhero = keyboard.nextLine();
                superheroDatabase.findSuperhero(searchSuperhero);

            } else if (menuChoice == 4) {
                System.out.println("Indtast superhelten du ønsker at redigere: ");
                String superheroToEdit = keyboard.nextLine();
                superheroDatabase.editSuperhero(superheroToEdit);

            }
        } while (menuChoice != 9);
    }
}

