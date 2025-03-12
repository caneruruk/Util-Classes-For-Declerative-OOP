package utils;

final public class FloatAsDouble implements Double {
    public FloatAsDouble(final Float value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.floatValue();
    }

    private final Float value;
}
