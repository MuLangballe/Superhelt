public class Database {
    private Superhero[] superheroes;
    int count = 0;

    public Database(){
        this.superheroes = new Superhero[5];
    }

    public void createSuperhero(String name, String realName, String superPower, int yearCreated, boolean isHuman, int strength){
        superheroes[count++] = new Superhero(name, realName, superPower, yearCreated, isHuman, strength);

    }
}
