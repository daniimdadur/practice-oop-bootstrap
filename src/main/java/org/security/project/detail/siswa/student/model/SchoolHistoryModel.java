package org.security.project.detail.siswa.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolHistoryModel {
    private Integer id;
    private String schoolName;
    private String schoolAddress;
    private String schoolCity;
    private List<SchoolClassModel> schoolClasses = new ArrayList<>();

    public SchoolHistoryModel(Integer id, String schoolName, String schoolAddress, String schoolCity) {
        this.id = id;
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolCity = schoolCity;
    }
}
