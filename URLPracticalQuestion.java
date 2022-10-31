import java.net.MalformedURLException;
import java.net.URL;

public class URLPracticalQuestion {
    public static void main(String[] args) throws MalformedURLException {
     
        URL hp = new URL("https://www.javatpoint.com/javaFX-tutorial");
        System.out.println("Protocol: "+hp.getProtocol());
        System.out.println("Host    : "+hp.getHost());
        System.out.println("File    : "+hp.getFile());
        System.out.println("External Form: "+hp.toExternalForm());
    }  
}
