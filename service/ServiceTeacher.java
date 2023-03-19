package unit5.service;

import unit5.model.Teacher;
/**
 * 1. Single responsibility principle
 * Принцип единственной ответственности
 *
 * Класс решает только свою задачу.
 *
 */

public class ServiceTeacher {
    public Teacher create() {
        return new Teacher();
    }
}
