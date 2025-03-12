package utils.primitives;

import utils.primitives.interfaces.PBoolean;
import utils.primitives.interfaces.PString;

final public class PStringAsPBoolean implements PBoolean {
    public PStringAsPBoolean(final String value) {
        this(new StringAsPString(value));
    }

    public PStringAsPBoolean(final PString value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return Boolean.parseBoolean(value.strValue());
    }

    private final PString value;
}
