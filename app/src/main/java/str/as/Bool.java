package str.as;

final public class Bool implements bool.Interface {
    public Bool(final str.Interface value) {
        this.value = value;
    }

    @Override
    public boolean value() {
        return Boolean.parseBoolean(value.value());
    }

    private final str.Interface value;
}
