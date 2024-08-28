package org.security.project.detail.siswa.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
public class SchoolClassModel {
    private String id;
    private String schoolClass;
    private LocalDate startDate;
    private LocalDate endDate;
    private String teacherName;

    public SchoolClassModel(String schoolClass, LocalDate startDate, LocalDate endDate, String teacherName) {
        this.schoolClass = schoolClass;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teacherName = teacherName;
    }

    public SchoolClassModel() {
        this.id = UUID.randomUUID().toString();
    }
}
