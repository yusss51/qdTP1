package calcultableau;

import java.util.ArrayList;
import java.util.Scanner;

// Somme des éléments d'un tableau d'entiers
public class CalculTab {

    public double moyenne(ArrayList<Integer> notes) {
        int resultat = 0;
        for (int note : notes) {
            resultat += note;
        }
        return resultat / notes.size();
    }
    public double median(ArrayList<Integer> notes) {
        int taille = notes.size();
        if (taille % 2 == 0) {
            return (notes.get(taille / 2) + notes.get(taille / 2 - 1)) / 2;
        } else {
            return notes.get(taille / 2);
        }
    }

    /**
     Le main a été legerement changer pour s'adapter à notre code
     */

    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<Integer>();
        int i;
        int n = 0;
        int Sum = 0;

        // LA TAILLE DU TABLEAU
        do {
            System.out.println("Veuillez entrer la taille du tableau: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        } while (n > 50);

        // REMPLISSAGE DE TABLEAU
        System.out.println("****DEBUT PROGRAMME****");
        for (i = 0; i < n; i++) {
            System.out.println("Veuillez entrer un nombre: ");
            Scanner sc1 = new Scanner(System.in);
            tab.add(sc1.nextInt());
        }

        // AFFICHAGE DE TABLEAU
        System.out.println("Les élements de tableau sont : ");
        for (i = 0; i < n; i++) {
            System.out.println(tab.get(i));
        }

        // AFFICHAGE DE SOMME
        for (i = 0; i < n; i++) {
            Sum += tab.get(i);
        }
        System.out.println("La somme des éléments est égale à " + Sum);
        System.out.println("****FIN PROGRAMME****");

        // AFFICHAGE DE MOYENNE
        CalculTab calculTab = new CalculTab();

        System.out.println("La moyenne des éléments est égale à " + calculTab.moyenne(tab));

        // AFFICHAGE DE MEDIANE
        System.out.println("La médiane des éléments est égale à " + calculTab.median(tab));

        System.exit(0);
    }

}