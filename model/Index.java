package unit5.model;

/**
 * 1. Single responsibility principle
 * Принцип единственной ответственности
 *
 * Статический класс отвечает только за предоставление
 * уникального числа, которое в далнейшем инентифицирует
 * как преподавателей со студентами, так и группы.
 *
 * 5. Dependency inversion principle
 * Принцип инверсии зависимостей
 *
 * Класс не зависит от классов, которые его используют.
 */
public class Index {
    private static int index = 0;

    synchronized static public int createId() {
        return index++;
    }

}
