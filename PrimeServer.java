import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PrimeServer {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        int n,count=0;
        String str = dis.readUTF();
        n = Integer.parseInt(str);
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
        dis.close();
        
    }
}
