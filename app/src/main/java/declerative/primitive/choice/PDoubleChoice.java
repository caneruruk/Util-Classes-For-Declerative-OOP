package declerative.primitive.choice;

import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PDouble;

final public class PDoubleChoice implements PDouble {
    public PDoubleChoice(final PBoolean conditional, final PDouble trueValue, final PDouble falseValue) {
        this.conditional = conditional;
        this.trueValue = trueValue;
        this.falseValue = falseValue;
    }

    @Override
    public double doubleValue() {
        if(conditional.boolValue())
            return trueValue.doubleValue();

        return falseValue.doubleValue();
    }

    private final PBoolean conditional;
    private final PDouble trueValue;
    private final PDouble falseValue;
}
