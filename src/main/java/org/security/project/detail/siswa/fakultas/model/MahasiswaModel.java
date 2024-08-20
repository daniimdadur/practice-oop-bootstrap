package org.security.project.detail.siswa.fakultas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MahasiswaModel {
    private String id;
    private String nim;
    private String name;
    private List<MataKuliahModel> mataKuliah = new ArrayList<>();

    public MahasiswaModel(String id, String nim, String name) {
        this.id = id;
        this.nim = nim;
        this.name = name;
    }

    public MahasiswaModel(String nim, String name) {
        this.nim = nim;
        this.name = name;
    }
}
