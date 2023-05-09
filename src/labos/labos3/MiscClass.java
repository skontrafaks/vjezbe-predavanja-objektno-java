package labos.labos3;

import java.util.Scanner;

public class MiscClass {


    public static void dayHrMins(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi minute: ");
        int minutes = sc.nextInt();
        int days = minutes / 1440;
        int hours = (minutes % 1440) / 60;
        int remainingMinutes = minutes % 60;

        String formattedTime = String.format("%d d: %d h : %d m", days, hours, remainingMinutes);
        System.out.println(formattedTime);
    }
}