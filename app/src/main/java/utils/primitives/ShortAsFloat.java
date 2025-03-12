package utils;

final public class ShortAsFloat implements Float {
    public ShortAsFloat(final Short value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.shortValue();
    }

    private final Short value;
}
