package phWGinfo.fundIdeen_02;

import java.util.Scanner;

/** Einfaches Gerüst um Demos schöner und kompakter zu schreiben. */
public class Demo {

    /** Druckt den Nachricht im Systemkonsole.
     *
     * @param msg der Nachricht.
     */
    public void println(String msg) {
        System.out.println(msg);
    }

    /**
     * Liest eine Zeile von der Systemkonsole.
     *
     * @return die gelesen Zeile.
     */
    public String readLn() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
