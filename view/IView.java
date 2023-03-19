package unit5.view;

import java.util.List;
/**
 * 5. Dependency inversion principle
 * Принцип инверсии зависимостей
 *
 * Интерфейс не зависит от классов предметной области.
 */
public interface IView {
    String view(List<?> list);
}
