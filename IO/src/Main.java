import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        String FileName;
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------Create a file---------------------");
        System.out.println("entrer le nom du fichier");
        FileName = scan.nextLine();
        DataOutputStream output = new DataOutputStream(new FileOutputStream(FileName+".bat"));
        int nbr;
        do {
            System.out.println("entrer un nombre");
            nbr = scan.nextInt();
            output.writeInt(nbr);
        } while (nbr != 0);
        System.out.println("-----------------------Read a file---------------------");
        DataInputStream input = new DataInputStream(new FileInputStream(FileName+".bat"));
        int N = 0 ;
        Boolean Check = true;
        while (Check){
            try{
                N = input.readInt();

            } catch (IOException e) {
                Check = false;
            }
            System.out.println(N);
        }
        input.close();
        System.out.println("-----------------------Create and Write a file Txt---------------------");
        System.out.println("enter file name");
        PrintWriter txtFile = new PrintWriter(new FileWriter(FileName+".txt"));
        do {
           txtFile.println(N + " * " + N + " = " +N*N);
        }while (N!=0);
        txtFile.close();
        System.out.println("-----------------------Read a file Txt---------------------");
        BufferedReader Buffer = new BufferedReader(new FileReader(FileName));
        Boolean Still = true;
        do {
            System.out.println(Buffer.readLine());
        }while (Still);
        System.out.println("-----------------------Read a file Txt---------------------");

    }
}