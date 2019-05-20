import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner putin = new Scanner(System.in);
        Quarter quarter = new Quarter();
        System.out.println("Podaj x");
        x = putin.nextInt();
        System.out.println("Podaj y");
        y = putin.nextInt();
      String resoult =  quarter.quarterNumber(x, y);
        System.out.println("Punkt (" + x + "," + y + " leży w " + resoult + " ćwiardce układu współrzędnych");
    }
}
