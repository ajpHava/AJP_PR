import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class PrimeClient {
    public static void main(String[] args)throws Exception {
        Socket s = new Socket("localhost",3333);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String num = sc.nextLine();
        dos.writeUTF(num);
        dos.close();
        sc.close();
    }
}
