package unit5.service;

import unit5.model.Student;
import unit5.model.StudyGroup;
import unit5.model.Teacher;

import java.util.List;
/**
 * 1. Single responsibility principle
 * Принцип единственной ответственности
 *
 * Класс решает только свою задачу.
 *
 */

public class ServiceStudyGroup {
    public StudyGroup create(Teacher teacher, List<Student> studentList) {
        return new StudyGroup(teacher, studentList);
    }
}
