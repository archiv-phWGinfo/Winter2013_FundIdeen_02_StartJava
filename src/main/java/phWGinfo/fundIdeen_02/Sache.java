package phWGinfo.fundIdeen_02;

/**
 * Created with IntelliJ IDEA.
 * User: paul
 * Date: 14/11/13
 * Time: 12:01
 * To change this template use File | Settings | File Templates.
 */
class Sache {

    public Sache() {
        System.out.println("Konstruktor wurde gerufen.");
    }

    public Sache(String f, int num) {
        feld1 = f;
        x = num;
    }

    String feld1 = "";
    int x = 0;

    void reset() {
        feld1 = "";
        x = 0;
    }

}
