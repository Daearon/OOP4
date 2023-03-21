package OOP_Homework4;

public class ElementIsNumberException extends RuntimeException{
    public ElementIsNumberException() {
        super("Элемент должен быть числовым");
    }
}
