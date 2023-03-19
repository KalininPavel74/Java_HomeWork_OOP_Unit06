package unit5.control;

import unit5.model.Student;
import unit5.model.StudyGroup;
import unit5.model.Teacher;
import unit5.service.ServiceStudent;
import unit5.service.ServiceStudyGroup;
import unit5.service.ServiceTeacher;
import unit5.view.IView;
import unit5.view.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public Controller() {

        ServiceTeacher serviceTeacher = new ServiceTeacher();
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(serviceTeacher.create());

        ServiceStudent serviceStudent = new ServiceStudent();
        List<Student> studentList = new ArrayList<>();
        studentList.add(serviceStudent.create());
        studentList.add(serviceStudent.create());

        ServiceStudyGroup serviceStudyGroup = new ServiceStudyGroup();
        List<StudyGroup> studyGroupList = new ArrayList<>();
        studyGroupList.add(serviceStudyGroup.create(teacherList.get(0), studentList));



        /**
         * 5. Dependency inversion principle
         * Принцип инверсии зависимостей
         *
         * Программа работает с интерфейсом IView
         * и может сменить реализацию.
         */
        IView view = new View();
        String s = view.view(studentList);
        System.out.println(s);
        s = view.view(teacherList);
        System.out.println(s);
        s = view.view(studyGroupList);
        System.out.println(s);

    }
}
