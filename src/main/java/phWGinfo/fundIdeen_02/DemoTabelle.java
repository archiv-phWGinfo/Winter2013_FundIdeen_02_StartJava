package phWGinfo.fundIdeen_02;

import java.util.ArrayList;
import java.util.List;

public class DemoTabelle extends Demo {

    public void run() {

        // eine Tabelle von int

        int[] tabelle = new int[4];
        tabelle[0] = 0;
        tabelle[2] = 2;
        tabelle[3] = 3;

        System.out.println("0: " + tabelle[0]);
        System.out.println("1: " + tabelle[1]);
        System.out.println("2: " + tabelle[2]);
        System.out.println("3: " + tabelle[3]);

        System.out.println("Tabelle ist " + tabelle.length + " Plätze lang.");



        // eine Tabelle von Objekten (eines bestimmten Typen)

        String[] strings = new String[2];
        strings[0] = "bla";
        strings[1] = "bli";
        System.out.println("0: " + strings[0]);
        System.out.println("1: " + strings[1]);

        // Frage: geht es mit grossen Größen? Wie groß?

        // Multidimensionalen Tabellen kriegt mann als Tabellen von Tabellen
        String[][] multiString = new String[3][2];
        multiString[2][1] = "asdas";


        // Tabelle sind strikt, Collections sind reich und flexibel
        List<String> liste = new ArrayList<String>();
        liste.add("a"); liste.add("b"); liste.add("c");
        System.out.println("liste: " + liste);
        // erforschen Sie bitte die Methoden von java.util.List!

    }

    public static void main(String[] args) {
        new DemoTabelle().run();
    }


}
