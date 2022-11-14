import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class PR17Exercise2Client {
    public static void main(String[] args)throws Exception {
        byte b[]=new byte[3072];
        FileInputStream fs=new FileInputStream("C://FolderA/abc.txt");
        DatagramSocket ds=new DatagramSocket(2000);
        int i=0;
        while(fs.available()!=0)
        {
            b[i]=(byte)fs.read();
            i++;
        }
        fs.close();
        ds.send(new DatagramPacket(b, i,InetAddress.getLocalHost(),1000));
    }
}
