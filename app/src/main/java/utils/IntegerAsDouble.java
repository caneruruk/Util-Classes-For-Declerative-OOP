package utils;

final public class IntegerAsDouble implements Double {
    public IntegerAsDouble(final Integer value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.intValue();
    }

    private final Integer value;
}
