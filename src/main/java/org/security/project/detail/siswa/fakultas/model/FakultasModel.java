package org.security.project.detail.siswa.fakultas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
public class FakultasModel {
    private String id;
    private String code;
    private String name;
    private List<JurusanModel> jurusanModels = new ArrayList<>();

    public int getJurusanCount() {
        return jurusanModels.size();
    }

    public FakultasModel(String id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public FakultasModel(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public FakultasModel() {
        this.id = UUID.randomUUID().toString();
    }
}
