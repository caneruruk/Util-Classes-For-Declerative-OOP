package str.as;

final public class Intgr implements intgr.Interface {
    public Intgr(final str.Interface value) {
        this.value = value;
    }

    @Override
    public int value() {
        return Integer.parseInt(value.value());
    }

    private final str.Interface value;
}
