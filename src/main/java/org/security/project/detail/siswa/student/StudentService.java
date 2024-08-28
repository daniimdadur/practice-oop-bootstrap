package org.security.project.detail.siswa.student;

import org.security.project.detail.siswa.student.model.StudentModel;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<StudentModel> getStudents();
    Optional<StudentModel> getById(String id);
    StudentModel createStudent();
    Optional<StudentModel> save(StudentModel student);
    Optional<StudentModel> update(StudentModel student, String id);
    Optional<StudentModel> delete(String id);
}
