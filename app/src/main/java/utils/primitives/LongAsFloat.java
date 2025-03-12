package utils;

final public class LongAsFloat implements Float {
    public LongAsFloat(final Long value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.longValue();
    }

    private final Long value;
}
