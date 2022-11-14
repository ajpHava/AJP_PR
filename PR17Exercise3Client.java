import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class PR17Exercise3Client{
    public static void main(String[] args)throws Exception {
        byte b[]=new byte[3072];
       File f= new File("C:/Users/admin/Desktop/Java Programs/abc.txt");
        FileInputStream fs=new FileInputStream(f);
        DatagramSocket ds=new DatagramSocket(2000);
        int i=0;
        while(fs.available()!=0)
        {
            b[i]=(byte)fs.read();
            i++;
        }
        fs.close();
        ds.send(new DatagramPacket(b, i,InetAddress.getLocalHost(),1000));
        if(f.delete()){
            System.out.println("File Transfered");
        }
        else{
            System.out.println("failed to transfer");
        }
    }
}
 
