package byt.as;

final public class Dbl implements dbl.Interface {
    public Dbl(final byt.Interface value) {
        this.value = value;
    }

    @Override
    public double value() {
        return (double)value.value();
    }

    private final byt.Interface value;
}
