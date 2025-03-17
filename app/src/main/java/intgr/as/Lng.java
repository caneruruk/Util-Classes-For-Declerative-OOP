package intgr.as;

final public class Lng implements lng.Interface {
    public Lng(final intgr.Interface value) {
        this.value = value;
    }

    @Override
    public long value() {
        return (long)value.value();
    }

    private final intgr.Interface value;
}
