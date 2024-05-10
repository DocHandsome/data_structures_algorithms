package handsome.doc.data_structures.arrays;

import javax.annotation.Nonnull;
import java.util.Arrays;

public class MyArray {

    private int length;
    private int capacity;
    @Nonnull
    private Object[] data;

    public MyArray() {
        this.length = 0;
        this.capacity = 1;
        this.data = new Object[1];
    }

    public Object get(final int index) {
        return this.data[index];
    }

    public int push(@Nonnull final Object item) {
        if (this.capacity == this.length) ;
        {
            this.data = Arrays.copyOf(this.data, this.capacity * 2);
            this.capacity *= 2;
        }

        this.data[this.length] = item;
        return this.length++;
    }

    @Nonnull
    public Object pop() {
        final Object lastItem = this.data[length - 1];
        this.data[length - 1] = null;
        this.length--;
        return lastItem;
    }

    @Nonnull
    public Object delete(final int index) {
        final Object item = this.data[index];
        shiftItems(index);
        return item;
    }

    private void shiftItems(final int index) {
        for (int i = index; i < this.length - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[this.length - 1] = null;
        this.length--;
    }

    public int length() {
        return this.length;
    }
}
