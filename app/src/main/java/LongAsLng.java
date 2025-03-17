final public class LongAsLng implements lng.Interface {
    public LongAsLng(final long value) {
        this.value = value;
    }

    @Override
    public long value() {
        return value;
    }

    private final long value;
}
