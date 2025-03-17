final public class FloatAsFlt implements flt.Interface {
    public FloatAsFlt(final float value) {
        this.value = value;
    }

    @Override
    public float value() {
        return value;
    }

    private final float value;
}
