package str.as;

final public class Byt implements byt.Interface {
    public Byt(final str.Interface value) {
        this.value = value;
    }

    @Override
    public byte value() {
        return Byte.parseByte(value.value());
    }

    private final str.Interface value;
}
