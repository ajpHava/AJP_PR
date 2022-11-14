import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class PR17Exercise2Server {
    public static void main(String[] args)throws IOException {
     
        byte b[]=new byte[3072];
        DatagramSocket ds=new DatagramSocket(1000);
        FileOutputStream f=new FileOutputStream("E:// abc.txt");
        DatagramPacket dp=new DatagramPacket(b, b.length);
        ds.receive(dp);
        int i=0;
        while(i<b.length)
        {
            f.write(b[i]);
            i++;
        }
        System.out.println("Data Copied");
    }
}
