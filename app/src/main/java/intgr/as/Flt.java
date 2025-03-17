package intgr.as;

final public class Flt implements flt.Interface {
    public Flt(final intgr.Interface value) {
        this.value = value;
    }

    @Override
    public float value() {
        return (float)value.value();
    }

    private final intgr.Interface value;
}
