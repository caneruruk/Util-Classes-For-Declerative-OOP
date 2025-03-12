package utils;

final public class IntegerAsLong implements Long {
    public IntegerAsLong(final Integer value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return (long)value.intValue();
    }

    private final Integer value;
}
