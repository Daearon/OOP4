package OOP_Homework4;

public class IndexOutOfBorderException extends RuntimeException{
    public IndexOutOfBorderException() {
        super("Индекс находится за пределами допустимых значений");
    }
}
