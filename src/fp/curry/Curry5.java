package fp.curry;

public class Curry5<F1, F2, F3, F4, F5> extends _Curry0<F1, F2, F3, F4, F5, Void, Void, Void, Void, Void> {

    public Curry5(Fn<F1, Fn<F2, Fn<F3, Fn<F4, F5>>>> fns) {
        iCurry5 = fns;
    }

    public Fn<F2, Fn<F3, Fn<F4, F5>>> apply(F1 f1) {
        return iCurry5.apply(f1);
    }

    public F5 applies(F1 f1, F2 f2, F3 f3, F4 f4) {
        return apply(f1)
                .apply(f2)
                .apply(f3)
                .apply(f4);
    }

}