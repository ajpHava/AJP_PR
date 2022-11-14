 import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        String unameString="" , passwordString = "";
        try {
            Socket socket = new Socket("localhost", 3133);
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter username : ");
            unameString = sc.nextLine();
            System.out.println("Enter password : ");
            passwordString = sc.nextLine();

            dataOutputStream.writeUTF(unameString);
            dataOutputStream.writeUTF(passwordString);

            String inputProvidedString = dataInputStream.readUTF();
            System.out.println("Provided Input : "+inputProvidedString );

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}