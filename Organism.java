package terrarium;

public class Organism {
    String name;
    int age;
    double size;
    Point position;

    public Organism(String name, int age, double size) {
        this.name = name;
        this.age = age;
        this.size = size;
        //this.position = position;
    }

        public void grow(){
            this.size += + 0.5;
        }

}
