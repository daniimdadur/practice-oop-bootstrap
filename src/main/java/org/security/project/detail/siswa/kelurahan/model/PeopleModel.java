package org.security.project.detail.siswa.kelurahan.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PeopleModel {
    private String id;
    private Integer nik;
    private String nama;
    private String gender;
    private String age;
    private KelurahanModel kelurahan;
    private DusunModel dusun;
    private RWModel rw;
    private RTModel rt;

    public PeopleModel(String id, Integer nik, String nama, String gender, String age) {
        this.id = id;
        this.nik = nik;
        this.nama = nama;
        this.gender = gender;
        this.age = age;
    }


    public PeopleModel(Integer nik, String nama, String gender, String age) {
        this.nik = nik;
        this.nama = nama;
        this.gender = gender;
        this.age = age;
    }
}
