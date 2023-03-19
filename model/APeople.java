package unit5.model;

/**
 * 1. Single responsibility principle
 * Принцип единственной ответственности
 *
 * Класс отвечает только за хранение
 * уникального числа, которое инентифицирует
 * его наследников.
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
 * Класс не зависит от классов, которые наследуются от него.
 */
abstract public class APeople implements IIndex {
    private int id;

    public APeople() {
        this.id = Index.createId();
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id=" + id;
    }
}
