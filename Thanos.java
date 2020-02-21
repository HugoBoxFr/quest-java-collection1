import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain American", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero scarlettWitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        heroes.add(blackWidow);
        heroes.add(captainAmerica);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarlettWitch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(doctorStrange);


        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        /*
        for (Hero hero : heroes) {
            System.out.println(hero.display());
        }
         */

        // TODO 5 : Keep only the half of the list
        List<Hero> heroes2 = heroes.subList(heroes.size()/2, heroes.size());


        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero hero : heroes2) {
            System.out.println(hero.displayName());
        }
    }
}
