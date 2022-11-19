package fp.curry;

public class Curry4<F1, F2, F3, F4> extends _Curry0<F1, F2, F3, F4, Void, Void, Void, Void, Void, Void> {

    public Curry4(Fn<F1, Fn<F2, Fn<F3, F4>>> fns){
        iCurry4 = fns;
    }

    public Fn<F2, Fn<F3, F4>> apply(F1 f1){
        return iCurry4.apply(f1);
    }

    public F4 applies(F1 f1, F2 f2, F3 f3){
        return apply(f1)
                .apply(f2)
                .apply(f3);
    }
}
