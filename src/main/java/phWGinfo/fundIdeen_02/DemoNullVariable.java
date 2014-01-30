package phWGinfo.fundIdeen_02;

public class DemoNullVariable extends Demo {

    public void run() {

        // Erklärung
        Object o = null;

        System.out.println(" o ist " + o);

        o = "something";

        System.out.println(" o ist " + o);

        // aber auf null kann man nichts tun!
        o = null;
        // das würde eine "NullPointerException" auslösen
        // System.out.println("Ist o etwas?" + o.equals("something"));
    }

    public static void main(String[] args) {
        new DemoTabelle().run();
    }

}
