package byt.as;

final public class Flt implements flt.Interface {
    public Flt(final byt.Interface value) {
        this.value = value;
    }

    @Override
    public float value() {
        return (float)value.value();
    }

    private final byt.Interface value;
}
