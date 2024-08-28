package org.security.project.detail.siswa.student;

import lombok.extern.slf4j.Slf4j;
import org.security.project.detail.siswa.student.model.SchoolClassModel;
import org.security.project.detail.siswa.student.model.SchoolHistoryModel;
import org.security.project.detail.siswa.student.model.StudentModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {
    private final List<StudentModel> studentList;
    StudentServiceImpl() {
        studentList = new ArrayList<>();
        List<SchoolHistoryModel> schoolHistorySabil = new ArrayList<>();
        schoolHistorySabil.add(
                new SchoolHistoryModel("3d94dd2e-f1f6-4e4e-b45e-15a3f5e4b3cf", "SDN 1 Surabaya", "Surabaya", "Central Java",
                        Arrays.asList(
                                new SchoolClassModel("7a38c728-01e2-4d9a-a39b-6f90a703f11c", "Class 01", LocalDate.of(2012, 1, 1), LocalDate.of(2013, 12, 31), "Uley"),
                                new SchoolClassModel("88d408fa-71fd-4c9b-8f6a-eef3e1de3459", "Class 02", LocalDate.of(2013, 1, 1), LocalDate.of(2014, 12, 31), "Sandi"),
                                new SchoolClassModel("279b13e0-0c96-49d3-8479-f2e58d1e9659", "Class 03", LocalDate.of(2014, 1, 1), LocalDate.of(2015, 12, 31), "Wanto"),
                                new SchoolClassModel("31e14cc6-01d5-4629-b8e0-7161be2b5c9b", "Class 04", LocalDate.of(2015, 1, 1), LocalDate.of(2016, 12, 31), "Tahrir"),
                                new SchoolClassModel("5b88b8b1-b61c-4fd9-914c-07d8c2bb10de", "Class 05", LocalDate.of(2016, 1, 1), LocalDate.of(2017, 12, 31), "Dudu"),
                                new SchoolClassModel("759ab3f2-c82b-4a19-8d53-df1d74c35c1b", "Class 06", LocalDate.of(2017, 1, 1), LocalDate.of(2018, 12, 31), "Ijad")
                        )
                )
        );

        schoolHistorySabil.add(
                new SchoolHistoryModel("4a1ae4b7-920e-4b4d-a637-d70f4e8fc2b5", "SMPN 1 Surabaya", "Surabaya", "Central Java",
                        Arrays.asList(
                                new SchoolClassModel("3d94dd2e-f1f6-4e4e-b45e-15a3f5e4b3cf", "Class 07", LocalDate.of(2018, 1, 1), LocalDate.of(2019, 12, 31), "Sugiono"),
                                new SchoolClassModel("7a38c728-01e2-4d9a-a39b-6f90a703f11c", "Class 08", LocalDate.of(2019, 1, 1), LocalDate.of(2020, 12, 31), "Bayu"),
                                new SchoolClassModel("88d408fa-71fd-4c9b-8f6a-eef3e1de3459", "Class 09", LocalDate.of(2020, 1, 1), LocalDate.of(2021, 12, 31), "Jaki")
                        )
                )
        );

        schoolHistorySabil.add(
                new SchoolHistoryModel("279b13e0-0c96-49d3-8479-f2e58d1e9659", "SMAN 1 Surabaya", "Surabaya", "Central Java",
                        Arrays.asList(
                                new SchoolClassModel("31e14cc6-01d5-4629-b8e0-7161be2b5c9b", "Class 10", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 12, 31), "Sugiono"),
                                new SchoolClassModel("5b88b8b1-b61c-4fd9-914c-07d8c2bb10de", "Class 11", LocalDate.of(2022, 1, 1), LocalDate.of(2023, 12, 31), "Bayu"),
                                new SchoolClassModel("759ab3f2-c82b-4a19-8d53-df1d74c35c1b", "Class 12", LocalDate.of(2023, 1, 1), LocalDate.of(2024, 12, 31), "Jaki")
                        )
                )
        );
        StudentModel sabil = new StudentModel("4a1ae4b7-920e-4b4d-a637-d70f4e8fc2b5", 1111, "Sabil", "Rayhan", "Surabaya");
        sabil.setSchoolHistory(schoolHistorySabil);

        //generate data
        this.studentList.add(sabil);
    }
    @Override
    public List<StudentModel> getStudents() {
        if (studentList.isEmpty()) {
            return new ArrayList<>();
        }
        return studentList;
    }

    @Override
    public Optional<StudentModel> getById(String id) {
        Optional<StudentModel> studentModel = studentList.stream().filter(s -> s.getId().equals(id)).findFirst();
        return studentModel;
    }

    @Override
    public StudentModel createStudent() {
        StudentModel student = new StudentModel();

        List<SchoolHistoryModel> schoolHistoryModel = new ArrayList<>();

        //sd
        ArrayList<SchoolClassModel> sdClass = new ArrayList<>();
        sdClass.add(new SchoolClassModel("Class 01", null, null, ""));
        sdClass.add(new SchoolClassModel("Class 02", null, null, ""));
        sdClass.add(new SchoolClassModel("Class 03", null, null, ""));
        sdClass.add(new SchoolClassModel("Class 04", null, null, ""));
        sdClass.add(new SchoolClassModel("Class 05", null, null, ""));
        sdClass.add(new SchoolClassModel("Class 06", null, null, ""));

        SchoolHistoryModel sdHistory = new SchoolHistoryModel("SD", "", "");
        sdHistory.setSchoolClasses(sdClass);
        schoolHistoryModel.add(sdHistory);

        //smp
        ArrayList<SchoolClassModel> smpClass = new ArrayList<>();
        smpClass.add(new SchoolClassModel("Class 07", null, null, ""));
        smpClass.add(new SchoolClassModel("Class 08", null, null, ""));
        smpClass.add(new SchoolClassModel("Class 09", null, null, ""));

        SchoolHistoryModel smpHistory = new SchoolHistoryModel("SMP", "", "");
        smpHistory.setSchoolClasses(smpClass);
        schoolHistoryModel.add(smpHistory);

        //sma
        ArrayList<SchoolClassModel> smaClass = new ArrayList<>();
        smaClass.add(new SchoolClassModel("Class 10", null, null, ""));
        smaClass.add(new SchoolClassModel("Class 11", null, null, ""));
        smaClass.add(new SchoolClassModel("Class 12", null, null, ""));

        SchoolHistoryModel smaHistory = new SchoolHistoryModel("SMA", "", "");
        smaHistory.setSchoolClasses(smaClass);
        schoolHistoryModel.add(smaHistory);

        //add to student
        student.setSchoolHistory(schoolHistoryModel);
        return student;
    }

    @Override
    public Optional<StudentModel> save(StudentModel student) {
        if (this.studentList.isEmpty()) {
            return Optional.empty();
        }
        this.studentList.add(student);
        return Optional.of(student);
    }

    @Override
    public Optional<StudentModel> update(StudentModel student, String id) {
        for (int i = 0; i < this.studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                this.studentList.set(i, student);
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<StudentModel> delete(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                StudentModel studentModel = studentList.remove(i);
                return Optional.of(studentModel);
            }
        }
        return Optional.empty();
    }
}
