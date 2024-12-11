package homework_nr_10;

public class Main {
    public static void main(String[] args) {
        Herbivore el_1 = new Elephant("India", 4000, "grey");
        Herbivore el_2 = new Elephant("Africa", 6000, "dark grey");

        Herbivore[] herbivore = new Herbivore[]{
                el_1, el_2
        };
        for (int i = 0; i != herbivore.length; i++){
            int nr = i+1;
            if (herbivore[i] instanceof Elephant tempCreature) {
                System.out.println("Creature nr." + nr);
                tempCreature.about();
                System.out.print(" and ");
                tempCreature.eat();
                herbivore[i].moving();
                herbivore[i].eating();
                herbivore[i].makingSound();
                herbivore[i].showInfo();
                System.out.println();
                herbivore[i].k
            }
        }
    }
}
