package utils;

final public class IntegerAsFloat implements Float {
    public IntegerAsFloat(final Integer value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.intValue();
    }

    private final Integer value;
}
