public class Solo <T1,T2> {
    static int num =0;
    private T1 valeur1;
    private T2 valeur2;
    private int id;
    public Solo(){
        this.valeur1 = null ;
        this.valeur2 = null ;
        this.id = num++;
    }
    public Solo(T1 val1,T2 val2){
        this.valeur1 = val1;
        this.valeur2 = val2;
        this.id = num++;
    }
    public T1 getValeur1(){
        return this.valeur1;
    }
    public T2 getValeur2(){
        return this.valeur2;
    }
    @Override
    public String toString(){
       return "valeur1 = " + this.valeur1.toString()+" valeur2 = " + this.valeur2.toString()+" id = " + this.id;
    }

}
