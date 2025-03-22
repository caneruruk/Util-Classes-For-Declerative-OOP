package declerative.primitive.choice;

import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PLong;

final public class PLongChoice implements PLong {
    public PLongChoice(final PBoolean conditional, final PLong trueValue, final PLong falseValue) {
        this.conditional = conditional;
        this.trueValue = trueValue;
        this.falseValue = falseValue;
    }

    @Override
    public long longValue() {
        if(conditional.boolValue())
            return trueValue.longValue();

        return falseValue.longValue();
    }

    private final PBoolean conditional;
    private final PLong trueValue;
    private final PLong falseValue;
}
