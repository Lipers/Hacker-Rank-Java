package org.example.challenges;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Priorities {
    public List<Student> getStudents(List<String> events) {

        List<Student> students = new ArrayList<>();

        for (String event: events) {
            List<String> elementEvents = List.of(event.split(" "));
            if ("ENTER".equals(elementEvents.get(0))) {
                addStudent(students, elementEvents);
            }
            if ("SERVED".equals(elementEvents.get(0))) {
                students = removeStudent(students);
            }
        }

        return students;
    }

    private List<Student> removeStudent(List<Student> students) {
        students.sort(Comparator.comparingDouble(Student::getCgpa));

        List<Student> cgpaEqual = new ArrayList<>(List.of(students.get(students.size() - 1)));
        for (int i = students.size() - 1; i >= 0; i--) {
            if (i - 1 >=0) {
                if (students.get(i).getCgpa() == students.get(i - 1).getCgpa()) {
                    cgpaEqual.add(students.get(i-1));
                }
            }
        }

        if (cgpaEqual.size() == 1) {
            return students.stream().filter(x -> x.getId() != cgpaEqual.get(0).getId()).collect(Collectors.toList());
        } else {
            cgpaEqual.sort(Comparator.comparing(Student::getName));
            List<Student> nameEqual = new ArrayList<>(List.of(students.get(students.size() - 1)));
            for (int i = cgpaEqual.size() - 1; i >= 0; i--) {
                if (i - 1 >=0) {
                    if (cgpaEqual.get(i).getName() == cgpaEqual.get(i - 1).getName()) {
                        nameEqual.add(cgpaEqual.get(i-1));
                    }
                }
            }

            if (nameEqual.size() == 1) {
                return students.stream().filter(x -> x.getId() != cgpaEqual.get(0).getId()).collect(Collectors.toList());
            } else {
                nameEqual.sort(Comparator.comparing(Student::getId));
                return students.stream().filter(x -> x.getId() != nameEqual.get(0).getId()).collect(Collectors.toList());
            }
        }
    }

    private void addStudent(List<Student> students, List<String> event) {
        students.add(new Student(Integer.parseInt(event.get(3)), event.get(1), Double.parseDouble(event.get(2))));
    }
}
