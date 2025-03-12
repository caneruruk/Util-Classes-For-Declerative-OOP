package utils.primitives;

import utils.primitives.interfaces.Integer;
import utils.primitives.interfaces.Short;

final public class ShortAsInteger implements Integer {
    public ShortAsInteger(final Short value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int)value.shortValue();
    }

    private final Short value;
}
