package terrarium;

public class Terrarium {
    static int counter;

    public void addNewObject() {
        counter++;
        Plant p1 = new Plant("Kaktus", 0, 0.1, "Pflanze", 0.2 );
        //ein Objekt Pflanze erzeugen
    }

    public void addPlant() {
        counter++;
        Plant p1 = new Plant("Kaktus", 0, 0.1, "Pflanze", 0.2 );
        //ein Objekt Pflanze erzeugen
    }
    public void addAnimal() {
        counter++;
        Plant p1 = new Plant("Kaktus", 0, 0.1, "Pflanze", 0.2 );
        //ein Objekt Pflanze erzeugen
    }

    public void displayStatus() {
        if (counter == 0) {
            System.out.println("Ich bin leer.");
        } else {
        System.out.println("Zur zeit leben " + counter + " Organismen hier");
        }
    }




}
