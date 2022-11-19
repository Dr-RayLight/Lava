package fp.curry;

public class Curry7<F1, F2, F3, F4, F5, F6, F7> extends _Curry0<F1, F2, F3, F4, F5, F6, F7, Void, Void, Void> {

    public Curry7(Fn<F1, Fn<F2, Fn<F3, Fn<F4, Fn<F5, Fn<F6, F7>>>>>> fns) {
        iCurry7 = fns;
    }

    public Fn<F2, Fn<F3, Fn<F4, Fn<F5, Fn<F6, F7>>>>> apply(F1 f1) {
        return iCurry7.apply(f1);
    }

    public F7 applies(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return apply(f1).apply(f2).apply(f3).apply(f4).apply(f5).apply(f6);
    }
}
