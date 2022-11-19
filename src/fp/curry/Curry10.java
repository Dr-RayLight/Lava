package fp.curry;

public class Curry10<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10> extends _Curry0<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10> {

    public Curry10(Fn<F1, Fn<F2, Fn<F3, Fn<F4, Fn<F5, Fn<F6, Fn<F7, Fn<F8, Fn<F9, F10>>>>>>>>> fns) {
        iCurry10 = fns;
    }

    public Fn<F2, Fn<F3, Fn<F4, Fn<F5, Fn<F6, Fn<F7, Fn<F8, Fn<F9, F10>>>>>>>> apply(F1 f1) {
        return iCurry10.apply(f1);
    }

    public F10 applies(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6, F7 f7, F8 f8, F9 f9) {
        return apply(f1).apply(f2).apply(f3).apply(f4).apply(f5).apply(f6).apply(f7).apply(f8).apply(f9);
    }
}
