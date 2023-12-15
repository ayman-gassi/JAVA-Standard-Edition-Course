// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //create a thread
        Thread t = new Thread(){
            public void run(){
                System.out.println("Traitement");
            }
        };
        t.start();

        //Compte
        new Compte(1).start();
        new Compte(2000).start();



        //AdderTest
        Adder thread1 = new Adder(10);
        Adder thread2 = new Adder(10);
        System.out.println("Avant : " + Adder.SHARED_SUB_TOTAL);
        thread1.start();
        thread2.start();
        Thread.sleep(10);
        System.out.println("Apres : " + Adder.SHARED_SUB_TOTAL);

    }
}