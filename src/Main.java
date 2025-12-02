import java.util.Scanner;


void main() {

    System.out.println("Programmet startar ");

    String[] names = {"adam ", "kaldi", "mohammed"};

    System.out.println("Index 0: " + names[0]);
    System.out.println("Index 1: " + names[1]);
    System.out.println("Index 2: " + names[2]);

    Scanner scan = new Scanner(System.in);

    System.out.print("Skriv vilket index (0-2) du vill se: ");
    int namnIndex = scan.nextInt();

    System.out.println("Du valde index " + namnIndex + ", namnet är: " + names[namnIndex]);

}