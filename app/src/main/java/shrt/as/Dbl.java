package shrt.as;

final public class Dbl implements dbl.Interface {
    public Dbl(final shrt.Interface value) {
        this.value = value;
    }

    @Override
    public double value() {
        return (double)value.value();
    }

    private final shrt.Interface value;
}
