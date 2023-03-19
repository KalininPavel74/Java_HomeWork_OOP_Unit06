package unit5.service;

import unit5.model.Student;
/**
 * 1. Single responsibility principle
 * Принцип единственной ответственности
 *
 * Класс решает только свою задачу.
 *
 */

public class ServiceStudent {

    public Student create() {
        return new Student();
    }
}
