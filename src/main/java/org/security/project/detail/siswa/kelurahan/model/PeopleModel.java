package org.security.project.detail.siswa.kelurahan.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class PeopleModel {
    private String id;
    private Integer nik;
    private String nama;
    private String gender;
    private String age;

    public PeopleModel(Integer nik, String nama, String gender, String age) {
        this.nik = nik;
        this.nama = nama;
        this.gender = gender;
        this.age = age;
    }

    public PeopleModel() {
        this.id = UUID.randomUUID().toString();
    }
}
