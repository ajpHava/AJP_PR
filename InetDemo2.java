import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
public class InetDemo2{
    static Scanner scanner;
    public static void main(String[] args) {
        try {
            String hostname;
            scanner = new Scanner(System.in);
            hostname = scanner.nextLine();
            InetAddress ip = InetAddress.getByName(hostname);
            System.out.println("Host Name : "+ip.getHostName());
            System.out.println("Host Name : "+ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }
}