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
public class JurusanModel {
    private String id;
    private String code;
    private String name;
    private List<StudentCountModel> studentCountModels = new ArrayList<>();

    public JurusanModel(String id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public JurusanModel(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public JurusanModel() {
        this.id = UUID.randomUUID().toString();
    }
}
