package org.security.project.detail.siswa.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {
    private Integer id;
    private Integer nis;
    private String firstName;
    private String lastName;
    private String address;
    private List<SchoolHistoryModel> schoolHistory = new ArrayList<>();

    public StudentModel(Integer id, Integer nis, String firstName, String lastName, String address) {
        this.id = id;
        this.nis = nis;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}
