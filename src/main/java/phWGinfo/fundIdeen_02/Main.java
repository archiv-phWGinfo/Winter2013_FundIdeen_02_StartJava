package phWGinfo.fundIdeen_02;

/**
 *
 */
public class Main {

    public static void main(String[] args) throws Throwable {

        // Methoden Parametern
        // new DemoMethodenParameter().run();

        Lebewesen m = new Mensch();
        m.sagWas("was");

        Lebewesen l = new Lebewesen();
        l.sagWas("was");
    }

}

class Lebewesen {
    void sagWas(String s) {
        System.out.println(s);
    }
}

class Mensch extends Lebewesen{
   // Glied bein, fuss;
    void sagWas(String s) {
        System.out.println(
                "Mund: " + s);
    }
}
