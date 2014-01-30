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
        // now with a buffer
        byte[] buffer = new byte[512];
        int numRead = input.read(buffer);
        while(numRead != -1) {
            out.write(buffer, 0, numRead);
            numRead = input.read(buffer);
        }
        out.flush(); out.close();
        input.close(); socket.close();
        println("Finished." );

    }


}
