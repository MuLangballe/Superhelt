import java.util.ArrayList;

public class Database {
    ArrayList<Superhero> superheroes = new ArrayList<>();

    public void createSuperhero(String name, String realName, String superPower, int yearCreated, boolean isHuman, int strength){
         superheroes.add(new Superhero(name, realName, superPower, yearCreated, isHuman, strength));
    }

public ArrayList<String> findSuperhero(String superhero){
    ArrayList<String> results = new ArrayList<>();
    for (Superhero superhero1: superheroes) {
        if (superhero1.getName().toLowerCase().contains(superhero.toLowerCase())) {
            if (!results.contains(superhero1.getName())) {
                results.add(superhero1.getName());
            }
        }
    }
    return results;
}

    public  void seeAllHeroes (){
        for (Superhero superhero : superheroes) {
            System.out.println(superhero);
        }
    }
}
