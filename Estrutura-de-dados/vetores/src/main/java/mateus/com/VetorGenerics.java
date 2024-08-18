package mateus.com;

import java.lang.reflect.Array;

public class VetorGenerics<T> {
    private T[] elements;

    private int size;

    public VetorGenerics(int length, Class<T> typeClass) {
        this.elements = (T[]) Array.newInstance(typeClass, length);
        this.size = 0;
    }

    public VetorGenerics(int lenght){
        this.elements = (T[]) new Object[lenght];
        this.size = 0;
    }

    public boolean add(T element)  {
        plusVetor();

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

    public boolean add(T element, int index)  {
        plusVetor();
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
            string.append(elements[i].toString());

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

    public int find(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    private boolean isFull() {
        return size == elements.length;
    }

    private void plusVetor(){
        if (this.size == this.elements.length){
            T[] newElements = (T[]) new Object[elements.length * 2];
            for (int i = 0; i < this.elements.length ; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public void remove (int index){
        if (!(index >= 0 && index < size) || index > size) {
            throw new IllegalArgumentException("Invalid Index!");
        }

        for(int i = index; i < elements.length-1; i++){
            this.elements[i] = this.elements[i+1];
        }
        elements[size] = null;
        size -= 1;
    }

    public void remove (T element){
        if (!(index >= 0 && index < size) || index > size) {
            throw new IllegalArgumentException("Invalid Index!");
        }
        
        int index = find(element);

        for(int i = index; i < elements.length-1; i++){
            this.elements[i] = this.elements[i+1];
        }
        elements[size] = null;
        size -= 1;
    }

}
