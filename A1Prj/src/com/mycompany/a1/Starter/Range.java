package com.mycompany.a1.Starter;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * Created by Varun on 2/28/16.
 */

class Range implements Iterable<Integer> {

    private int limit;

    public Range(int limit) {
        this.limit = limit;
    }

    @Override
    public Iterator<Integer> iterator() {
        final int max = limit;
        return new Iterator<Integer>() {

            private int current = 0;

            @Override
            public boolean hasNext() {
                return current < max;
            }

            @Override
            public Integer next() {
                if (hasNext()) {
                    return current++;
                } else {
                    throw new NoSuchElementException("Range reached the end");
                }
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Can't remove values from a Range");
            }
        };
    }
}

