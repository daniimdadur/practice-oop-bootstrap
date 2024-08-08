package org.security.project.detail.siswa.kelurahan.model;

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
    private List<RWModel> rwModels = new ArrayList<>();

    public DusunModel(Integer id, String name, String dusunLeader) {
        this.id = id;
        this.name = name;
        this.dusunLeader = dusunLeader;
    }
}
