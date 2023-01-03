package pl.javastart.task;

import java.util.Arrays;

// Uzupełnij klasę. Możesz ją dowolnie modyfikować.
// Celem jest, żeby przechodziły testy w src/test/java/[...]/CustomListTest
public class CustomList<T> {
    private static final int INIT_SIZE = 10;
    private T[] elements = (T[]) new Object[INIT_SIZE];
    private int size = 0;

    private void checkOrEnoughCapacity() {
        if (size + 1 > elements.length) {
            int newSize = size * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public void add(T element) {
        checkOrEnoughCapacity();
        elements[size] = element;
        size++;
    }

    public void add(int index, T element) {
        checkOrEnoughCapacity();
        T[] newArray = Arrays.copyOfRange(elements, index, size);
        elements[index] = element;
        size++;
        for (int i = index + 1; i < size; i++) {
            elements[i] = newArray[i - index - 1];
        }
    }

    public int size() {
        return size;
    }

    public T get(int i) {
        return elements[i];
    }

    public void remove(int index) {
        System.arraycopy(elements, index + 1, elements, index, elements.length - index - 1);
        size--;
    }

    @Override
    public String toString() {
        T[] elementsToPrint = Arrays.copyOf(elements, size);
        return Arrays.toString(elementsToPrint);
    }
}
