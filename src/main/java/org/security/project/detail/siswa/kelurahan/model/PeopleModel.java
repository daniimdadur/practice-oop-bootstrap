package org.security.project.detail.siswa.kelurahan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PeopleModel {
    private Integer id;
    private Integer nik;
    private String nama;
    private String gender;
    private String age;
}
