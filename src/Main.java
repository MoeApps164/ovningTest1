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

    System.out.println("Nu  testa division.");

    boolean divisionTrue = false;

    while (!divisionTrue) {

    try {
        System.out.print("Skriv första talet: ");
        int tal1 = scan.nextInt();

        System.out.print("Skriv andra talet: ");
        int tal2 = scan.nextInt();

        int kvot = tal1 / tal2;
        System.out.println("Kvoten blir: " + kvot);
        divisionTrue = true;

    } catch (InputMismatchException e) {
        System.out.println("Fel: du måste skriva ett heltal.");
        System.out.println(e);
        scan.nextLine();

    } catch (ArithmeticException e) {
        System.out.println("Fel: du får inte dela med 0.");
        System.out.println(e);
    }
}
}