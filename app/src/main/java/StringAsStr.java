final public class StringAsStr implements str.Interface {
    public StringAsStr(final String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

    private final String value;
}
