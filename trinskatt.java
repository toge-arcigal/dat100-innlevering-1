
import java.util.Scanner;
public class trinskatt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in Bruttoinntekt: ");
        double bruttoinntekt, skattfri, Trinnskatt1;
        bruttoinntekt = scanner.nextInt();
        skattfri = 226100;


        if (bruttoinntekt > 226100 && bruttoinntekt <= 318300) {
            Trinnskatt1 = ((bruttoinntekt - skattfri) * 0.017);
            IO.print("Førelopet beløp som betales:  " + Trinnskatt1);

        }

        if (bruttoinntekt > 318301 && bruttoinntekt <= 725050) {
            Trinnskatt1 = ((bruttoinntekt - skattfri) * 0.04);
            IO.print("Førelopet beløp som betales:  " + Trinnskatt1);

        }

        if (bruttoinntekt > 725051 && bruttoinntekt <= 980100) {
            Trinnskatt1 = ((bruttoinntekt - skattfri) * 0.137);
            IO.print("Førelopet beløp som betales:  " + Trinnskatt1);


        }

        if (bruttoinntekt > 980101 && bruttoinntekt <= 1467200) {
            Trinnskatt1 = ((bruttoinntekt - skattfri) * 0.168);
            IO.print("Førelopet beløp som betales:  " + Trinnskatt1);


        }

        if (bruttoinntekt >= 1467201) {
            Trinnskatt1 = ((bruttoinntekt - skattfri) * 0.178);
            IO.print("Førelopet beløp som betales:  " + Trinnskatt1);


        }


    }

}