package bool;

final public class Not implements Interface {
    public Not(final Interface value) {
        this.value = value;
    }

    @Override
    public boolean value() {
        return !value.value();
    }

    private final Interface value;
}
