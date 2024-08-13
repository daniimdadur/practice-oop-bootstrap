package org.security.project.detail.siswa.kelurahan.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DusunModel {
    private String id;
    private String name;
    private String dusunLeader;
    private KelurahanModel kelurahan;
    private List<RWModel> rwModels = new ArrayList<>();

    public DusunModel(String id, String name, String dusunLeader) {
        this.id = id;
        this.name = name;
        this.dusunLeader = dusunLeader;
    }

    public DusunModel(String id, String name, String dusunLeader, List<RWModel> rwModels) {
        this.id = id;
        this.name = name;
        this.dusunLeader = dusunLeader;
        this.rwModels = rwModels;
    }

    public DusunModel(String id, String name, String dusunLeader, KelurahanModel kelurahan) {
        this.id = id;
        this.name = name;
        this.dusunLeader = dusunLeader;
        this.kelurahan = kelurahan;
    }

    public DusunModel(String name, String dusunLeader, List<RWModel> rwModels) {
        this.name = name;
        this.dusunLeader = dusunLeader;
        this.rwModels = rwModels;
    }
}
