import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class PR17Exercise1Server {
    public static void main(String[] args) {
        byte bufferSend[] = new byte[1000];
        byte bufferRecive[] = new byte[1000];

        try {
            DatagramSocket datagramSocket = new DatagramSocket(790);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            InetAddress inetAddress = InetAddress.getByName("localhost");
            while (true) {
                DatagramPacket datagramPacket = new DatagramPacket(bufferSend, bufferSend.length);
                datagramSocket.receive(datagramPacket);

                String clientInput = new String(datagramPacket.getData(),0,datagramPacket.getLength());

                if (clientInput.equalsIgnoreCase("BYE")) {
                    bufferRecive = "BYE".getBytes();
                    int length = "BYE".length();
                    datagramSocket.send(new DatagramPacket(bufferRecive, length, inetAddress, 789));
                    break;
                }
                System.out.print("Client : "+clientInput+"\n");
                System.out.print("Server : ");
                String serverInput = bufferedReader.readLine();
                bufferRecive = serverInput.getBytes();
                datagramSocket.send(new DatagramPacket(bufferRecive , serverInput.length() , inetAddress , 789));
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
