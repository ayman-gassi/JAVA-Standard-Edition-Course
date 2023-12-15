// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        try{
            EntNat object1 = new EntNat(2);
            EntNat object2 = new EntNat(1);
            EntNat object3 = EntNat.Somme(object1,object2);
            EntNat object4 = EntNat.Difference(object1,object2);
            EntNat object5 = EntNat.Produit(object1,object2);
            System.out.println(object3.Number);
            System.out.println(object4.Number);
            System.out.println(object5.Number);
        }
        catch (ErrConst err){
            System.out.println("error : "+ err.getMessage());
        } catch (ErrSom | ErrDiff | ErrProd err) {
            System.out.println( err.getMessage());
        }


    }
}