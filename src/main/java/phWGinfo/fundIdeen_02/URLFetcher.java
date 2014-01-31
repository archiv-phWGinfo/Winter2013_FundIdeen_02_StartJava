package phWGinfo.fundIdeen_02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLFetcher extends Thread {

    public URLFetcher(URL url, byte[] buffer) {
        this.url = url;
        this.buffer = buffer;
    }

    URL url;
    byte[] buffer;

    public void run() {
        try {
            // open streams
            URLConnection conn = url.openConnection();
            InputStream in = conn.getInputStream();

            // make a filename that looks useful
            String path = url.getPath();
            if(path.length()>3) {
                int p = path.lastIndexOf('/');
                if(p+1<path.length()) path = path.substring(p+1);
            }
            path = path.replaceAll("/","_");
            File file = new File(path);
            FileOutputStream out = new FileOutputStream(file);

            // process stream
            int numRead=in.read(buffer);
            while(numRead!=-1) {
                // do something with the buffer
                // (e.g. could count, or compress, or...)
                // for now just sleep
                Thread.sleep(10);
                out.write(buffer, 0, numRead);
                numRead = in.read(buffer);
            }

            // clean up
            in.close();
            out.flush();
            out.close();
            System.out.println("Fetched " + url + " in file " + file + ".");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
