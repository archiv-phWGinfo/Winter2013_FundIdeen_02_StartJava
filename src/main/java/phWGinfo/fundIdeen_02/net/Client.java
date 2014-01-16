package phWGinfo.fundIdeen_02.net;

import phWGinfo.fundIdeen_02.Demo;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client extends Demo {

    public static void main(String[] args) throws Throwable {
        new Client().run();
    }

    void run() throws Throwable {

        println("Connect to: ");
        String address = readLn();

        InetAddress inetAddress = InetAddress.getByName(address);
        Socket socket = new Socket(inetAddress, 1234);
        InputStream input = socket.getInputStream();
        FileOutputStream out = new FileOutputStream("output.txt");
        println("Receiving to file output.txt" );
        int byteRead = input.read();
        while(byteRead != -1) {
            out.write(byteRead);
            byteRead = input.read();
        }
        out.flush(); out.close();
        input.close(); socket.close();
        println("Finished." );

    }


}
