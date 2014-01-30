package phWGinfo.fundIdeen_02;

/**
 */
public class DemoMethodenParameter {

    int count = 0;
    // Beispiel Methodenparameter
    // new DemoMethodenParameter().run() vom main Arufen!

    public void run() {
        // Beispielmethode: sagWas
        sagWas("Hallo?");
        sagWas("Ist da jemand?");
        System.out.println(wieViel());
    }

    private void sagWas(String was) {
        count = count +1;
        System.out.println("Sagt      : " + was);
        was = was.toLowerCase();
        System.out.println("Hat gesagt: " + was);
    }

    public int wieViel() {
        return count;
    }

    public static void main(String[] args) {
        new DemoMethodenParameter().run();
    }

    public static void main(String[] args) {
        new DemoTabelle().run();
    }


}
