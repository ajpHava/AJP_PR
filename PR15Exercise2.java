import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class PR15Exercise2 {
    static URL urlObject;
    static URLConnection urlConnection;
    static Scanner scanner;
    static String urlName;

    public static void main(String[] args) {
        try {
            scanner = new Scanner(System.in);
            urlName = scanner.nextLine();

            urlObject = new URL(urlName);
            urlConnection = urlObject.openConnection();

            System.out.println("Date           : " + urlConnection.getDate());
            System.out.println("Content Type   : " + urlConnection.getContentType());
            System.out.println("Content Length : " + urlConnection.getContentLength());
        } catch (Exception e) {
            
            System.out.println(e);
        }
        finally{
            scanner.close();
        }
    }
}
