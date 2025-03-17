package byt.as;

final public class Intgr implements intgr.Interface {
    public Intgr(final byt.Interface value) {
        this.value = value;
    }

    @Override
    public int value() {
        return (int)value.value();
    }

    private final byt.Interface value;
}
