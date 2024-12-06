package terrarium;

public class Plant extends Organism {
    String species;
    double grothRate;
//    int sunlightRequirement;
//    int watherRequirement;

    public Plant(String name, int age, double size, String species, double grothRate) {
        super(name, age, size);
        this.species = species;
        this.grothRate = grothRate;
        }


}
