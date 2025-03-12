package utils;

final public class LongAsDouble implements Double {
    public LongAsDouble(final Long value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.longValue();
    }

    private final Long value;
}
