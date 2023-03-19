package unit5.model;

/**
 * 2. Open-closed principle
 * Принцип открытости/закрытости
 *
 * Класс расширяет базовый класс.
 * И при далньшем дополнении класса новыми данным,
 * базовый класс не изменится.
 *
 * 5. Dependency inversion principle
 * Принцип инверсии зависимостей
 *
 * Класс не зависит от класса визуализации или выгрузки данных.
 */

public class Student extends APeople {
    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student "+ super.toString();
    }
}
