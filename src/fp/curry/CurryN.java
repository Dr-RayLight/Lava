package fp.curry;

public class CurryN {

    public static <F1, F2> Curry2<F1, F2> of2(Fn<F1, F2> fns) {
        return new Curry2<>(fns);
    }

    public static <F1, F2, F3> Curry3<F1, F2, F3> of3(Fn<F1, Fn<F2, F3>> fns) {
        return new Curry3<F1, F2, F3>(fns);
    }

    public static <F1, F2, F3, F4> Curry4<F1, F2, F3, F4> of4(Fn<F1, Fn<F2, Fn<F3, F4>>> fns) {
        return new Curry4<>(fns);
    }

    public static <F1, F2, F3, F4, F5> Curry5<F1, F2, F3, F4, F5> of5(Fn<F1, Fn<F2, Fn<F3, Fn<F4, F5>>>> fns) {
        return new Curry5<>(fns);
    }

    public static <F1, F2, F3, F4, F5, F6> Curry6<F1, F2, F3, F4, F5, F6> of6(
            Fn<F1, Fn<F2, Fn<F3, Fn<F4, Fn<F5, F6>>>>> fns) {
        return new Curry6<>(fns);
    }

    public static <F1, F2, F3, F4, F5, F6, F7> Curry7<F1, F2, F3, F4, F5, F6, F7> of7(
            Fn<F1, Fn<F2, Fn<F3, Fn<F4, Fn<F5, Fn<F6, F7>>>>>> fns) {
        return new Curry7<>(fns);
    }

    public static <F1, F2, F3, F4, F5, F6, F7, F8> Curry8<F1, F2, F3, F4, F5, F6, F7, F8> of8(
            Fn<F1, Fn<F2, Fn<F3, Fn<F4, Fn<F5, Fn<F6, Fn<F7, F8>>>>>>> fns) {
        return new Curry8<>(fns);
    }

    public static <F1, F2, F3, F4, F5, F6, F7, F8, F9> Curry9<F1, F2, F3, F4, F5, F6, F7, F8, F9> of9(
            Fn<F1, Fn<F2, Fn<F3, Fn<F4, Fn<F5, Fn<F6, Fn<F7, Fn<F8, F9>>>>>>>> fns) {
        return new Curry9<>(fns);
    }

    public static <F1, F2, F3, F4, F5, F6, F7, F8, F9, F10> Curry10<F1, F2, F3, F4, F5, F6, F7, F8, F9, F10> of10(
            Fn<F1, Fn<F2, Fn<F3, Fn<F4, Fn<F5, Fn<F6, Fn<F7, Fn<F8, Fn<F9, F10>>>>>>>>> fns) {
        return new Curry10<>(fns);
    }
}
