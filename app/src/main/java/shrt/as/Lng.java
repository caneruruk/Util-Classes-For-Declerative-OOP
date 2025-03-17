package shrt.as;

final public class Lng implements lng.Interface {
    public Lng(final shrt.Interface value) {
        this.value = value;
    }

    @Override
    public long value() {
        return (long)value.value();
    }

    private final shrt.Interface value;
}
