package str.as;

final public class Lng implements lng.Interface {
    public Lng(final str.Interface value) {
        this.value = value;
    }

    @Override
    public long value() {
        return Long.parseLong(value.value());
    }

    private final str.Interface value;
}
