package str.as;

final public class Shrt implements shrt.Interface {
    public Shrt(final str.Interface value) {
        this.value = value;
    }

    @Override
    public short value() {
        return Short.parseShort(value.value());
    }

    private final str.Interface value;
}
