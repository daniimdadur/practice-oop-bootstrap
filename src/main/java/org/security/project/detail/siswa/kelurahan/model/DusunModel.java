package org.security.project.detail.siswa.kelurahan.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DusunModel {
    private Integer id;
    private String name;
    private String dusunLeader;
    @JsonBackReference
    private KelurahanModel kelurahan;
    private List<RWModel> rwModels = new ArrayList<>();

    public DusunModel(Integer id, String name, String dusunLeader, List<RWModel> rwModels) {
        this.id = id;
        this.name = name;
        this.dusunLeader = dusunLeader;
        this.rwModels = rwModels;
    }
}
