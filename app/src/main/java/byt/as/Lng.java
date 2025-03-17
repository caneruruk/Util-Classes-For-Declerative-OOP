package byt.as;

final public class Lng implements lng.Interface {
    public Lng(final byt.Interface value) {
        this.value = value;
    }

    @Override
    public long value() {
        return (long)value.value();
    }

    private final byt.Interface value;
}
