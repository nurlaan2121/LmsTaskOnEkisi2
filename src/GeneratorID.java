public class GeneratorID {
    public static Long id = 0L;

    public static Long generator(){
        return ++id;
    }
}
