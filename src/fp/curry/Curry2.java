package fp.curry;

public class Curry2<F1, F2> extends _Curry0<F1, F2, Void, Void, Void, Void, Void, Void, Void, Void>{

    public Curry2(Fn<F1, F2> fn){
        iCurry2 = fn;
    }

    public F2 apply(F1 f1){
        return iCurry2.apply(f1);
    }

}
