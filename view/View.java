package unit5.view;

import java.util.List;
/**
 * 1. Single responsibility principle
 * Принцип единственной ответственности
 *
 * Класс решает только свою задачу.
 *
 * 4. Interface segregation principle
 * Принцип разделения интерфейса
 *
 * Класс реализует интерфейс,
 * в полном объеме, осмысленно,
 * и без последующих вопросов.
 * И не реализует избыточных интефейсов.
 *
 * 5. Dependency inversion principle
 * Принцип инверсии зависимостей
 *
 * Класс не зависит от классов предметной области.
 */

public class View implements IView {
    public String view(List<?> list) {
        return list.toString();
    }
}
