package org.security.project.detail.siswa.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class StudentModel {
    private String id;
    private Integer nis;
    private String firstName;
    private String lastName;
    private String address;
    private List<SchoolHistoryModel> schoolHistory = new ArrayList<>();

    public StudentModel(String id, Integer nis, String firstName, String lastName, String address) {
        this.id = id;
        this.nis = nis;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public StudentModel(Integer nis, String firstName, String lastName, String address) {
        this.nis = nis;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public StudentModel() {
        this.id = UUID.randomUUID().toString();
    }
}
