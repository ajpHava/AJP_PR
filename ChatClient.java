import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",3333);
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String messageString1 = "" , messageString2 = "";
            while(!messageString1.equalsIgnoreCase("stop")) {
                System.out.println("Client : ");
                messageString1 = bufferedReader.readLine();
                dataOutputStream.writeUTF(messageString1);

                messageString2 = dataInputStream.readUTF();
                System.out.println("Server : "+messageString2);
            }

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
