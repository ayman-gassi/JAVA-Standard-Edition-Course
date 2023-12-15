public class User extends Thread{
    int Somme = 0 ;
    int val1;
    int val2;
    User(int val1,int val2){
        this.val1 = val1;
        this.val2 = val2;
    }
    public void run(){
        try {
            for (int i= val1 ; i <= val2 ; i++){
                Somme += val1;
                System.out.println(Somme);
                sleep(2000);
            }
        }catch (InterruptedException e) {
            return;
        }
    }
}
