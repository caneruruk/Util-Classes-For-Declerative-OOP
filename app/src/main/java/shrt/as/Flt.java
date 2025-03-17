package shrt.as;

final public class Flt implements flt.Interface {
    public Flt(final shrt.Interface value) {
        this.value = value;
    }

    @Override
    public float value() {
        return (float)value.value();
    }

    private final shrt.Interface value;
}
