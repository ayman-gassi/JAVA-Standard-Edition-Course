public class ErrSom extends Throwable {
    ErrSom(int message){
        super("error the max value of int is : " + message);
    }
}
