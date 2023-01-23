package ru.dediev.oop.patterns.behavioral.iterator;

public class IteratorRunner {
    public static void main(String[] args) {
        Collection namesCollection = new Collection();

        Iterator iter = namesCollection.getIterator();
        while (iter.hasNext()) {
            System.out.print(iter.next().toString() + " ");
        }
    }
}
