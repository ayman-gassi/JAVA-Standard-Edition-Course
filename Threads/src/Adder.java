public class Adder extends Thread{
    static Integer SHARED_SUB_TOTAL;
    private Integer valueToAdd;
    public Adder(Integer value){
        valueToAdd = value;
    }
    @Override
    public void run(){
        int newTotal;
        int previousTotal;
        synchronized (Adder.class){
            previousTotal = SHARED_SUB_TOTAL;
            try{
                sleep(2);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            newTotal = previousTotal + valueToAdd;
            SHARED_SUB_TOTAL = newTotal;
        }
        System.out.println(this.currentThread().getName()+" : "+SHARED_SUB_TOTAL);
    }
}
