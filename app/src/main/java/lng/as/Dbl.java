package lng.as;

final public class Dbl implements dbl.Interface {
    public Dbl(final lng.Interface value) {
        this.value = value;
    }

    @Override
    public double value() {
        return (double)value.value();
    }

    private final lng.Interface value;
}
