package phWGinfo.fundIdeen_02;

/**
 *
 */
public class Main {

    public static void main(String[] args) throws Throwable {

        // Methoden Parametern
        // new DemoMethodenParameter().run();


        String x=null;
        if(x==null) {
            System.out.println("x ist null");
        } else {
            System.out.println("x ist nicht null");
        }
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
