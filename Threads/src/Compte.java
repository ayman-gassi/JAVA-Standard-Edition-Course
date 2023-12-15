import java.beans.IntrospectionException;

public class Compte extends Thread {
    int valeur;
    Compte(int valeur){
        this.valeur = valeur;
    }
    public void run(){
        try{
            for (;;){
                System.out.println(valeur + " ");
                sleep(100);

            }
        }catch (InterruptedException e) {
           return;
        }
    }
}
