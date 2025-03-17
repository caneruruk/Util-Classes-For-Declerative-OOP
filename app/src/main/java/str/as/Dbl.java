package str.as;

final public class Dbl implements dbl.Interface {
    public Dbl(final str.Interface value) {
        this.value = value;
    }

    @Override
    public double value() {
        return Double.parseDouble(value.value());
    }

    private final str.Interface value;
}
