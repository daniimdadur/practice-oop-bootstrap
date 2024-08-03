package org.security.project.detail.siswa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolClassModel {
    private Integer id;
    private String schoolClass;
    private LocalDate startDate;
    private LocalDate endDate;
    private String teacherName;
}
