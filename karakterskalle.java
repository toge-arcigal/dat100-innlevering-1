import java.util.Scanner;

public class karakterskalle {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Boolean error;



            for (int i = 0; i < 10; i++) {
                IO.println("Poengsum: ");
                int Karakter = input.nextInt();
                do {
                    if (Karakter > 100 || Karakter < 0) {
                    error = true;
                    IO.println("Prøv på nytt\nSkriv på nytt : " );
                    Karakter = input.nextInt();

                }else{
                        error = false;
                    }
                }while (error);
                if (Karakter <= 100 && Karakter >= 90) {
                    IO.print(" DU FIKK A :D ");


                } else if (Karakter <= 89 && Karakter >= 80) {
                    IO.print(" DU FIKK B :D ");


                } else if (Karakter <= 79 && Karakter >= 60) {
                    IO.print(" DU FIKK C :D ");


                } else if (Karakter <= 59 && Karakter >= 50) {
                    IO.print(" DU FIKK D :| ");


                } else if (Karakter <= 49 && Karakter >= 40) {
                    IO.print(" DU FIKK E D: ");


                } else if (Karakter <= 39 && Karakter >= 0) {
                    IO.print(" DU FIKK F D: ");





                }

        }


    }


    }

