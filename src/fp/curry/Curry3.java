package fp.curry;

import java.util.Objects;

public class Curry3<F1, F2, F3> extends _Curry0<F1, F2, F3, Void, Void, Void, Void, Void, Void, Void> {

    public Curry3(Fn<F1, Fn<F2, F3>> curry3) {
        iCurry3 = curry3;
    }

    public Fn<F2, F3> apply(F1 f1) {
        Objects.requireNonNull(iCurry3);
        return iCurry3.apply(f1);
    }

    public F3 applies(F1 f1, F2 f2) {
        return apply(f1).apply(f2);
    }
}
