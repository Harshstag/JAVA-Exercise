import java.net.*;

public class inetAddress {
    public static void main(String args[]) throws UnknownHostException {
        
        InetAddress Adderess = InetAddress.getLocalHost();
        System.out.println(Adderess);

        Adderess = InetAddress.getByName("gmail.com");
        System.out.println(Adderess);

        Adderess = InetAddress.getByName("google.com");
        System.out.println(Adderess);

        Adderess = InetAddress.getByName("rediffmail.com");
        System.out.println(Adderess);

        InetAddress sw[] = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i < sw.length; i++) {
            
            System.out.println(sw[i]);
        }

    }
    
}
