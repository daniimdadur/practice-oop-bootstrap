package org.security.project.detail.siswa.kelurahan.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class KelurahanModel {
    private String id;
    private String name;
    private String kec;
    private List<DusunModel> dusunModels = new ArrayList<>();

    public KelurahanModel(String id, String name, String kec) {
        this.id = id;
        this.name = name;
        this.kec = kec;
    }

    public KelurahanModel(String name, String kec, List<DusunModel> dusunModels) {
        this.name = name;
        this.kec = kec;
        this.dusunModels = dusunModels;
    }

    public KelurahanModel(String name, String kec) {
        this.name = name;
        this.kec = kec;
        this.dusunModels = new ArrayList<>();
    }

    public KelurahanModel() {
        this.id = UUID.randomUUID().toString();
    }
}
