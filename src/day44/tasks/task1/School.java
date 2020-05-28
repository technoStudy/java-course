package day44.tasks.task1;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private int maxStudents;
    private List<Student> students = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public List<Student> registerStudent(Student student) {
        students.add(student);

        return new ArrayList<>(students);
    }

    public List<Employee> registerEmployee(Employee employee) {
        employees.add(employee);

        return new ArrayList<>(employees);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", maxStudents=" + maxStudents +
                ", students=" + students +
                ", employees=" + employees +
                '}';
    }
}