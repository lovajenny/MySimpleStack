package dcll.land.MySimpleStack;

import java.util.EmptyStackException;

/**
 * Created by lova on 23/02/16.
 */
public class Item {
    private Object value;

    Item (Object value) {
        setValue(value);
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
