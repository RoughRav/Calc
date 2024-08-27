package Exception;

import Operations.Divide;

public class DivideByZero extends MathExceptions{

    /**
     * Исключаем деления на ноль
     * @param msg - текстовое сообщение для пользователя
     */
    public DivideByZero(String msg) {
        super(msg);
    }
}