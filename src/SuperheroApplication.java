//     Create the SuperheroApplication class and write the following instructions in its main method:
import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {
    public static void main(String[] args) {
//        Create a SuperheroCaller and use it to call one superhero. Display its name.
        SuperheroCaller superheroCaller = new SuperheroCaller();
        Superhero hero = superheroCaller.call();
//        String name = hero.getName();
        System.out.println("Superhero: " + hero);
//        Create a list of Superhero and add six superheroes by calling them with the SuperheroCaller. Use a loop for this, please.
        List<Superhero> superheroes = new ArrayList<>();
        for (int times = 1; times <= 6; times++) {
            superheroes.add(superheroCaller.call());
        }
//        Display the superheroe names one by one with a loop by also showing the number of appearance.
        for (int times = 0; times <= superheroes.size()-1; times++) {
            Superhero superhero = superheroes.get(times);
            System.out.println("Superhero " + (times+1) + ": " + superhero);
        }
//        Display the number of superheroes by using the list’s size.
        int size = superheroes.size();
        System.out.println("Number of superheroes: " + size);
    }
}
