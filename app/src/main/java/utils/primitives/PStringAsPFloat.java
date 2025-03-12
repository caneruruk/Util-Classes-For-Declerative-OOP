package utils.primitives;

import utils.primitives.interfaces.PFloat;
import utils.primitives.interfaces.PString;

final public class PStringAsPFloat implements PFloat {
    public PStringAsPFloat(final PString value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return Float.parseFloat(value.strValue());
    }

    private final PString value;
}
