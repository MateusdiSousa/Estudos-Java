package mateus.com;

import org.w3c.dom.ranges.RangeException;

public class Vetor {
    private String[] elements;

    private int size;

    public Vetor(int length) {
        this.elements = new String[length];
        this.size = 0;
    }

    public boolean add(String element)  {
        if (isFull()) {
            return false;
        }

        if (size < elements.length) {
            elements[size] = element;
            size += 1;
            return true;
        }
        return false;
    }

    public boolean add(String element, int index)  {
        if (index >= elements.length || index < 0) {
            throw new IllegalArgumentException("This index not exists in vetor");
        }

        if (isFull()) {
            return false;
        }

        if (index >= size) {
            return add(element);
        }

        if (index < size) {

            for (int i = size-1; i >= index; i--) {
                elements[i+1] = elements[i];
            }
            elements[index] = element;
            size += 1;
            return true;
        }

        return false;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[");

        for (int i = 0; i < this.size; i++) {
            string.append(elements[i]);

            if (i < this.size - 1) {
                string.append(", ");
            }
        }

        string.append("]");
        return string.toString();
    }

    public String find(int index) throws IllegalArgumentException {
        if (index < size && index >= 0) {
            return elements[index];
        }

        throw new IllegalArgumentException("This index not exists in vetor");
    }

    public int find(String element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isFull() {
        return size == elements.length;
    }
}
