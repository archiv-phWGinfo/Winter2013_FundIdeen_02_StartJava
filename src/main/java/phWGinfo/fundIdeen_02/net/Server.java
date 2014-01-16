package phWGinfo.fundIdeen_02.net;

import phWGinfo.fundIdeen_02.Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Demo {

    public static void main(String[] args) throws Throwable {
        new Server().run();
    }

    void run() throws Throwable {
        File file = new File("src/main/java/phWGInfo/fundIdeen_02/net/Server.java");
        println("My address: " );
        println(InetAddress.getLocalHost().getHostAddress());

        ServerSocket serverSocket = new ServerSocket(1234);
        println("Waiting on port 1234: " );
        Socket sock = serverSocket.accept();
        OutputStream out = sock.getOutputStream();
        FileInputStream input = new FileInputStream(file);
        println("Transmitting." );
        int byteRead = input.read();
        while(byteRead != -1) {
            out.write(byteRead);
            byteRead = input.read();
        }
        out.flush(); out.close();
        input.close(); serverSocket.close();
        println("Finished." );
    }

}
