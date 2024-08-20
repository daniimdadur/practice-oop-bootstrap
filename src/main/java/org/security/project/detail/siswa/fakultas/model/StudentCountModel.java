package org.security.project.detail.siswa.fakultas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentCountModel {
    private String id;
    private Integer years;
    private List<MahasiswaModel> mahasiswa = new ArrayList<>();

    public int getMahasiswaCount() {
        return mahasiswa.size();
    }

    public StudentCountModel(Integer years) {
        this.years = years;
    }

    public StudentCountModel(String id, Integer years) {
        this.id = id;
        this.years = years;
    }
}
