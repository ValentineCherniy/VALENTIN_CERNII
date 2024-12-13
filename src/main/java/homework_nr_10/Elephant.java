package homework_nr_10;

public class Elephant extends Herbivore implements Animals{

    String skinColor;

    public Elephant(String habitat, int weight, String skinColor) {
        super(habitat, weight);
        this.skinColor = skinColor;
    }


    @Override
    public void eat() {
        System.out.println("eats plant food");
    }
    @Override
    public void eating(){
        System.out.println("this creature is eating now");
    }

    @Override
    public void makingSound() {
        System.out.println("this creature is trumping");
    }

    @Override
    public void moving() {
        System.out.println("this creature is walking");
    }

}
