// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            try{
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a number");
                int number = scan.nextInt();
                System.out.println("Your number is " + number);
            }catch ( Exception err ){
                System.out.println("you have a problem " + new MyExeption().toString());

            }

    }
}