package OOP_Homework4;

public class ElementIsNotComparableException extends RuntimeException{
    public ElementIsNotComparableException() {
        super("Элемент должен быть Comparable");
    }
}
