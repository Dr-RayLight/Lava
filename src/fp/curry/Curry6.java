package fp.curry;

public class Curry6<F1, F2, F3, F4, F5, F6> extends _Curry0<F1, F2, F3, F4, F5, F6, Void, Void, Void, Void> {

    public Curry6(Fn<F1, Fn<F2, Fn<F3, Fn<F4, Fn<F5, F6>>>>> fns) {
        iCurry6 = fns;
    }

    public Fn<F2, Fn<F3, Fn<F4, Fn<F5, F6>>>> apply(F1 f1) {
        return iCurry6.apply(f1);
    }

    public F6 applies(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return apply(f1)
                .apply(f2)
                .apply(f3)
                .apply(f4)
                .apply(f5);
    }

}
