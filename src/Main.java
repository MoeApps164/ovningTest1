import java.util.Scanner;
import java.util.InputMismatchException;



void main() {

    System.out.println("Programmet startar ");

    String[] names = {"adam ", "kaldi", "mohammed"};

    System.out.println("Index 0: " + names[0]);
    System.out.println("Index 1: " + names[1]);
    System.out.println("Index 2: " + names[2]);

    Scanner scan = new Scanner(System.in);
    boolean val = false;

while (!val) {
        try {
            System.out.print("Skriv vilket index (0-2) du vill se: ");
            int index = scan.nextInt();

            System.out.println("Du valde index " + index + ", namnet är: " + names[index]);

              val = true;

        } catch (InputMismatchException e) {
            System.out.println("Fel: du måste skriva ett heltal.");
            scan.nextLine();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fel: index måste vara 0, 1 eller 2.");
            scan.nextLine();
        }
    }
}