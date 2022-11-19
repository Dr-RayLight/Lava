package fp.curry;

public class Curry9<F1, F2, F3, F4, F5, F6, F7, F8, F9> extends _Curry0<F1, F2, F3, F4, F5, F6, F7, F8, F9, Void> {

    public Curry9(Fn<F1, Fn<F2, Fn<F3, Fn<F4, Fn<F5, Fn<F6, Fn<F7, Fn<F8, F9>>>>>>>> fns) {
        iCurry9 = fns;
    }

    public Fn<F2, Fn<F3, Fn<F4, Fn<F5, Fn<F6, Fn<F7, Fn<F8, F9>>>>>>> apply(F1 f1) {
        return iCurry9.apply(f1);
    }

    public F9 applies(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6, F7 f7, F8 f8) {
        return apply(f1).apply(f2).apply(f3).apply(f4).apply(f5).apply(f6).apply(f7).apply(f8);
    }
}
