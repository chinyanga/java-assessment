import service.Conversions;

import java.util.Scanner;

public class JavaAssessment {
    public static void main(String[] args){
        Conversions con = new Conversions();

        System.out.println("Enter conversion option 1, or 2, or 3");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter kelvins to convert");
                double kelvins = scanner.nextDouble();
                System.out.println(Double.toString(con.kelvinToCelcius(kelvins)));
                break;
            case 2:
                System.out.println("Enter pounds to convert");
                double pounds = scanner.nextDouble();
                System.out.println(Double.toString(con.poundsToKilogram(pounds)));
                break;
            case 3:
                System.out.println("Enter miles to convert");
                double miles = scanner.nextDouble();
                System.out.println(Double.toString(con.milesToKilometre(miles)));
                break;
            default:
        }
    }
}
