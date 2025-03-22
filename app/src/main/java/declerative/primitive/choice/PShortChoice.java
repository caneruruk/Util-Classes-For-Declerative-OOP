package declerative.primitive.choice;

import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PShort;

final public class PShortChoice implements PShort {
    public PShortChoice(final PBoolean conditional, final PShort trueValue, final PShort falseValue) {
        this.conditional = conditional;
        this.trueValue = trueValue;
        this.falseValue = falseValue;
    }

    @Override
    public short shortValue() {
        if(conditional.boolValue())
            return trueValue.shortValue();

        return falseValue.shortValue();
    }

    private final PBoolean conditional;
    private final PShort trueValue;
    private final PShort falseValue;
}
