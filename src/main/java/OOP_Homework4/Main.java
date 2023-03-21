package OOP_Homework4;

public class Main {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(40);
        dynamicArray.add(5);
        dynamicArray.add(10);
        dynamicArray.add(-9);
        dynamicArray.print();
        System.out.println("Размер массива - " + dynamicArray.size());

        dynamicArray.remove(2);
        dynamicArray.print();

        int foundIndex = dynamicArray.findIndex(3);
        System.out.printf("Найденный индекс = %d\n", foundIndex);

        int foundElement = dynamicArray.getElement(1);
        System.out.printf("Найденный элемент = %d\n", foundElement);

        boolean availability = dynamicArray.contains(6);
        System.out.printf("Возможность присутствия = %b\n", availability);

        for (int i = 0; i < dynamicArray.size(); i++) {
            if (dynamicArray.getElement(i) == 5) {
                dynamicArray.remove(i);
                i--;
            }
        }

        System.out.println("Массив после удаления элемента - ");
        dynamicArray.print();

        dynamicArray.setElement(1, 99);
        System.out.println("Массив после изменения значения элемента - ");
        dynamicArray.print();

        Integer minimum = dynamicArray.getMinimum();
        System.out.println("Минимальное значение в массиве - " + minimum);

        Integer maximum = dynamicArray.getMaximum();
        System.out.println("Максимальное значение в массиве - " + maximum);

        System.out.println("Сумма элементов массива - " + dynamicArray.sum());

        System.out.println("Произведение элементов массива - " + dynamicArray.product());

        Double[] doubleArray = {5.2, 2.6, 12.4, 6.4, 9.1};
        DynamicArray<Double> doubleDynamicArray = new DynamicArray<>(doubleArray);
        System.out.println("Новый массив doubleArray - ");
        doubleDynamicArray.print();
        System.out.println("Сумма элементов массива doubleArray - " + doubleDynamicArray.sum());

        doubleDynamicArray.bubbleSort();
        System.out.println("Отсортированный пузырьковым способом массив doubleArray: ");
        doubleDynamicArray.print();

        dynamicArray.insertionSort();
        System.out.println("Отсортированный вставками массив dynamicArray: ");
        dynamicArray.print();

        Integer[] intArray = {15, 8, 54, -12, 2, 16, 100};
        DynamicArray<Integer> intDynamicArray = new DynamicArray<>(intArray);
        System.out.println("Новый массив intArray - ");
        intDynamicArray.print();
        intDynamicArray.selectionSort();
        System.out.println("Отсортированный массив intArray - ");
        intDynamicArray.print();

        dynamicArray.clear();
        dynamicArray.print();
    }
}
