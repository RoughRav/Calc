package Presentation;

import Operations.Model;
import Operations.Divide;
import Operations.Multiply;
import Operations.Subtract;
import Operations.Summarize;
import View.UI;
import Logging.Log;
import Logging.Logtxt;

public class Presenter<T extends Model> {
    UI v;
    T model;

    /**
     * Конструктор объекта типа Presenter
     * @param v - объект типа UI
     * @param model - объект типа Model
     */
    public Presenter(UI v, T model) {
        this.model = model;
        this.v = v;
    }
}

/**
 *  Метод, объединяющий получений значений, выбор операции,  результат и логирование
 */