package phWGinfo.fundIdeen_02;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class SucheDatei extends Demo {

    String dateiName;


    // findet Datei im Verzeichnis file und gibt es zurück
    String sucheDatei(File file) {
        println("Suche: " + file);
        if(file.isFile()) {
            if(dateiName.equals(file.getName())) {
                return file.getAbsolutePath();
            } else {
                return null;
            }
        } else { // file ist ein Verzeichnis
            for(File kind: file.listFiles()) {
                String gefunden = sucheDatei(kind);
                if(gefunden!=null) return gefunden;
            }
            // nicht gefunden
            return null;
        }
    }

    public static void main(String[] args) throws Throwable {
        SucheDatei suche = new SucheDatei();
        suche.println("Dateiname? ");
        suche.dateiName = suche.readLn();
        String gefundene = suche.sucheDatei(new File("src"));
        suche.println(gefundene);
        // offene Frage: wie kann man einfach im "aktuellen" Verzeichnis anfangen
    }

}
