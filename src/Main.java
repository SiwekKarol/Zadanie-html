import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dostępne prędkości:");
        System.out.println("SLOW");
        System.out.println("NORMAL");
        System.out.println("FAST");
        System.out.println("Wybierz prędkość:");
        Speed yourSpeed = Speed.valueOf(scan.nextLine());

        yourSpeed.printYourSpeed();

        scan.close();
    }

}
