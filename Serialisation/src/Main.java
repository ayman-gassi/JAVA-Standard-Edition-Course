import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try{
            //Serialisation
            Personne p = new Personne("GASSI","Ayman");
            FileOutputStream fos = new FileOutputStream("personne.serial");
            ObjectOutputStream obj = new ObjectOutputStream(fos);
            obj.writeObject(p);
            obj.flush();
            obj.close();
            fos.close();

            //Deserialisation
            Personne p2 = null ;
            FileInputStream fis = new FileInputStream("personne.serial");
            ObjectInputStream obs = new ObjectInputStream(fis);
            p2 = (Personne) obs.readObject();
            System.out.println(p2);
        }
        catch(IOException e){
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}