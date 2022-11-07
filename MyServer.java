import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(3133);
           Socket socket2  = socket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket2.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket2.getOutputStream());
            String responseUsernameString , responsePasswordString;
            responseUsernameString = dataInputStream.readUTF();
            responsePasswordString = dataInputStream.readUTF();
            if (responseUsernameString.equals("tushar")&&responsePasswordString.equals("admin")) {
                System.out.println("Login Successfull");
            }else{
                System.out.println("Login FALIED");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
