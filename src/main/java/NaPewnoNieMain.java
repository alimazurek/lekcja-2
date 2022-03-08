import java.util.Scanner;

public class NaPewnoNieMain {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name = scan.next();
        System.out.println("Cześć " + name + " Podaj swój wiek");
        int age = scan.nextInt();
        System.out.println("Podaj swoją wypłatę");
        double payment=scan.nextDouble();
        System.out.println("Jesteś bankrutem");


    }
}

        /* int i = 0;
String[]
        while (i<11) {
            System.out.println (i);
            i++;
        }
    }
}
 PETLA DO WHILE roznica taka, ze nawet jesli warunek nie zostanie epelniony, petla wykona sie raz

public class Main {
public static void main (String[] args) {
int i=0;
do { System.out.println ("Przykład" + i);
i++;
 } while (i<10); }}
------
PETLA FOR
for (int i=0; i<10; i++) {
System.out.println("Przykład" + 1);
 */