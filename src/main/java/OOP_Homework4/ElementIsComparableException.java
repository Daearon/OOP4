package OOP_Homework4;

public class ElementIsComparableException extends RuntimeException{
    public ElementIsComparableException() {
        super("Элемент должен быть Comparable");
    }
}
