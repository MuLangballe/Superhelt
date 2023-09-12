import java.util.ArrayList;

public class Database {
    ArrayList<Superhero> superheroes = new ArrayList<>();

    public Database(){

    }

    public void createSuperhero(String name, String realName, String superPower, int yearCreated, boolean isHuman, int strength){
         superheroes.add(new Superhero(name, realName, superPower, yearCreated, isHuman, strength));
    }

    public  void seeAllHeroes (){
        for (Superhero temp : superheroes) {
            System.out.println(temp);
        }
    }
}
