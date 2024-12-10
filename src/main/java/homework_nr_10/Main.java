package homework_nr_10;

public class Main {
    public static void main(String[] args) {
        Herbivore el_1 = new Elephant("India", 4000, "grey");
        Herbivore el_2 = new Elephant("Africa", 6000, "dark grey");

        Herbivore[] herbivore = new Herbivore[]{
                el_1, el_2
        };
        for (int i = 0; i != herbivore.length; i++){
            if (herbivore[i] instanceof Elephant tempCreature) {
                tempCreature.about();
                System.out.print(" and ");
                tempCreature.eat();
            }
        }
    }
}
