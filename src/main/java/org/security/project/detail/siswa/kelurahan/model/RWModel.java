package org.security.project.detail.siswa.kelurahan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RWModel {
    private String id;
    private String name;
    private String rwLeader;
    private KelurahanModel kelurahan;
    private DusunModel dusun;
    private List<RTModel> rtModels = new ArrayList<>();

    public RWModel(String id, String name, String rwLeader) {
        this.id = id;
        this.name = name;
        this.rwLeader = rwLeader;
    }

    public RWModel(String id, String name, String rwLeader, List<RTModel> rtModels) {
        this.id = id;
        this.name = name;
        this.rwLeader = rwLeader;
        this.rtModels = rtModels;
    }

    public RWModel(String id, String name, String rwLeader, KelurahanModel kelurahan, DusunModel dusun) {
        this.id = id;
        this.name = name;
        this.rwLeader = rwLeader;
        this.kelurahan = kelurahan;
        this.dusun = dusun;
    }
}
