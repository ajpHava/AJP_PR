import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer{
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3333);
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream()); 
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String messageString1="" , messageString2 = "";
            while(!messageString1.equalsIgnoreCase("stop")){
                messageString1 = dataInputStream.readUTF();
                System.out.println("Client : "+messageString1);

                System.out.println("Server : ");
                messageString2 = bufferedReader.readLine();
                dataOutputStream.writeUTF(messageString2);
            } 
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}