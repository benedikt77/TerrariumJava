package terrarium;


public class Play {

    public static void main(String[] args) {
        boolean stop = false;
        Terrarium t1 = new Terrarium();

        tools.print("Wilkommen im Terrarium,\nzur Zeit ist hier noch nicht viel los.\nWas möchtest du tun?");
        while (!stop){
            int userInput = tools.receiveInt("1 - Status anzeigen\n" +
                    "2- Pflanze hinzufügen\n" +
                    "3 - Tier hinzufügen\n" +
                    "4 - Terarium gießen\n" +
                    "5 - Tiere füttern\n" +
                    "6 - Terrarium schließen\n" );

            switch (userInput){
                case 1:
                    t1.displayStatus();
                    break;
                case 2:
                    t1.addPlant();
                    break;
                case 3:
                    t1.addAnimal();
                    break;
                case 4:
//                    t1.waterTerrarium();
                    break;
                case 5:
//                    t1.addAnimal();
                    break;
                case 6:
                    stop = true;
                    break;
                default:
                    stop = true;
                    break;




            }



        }

    }

}
