//     . Create the SuperheroCaller class that has a list with the three superheroes. It has the call method that returns a random Superhero every time you use it.
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuperheroCaller {
    private List<Superhero> superheroes = Arrays.asList(new Batman(),new Spiderman(),new Superman());
    private Random random = new Random();

    public Superhero call() {
        Superhero randomElement = superheroes.get(random.nextInt(superheroes.size()));
        return randomElement;
    }
}