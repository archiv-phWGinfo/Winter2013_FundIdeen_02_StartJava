package phWGinfo.fundIdeen_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in,"utf-8"));
            return bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }

    long chronometerStart = 0;

    public void startChronometer() {
        this.chronometerStart = System.currentTimeMillis();
    }

    public void printChronometer() {
        println("Took " + ((System.currentTimeMillis()-chronometerStart)/1000.0) + " seconds.");
    }

}
