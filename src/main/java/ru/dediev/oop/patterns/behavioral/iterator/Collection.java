package ru.dediev.oop.patterns.behavioral.iterator;

import lombok.ToString;

@ToString
public class Collection implements Container {
    public String[] names = {"Eugene", "Alvi", "Geor", "Azamat"};

    @Override
    public Iterator getIterator() {
        return new InnerCollectionIterator();
    }

    private class InnerCollectionIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
