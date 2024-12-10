package homework_nr_10;

public class Elephant extends Herbivore{

    String skinColor;

    public Elephant(String habitat, int weight, String skinColor) {
        super(habitat, weight);
        this.skinColor = skinColor;
    }


    @Override
    public void eat() {
        System.out.println("eats plant food");
    }

}
