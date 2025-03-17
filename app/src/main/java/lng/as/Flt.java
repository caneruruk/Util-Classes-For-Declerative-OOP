package lng.as;

final public class Flt implements flt.Interface {
    public Flt(final lng.Interface value) {
        this.value = value;
    }

    @Override
    public float value() {
        return (float)value.value();
    }

    private final lng.Interface value;
}
