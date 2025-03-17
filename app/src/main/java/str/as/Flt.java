package str.as;

final public class Flt implements flt.Interface {
    public Flt(final str.Interface value) {
        this.value = value;
    }

    @Override
    public float value() {
        return Float.parseFloat(value.value());
    }

    private final str.Interface value;
}
