package flt.as;

final public class Dbl implements dbl.Interface {
    public Dbl(final flt.Interface value) {
        this.value = value;
    }

    @Override
    public double value() {
        return (double)value.value();
    }

    private final flt.Interface value;
}
