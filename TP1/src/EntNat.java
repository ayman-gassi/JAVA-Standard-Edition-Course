public class EntNat {
    public Integer Number;
    EntNat(int Number)throws ErrConst{
        if(Number < 0 ){
            throw new ErrConst();
        }
        else {
            this.Number = Number;
        }
    }
    public static EntNat Somme(EntNat A,EntNat B) throws ErrSom, ErrConst {
            if (Integer.MAX_VALUE < A.Number || Integer.MAX_VALUE < B.Number){
                    throw new ErrSom(Integer.MAX_VALUE);
            }
            else {
                EntNat newObject = new EntNat(A.Number+B.Number);
                return newObject;
            }

    }
    public static EntNat Difference(EntNat A,EntNat B) throws ErrDiff, ErrConst {
        if (Integer.MAX_VALUE < A.Number || Integer.MAX_VALUE < B.Number || A.Number < 0 || B.Number < 0){
            throw new ErrDiff();
        }
        else {
            EntNat newObject = new EntNat(A.Number / B.Number);
            return newObject;
        }

    }
    public static EntNat Produit(EntNat A,EntNat B) throws ErrProd, ErrConst {
        if (Integer.MAX_VALUE < A.Number || Integer.MAX_VALUE < B.Number ){
            throw new ErrProd();
        }
        else {
            EntNat newObject = new EntNat(A.Number * B.Number);
            return newObject;
        }

    }



}
