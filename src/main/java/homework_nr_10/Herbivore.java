package homework_nr_10;

public abstract class  Herbivore {
    String habitat; //living area
    int weight;

    public abstract void eat();

    public void about(){
        System.out.print("This creature lives in " + habitat + " and has around " + weight + "KG");
    }

    public Herbivore(String habitat, int weight) {
        this.habitat = habitat;
        this.weight = weight;
    }
}
