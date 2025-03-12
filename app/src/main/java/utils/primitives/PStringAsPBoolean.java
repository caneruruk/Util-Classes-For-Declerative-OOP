package utils.primitives;

import utils.primitives.interfaces.PBoolean;

final public class PStringAsPBoolean implements PBoolean {
    public PStringAsPBoolean(final String value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return Boolean.parseBoolean(value);
    }

    private final String value;
}
