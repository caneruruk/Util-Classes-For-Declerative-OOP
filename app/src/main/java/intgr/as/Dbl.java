package intgr.as;

final public class Dbl implements dbl.Interface {
    public Dbl(final intgr.Interface value) {
        this.value = value;
    }

    @Override
    public double value() {
        return (double)value.value();
    }

    private final intgr.Interface value;
}
