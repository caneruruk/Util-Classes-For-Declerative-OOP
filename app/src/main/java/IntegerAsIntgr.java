final public class IntegerAsIntgr implements intgr.Interface {
    public IntegerAsIntgr(final int value) {
        this.value = value;
    }

    @Override
    public int value() {
        return value;
    }

    private final int value;
}
