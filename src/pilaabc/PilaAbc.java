package pilaabc;

import java.util.Scanner;

public class PilaAbc {

    char pilabc[] = new char[26];
    int tope = 0;

    public void llenar() {
        char letra = 'A'; 
        for (int i = 0; i < 26; i++) {
            if (tope < 26) {
                pilabc[tope] = letra;
                letra++;
                tope++;
            } else {
                System.out.println("Completa");
                break;
            }
        }
        System.out.println("valores Adjuntados");
    }

    public void mostrar() {
        for (int i = tope - 1; i >= 0; i--) {
            System.out.print(" " + pilabc[i]);
        }
    }

    public void eliminar() {
        tope--;
        System.out.println(" eliminado el ultimo dato...");
    }

    public void agregar(char w) {
        pilabc[tope] = w; //$ *
        tope++;
        System.out.println(" agregado el dato solicitado..");
    }

    public static void main(String[] args) {
        PilaAbc c = new PilaAbc ();
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        do {
            System.out.println("\n1 llenar\n"
                    + "2 mostrar\n"
                    + "3 eliminar\n"
                    + "4 agregar\n"
                    + "5 salir\n");
            switch (opt = sc.nextInt()) {
                case 1:
                    c.llenar();
                    break;
                case 2:
                    c.mostrar();
                    break;
                case 3:
                    c.eliminar();
                break;
                case 4:
                    System.out.println("ingresa el dato");
                    char w=sc.next().charAt(0);
                    c.agregar(w);
                break;
            }
        } while (opt != 5);
    }
}