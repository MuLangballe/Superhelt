import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Superhelte database");
        System.out.println("Tilføj superhelt: indtast superheltens navn: ");
        Scanner keyboard = new Scanner(System.in);
        String superHeroName = keyboard.next();

        System.out.println("indtast superheltens RIGTIGE navn: ");
        String superHeroRealName = keyboard.next();
    }
}
