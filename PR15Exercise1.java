import java.net.MalformedURLException;
import java.net.URL;

public class PR15Exercise1 {
    static URL urlObject;

    public static void main(String[] args) {
        try {
            urlObject = new URL("http://www.msbte.org.in");
            System.out.println("Host Name : " + urlObject.getHost());
            System.out.println("Protocol  : " + urlObject.getProtocol());
            System.out.println("Port No.  : " + urlObject.getPort());
            System.out.println("File      : " + urlObject.getFile());

        } catch (MalformedURLException e) {
            System.out.println(e);
        }
    }
}
