package pl.javastart.task;

import java.util.Arrays;

// Uzupełnij klasę. Możesz ją dowolnie modyfikować.
// Celem jest, żeby przechodziły testy w src/test/java/[...]/CustomListTest
public class CustomList<T> {
    private T[] elements;
    private int size = 0;

    private void checkOrEnoughCapacity(int capacity) {
        if (elements == null) {
            elements = (T[]) new Object[1];
        } else {
            if (capacity > elements.length) {
                int newSize = size + 1;
                elements = Arrays.copyOf(elements, newSize);
            }
        }
    }

    public void add(T element) {
        checkOrEnoughCapacity(size + 1);
        if (element != null) {
            elements[size] = element;
            size++;
        }
    }

    public void add(int index, T element) {
        checkOrEnoughCapacity(size + 1);
        if (element != null) {
            T[] newArray = Arrays.copyOfRange(elements, index, size);
            elements[index] = element;
            size++;
            for (int i = index + 1; i < size; i++) {
                elements[i] = newArray[i - index - 1];
            }
        }
    }

    public int size() {
        if (elements == null) {
            return 0;
        } else {
            return elements.length;
        }
    }

    public T get(int i) {
        return elements[i];
    }

    public void remove(int index) {
        if (elements != null) {
            T[] rightArray = Arrays.copyOfRange(elements, index + 1, elements.length);
            elements = Arrays.copyOf(elements, elements.length - 1);
            for (int i = index; i < elements.length; i++) {
                elements[i] = rightArray[i - index];
            }
            size--;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
