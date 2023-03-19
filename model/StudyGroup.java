package unit5.model;

import java.util.List;

/**
 * 1. Single responsibility principle
 * Принцип единственной ответственности
 *
 * Класс отвечает только за хранение
 * основных своих данных,
 * без которых он не может существовать.
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
 * Класс не зависит от класса визуализации или выгрузки данных.
 */
public class StudyGroup implements IIndex {
    private int id;
    private Teacher teacher;
    private List<Student> studentList;

    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.id = Index.createId();
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "StudyGroup id= "+id+" {" +
                "teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }
}
