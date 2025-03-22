package declerative.primitive.choice;

import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PString;

final public class PStringChoice implements PString {
    public PStringChoice(final PBoolean conditional, final PString trueValue, final PString falseValue) {
        this.conditional = conditional;
        this.trueValue = trueValue;
        this.falseValue = falseValue;
    }

    @Override
    public String strValue() {
        if(conditional.boolValue())
            return trueValue.strValue();

        return falseValue.strValue();
    }

    private final PBoolean conditional;
    private final PString trueValue;
    private final PString falseValue;
}
