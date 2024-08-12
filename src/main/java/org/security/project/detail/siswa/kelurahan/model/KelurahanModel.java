package org.security.project.detail.siswa.kelurahan.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
}
