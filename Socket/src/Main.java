import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static void msg(Socket client) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader entreeDepuisClient = new BufferedReader (new InputStreamReader(client.getInputStream()));
        DataOutputStream sortieVersClient = new DataOutputStream(client.getOutputStream());
        String phraseClient = entreeDepuisClient.readLine();
        System.out.println("RECU DU Client: "+ client.getLocalAddress() +"\n"+ phraseClient);
        String[] items = phraseClient.split(" ");
        PrintWriter prt = null;
        try {
            prt = new PrintWriter(client.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Reply");
         String msg = scan.nextLine();
         int result = Integer.parseInt(items[0]) + Integer.parseInt(items[1]);
        prt.println(msg + " result :" + result);
        prt.flush();
        msg(client);
    }
    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getByName("www.github.com");
            System.out.println("IP : "+inet.getHostAddress());
            System.out.println("Name : "+inet.getHostName());
            //partie serveur
            ServerSocket server = new ServerSocket(3000);
            Socket client = null;
            while (true){
                client = server.accept();
//                sortieVersClient.writeChars();
//                OutputStream os = client.getOutputStream();
//                InputStream is = client.getInputStream();
//                os.write(is.read());
                msg(client);
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}