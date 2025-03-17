package shrt.as;

final public class Intgr implements intgr.Interface {
    public Intgr(final shrt.Interface value) {
        this.value = value;
    }

    @Override
    public int value() {
        return (int)value.value();
    }

    private final shrt.Interface value;
}
