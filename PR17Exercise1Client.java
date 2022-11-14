import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class PR17Exercise1Client {
    public static void main(String[] args) {
        byte bufferSend[] = new byte[5000];
        byte bufferRecive[] = new byte[5000];

        try {
            DatagramSocket datagramSocket = new DatagramSocket(789);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            InetAddress inetAddress = InetAddress.getByName("localhost");
            while (true) {
                System.out.print("Client  : ");
                String clientInput = bufferedReader.readLine();
                bufferSend = clientInput.getBytes();
                datagramSocket.send(new DatagramPacket(bufferSend, clientInput.length(),inetAddress,790));
                DatagramPacket recieveDatagramPacket = new DatagramPacket(bufferRecive, bufferRecive.length);

                datagramSocket.receive(recieveDatagramPacket);

                String serverInput = new String(recieveDatagramPacket.getData(),0,recieveDatagramPacket.getLength());
                System.out.print("Server : "+serverInput+" \n");
                if (clientInput.equalsIgnoreCase("BYE")) {
                    break;
                }
            }
        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }
    
}
