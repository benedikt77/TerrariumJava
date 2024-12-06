package terrarium;

import java.util.Scanner;

public class tools {
    public static void print(String message) {
        System.out.println(message);
    }

    public static int receiveInt(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }
    public static double receiveDouble(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextDouble();
    }

    public static String receiveString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }


}
