package OOP_Homework4;

public class ElementIsNotNumberException extends RuntimeException{
    public ElementIsNotNumberException() {
        super("Элемент должен быть числовым");
    }
}
