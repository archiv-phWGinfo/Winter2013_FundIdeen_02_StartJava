package phWGinfo.fundIdeen_02;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class DemoMultithreading extends Demo {

    public static void main(String[] args) {
        new DemoMultithreading().run();
    }

    public void run() {
        try {
            List<URL> urls = Arrays.asList(
                    new URL("http://direct.hoplahup.net/tmp/Goethe/Belagerung-von-Mainz.txt"),
                    new URL("http://direct.hoplahup.net/tmp/Goethe/Die-Aufgeregten.txt"),
                    new URL("http://direct.hoplahup.net/tmp/Goethe/Die-Leiden-des-jungen-Werthers.txt"),
                    new URL("http://direct.hoplahup.net/tmp/Goethe/Faust.txt"),
                    new URL("http://direct.hoplahup.net/tmp/Goethe/Goetz-von-Berlichingen.txt"),
                    new URL("http://direct.hoplahup.net/tmp/Goethe/Hermann-und-Dorothea.txt"),
                    new URL("http://direct.hoplahup.net/tmp/Goethe/Iphigenie-auf-Tauris.txt"),
                    new URL("http://direct.hoplahup.net/tmp/Goethe/Italienische-Reise-Teil-1.txt"),
                    new URL("http://direct.hoplahup.net/tmp/Goethe/Italienische-Reise-Teil-2.txt"),
                    new URL("http://direct.hoplahup.net/tmp/Goethe/Prometheus.txt"),
                    new URL("http://direct.hoplahup.net/tmp/Goethe/Wahlverwandtschaften.txt"),
                    new URL("http://direct.hoplahup.net/tmp/Goethe/West-oestlicher-Divan.txt")
            );

            // sequential or parallel?
            boolean isParallel = true;
            boolean isSequential = !isParallel;

            byte[] buffer = new byte[1024];
            startChronometer();
            if(isSequential) {
                for(URL u: urls) {
                    println("Fetching " + u);
                    new URLFetcher(u, buffer).run();
                    println("Fetched " + u);
                    printChronometer();
                }
            } else {
                for(URL u: urls) {
                    println("Launching fetch of " + u);
                    new URLFetcher(u, buffer).start();
                    println("Launched " + u);
                    printChronometer();
                }
                println("Finished launching fetches.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
