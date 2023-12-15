// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Solo<Integer,Float> solo1 = new Solo<Integer,Float>(1,2.5f);
       System.out.println(solo1.toString());
       Solo<String,String> solo2 = new Solo<String,String >("Ayman","my mother");
        System.out.println(solo2.toString());
       Solo<Float,String> solo3 = new Solo<Float,String>(12.3f,"MOMO");
        System.out.println(solo3.toString());
       Solo<Double,Float> solo4 = new Solo<Double,Float>(12.33336,1.2f);
        System.out.println(solo4.toString());


    }
}