package OOP_Homework4;

import java.util.Objects;

public class DynamicArray<T extends Number> {

    private T[] array;
    private int size;

    public DynamicArray() {
        this.array = (T[]) new Number[10];
        this.size = 0;
    }
    public DynamicArray(T[] data) {
        this.array = (T[]) new Number[data.length];
        System.arraycopy(data, 0, this.array, 0, data.length);
        this.size = data.length;
    }
    public void add(T element) {
        if (this.size == this.array.length) {
            T[] newArray = (T[]) new Object[this.size * 2];
            System.arraycopy(this.array, 0, newArray, 0, this.size);
            this.array = newArray;
        }
        this.array[this.size] = element;
        this.size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            System.out.println("Индекс находится за пределами допустимых значений");
        } else {
            for (int i = index; i < this.size - 1; i++) {
                this.array[i] = this.array[i + 1];
            }
            this.array[this.size - 1] = null;
            this.size--;
        }
    }

    public void clear() {
        this.array = (T[]) new Number[10];
        this.size = 0;
    }

    public T getMinimum() {
        if (size == 0) {
            System.out.println("Массив пуст");
            return null;
        }
        T min = array[0];
        for (int i = 1; i < size; i++) {
            if (((Comparable<T>) array[i]).compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T getMaximum() {
        if (size == 0) {
            System.out.println("Массив пуст");
            return null;
        }
        T max = array[0];
        for (int i = 1; i < size; i++) {
            if (((Comparable<T>) array[i]).compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public T sum() {
        T sum = null;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                sum = array[i];
            } else {
                sum = (T) new Double(sum.doubleValue() + array[i].doubleValue());
            }
        }
        return sum;
    }

    public T product() {
        T product = null;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                product = array[i];
            } else {
                product = (T) new Double(product.doubleValue() * array[i].doubleValue());
            }
        }
        return product;
    }

    public int findIndex(T element) {
        for (int i = 0; i < this.size; i++) {
            if (Objects.equals(this.array[i], element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(array[i], element)) {
                return true;
            }
        }
        return false;
    }

    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j].doubleValue() > array[j + 1].doubleValue()) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void insertionSort() {
        for (int i = 1; i < size; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].doubleValue() > key.doubleValue()) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j].doubleValue() < array[minIndex].doubleValue()) {
                    minIndex = j;
                }
            }
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public T getElement(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Индекс находится за пределами допустимых значений");
            return null;
        } else {
            return array[index];
        }
    }

    public void setElement(int index, T element) {
        if (index < 0 || index >= this.size) {
            System.out.println("Индекс находится за пределами допустимых значений");
        } else {
            this.array[index] = element;
        }
    }

    public void print() {
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                System.out.println("Элемент " + i + ": " + array[i]);
            }
        } else {
            System.out.println("Массив пуст");
        }
    }

    public int size() {
        return this.size;
    }
}
