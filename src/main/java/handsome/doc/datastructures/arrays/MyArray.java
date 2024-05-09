package handsome.doc.datastructures.arrays;

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

    @Nonnull
    public Object get(int index) {
        return this.data[index];
    }

    public int push(@Nonnull Object item) {
        if (this.capacity == this.length) ;
        {
            this.data = Arrays.copyOf(this.data, this.capacity * 2);
            this.capacity *= 2;
        }

        this.data[length] = item;
        this.length++;
        return this.length;
    }

    @Nonnull
    public Object pop() {
        final Object lastItem = this.data[this.data.length - 1];
        this.data[this.data.length - 1] = null;
        this.length--;
        return lastItem;
    }
}
