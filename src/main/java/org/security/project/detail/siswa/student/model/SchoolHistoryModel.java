package org.security.project.detail.siswa.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class SchoolHistoryModel {
    private String id;
    private String schoolName;
    private String schoolAddress;
    private String schoolCity;
    private List<SchoolClassModel> schoolClasses = new ArrayList<>();

    public SchoolHistoryModel(String id, String schoolName, String schoolAddress, String schoolCity) {
        this.id = id;
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolCity = schoolCity;
    }

    public SchoolHistoryModel(String schoolName, String schoolAddress, String schoolCity) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolCity = schoolCity;
    }

    public SchoolHistoryModel() {
        this.id = UUID.randomUUID().toString();
    }
}
