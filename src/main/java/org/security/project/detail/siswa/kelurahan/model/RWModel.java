package org.security.project.detail.siswa.kelurahan.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
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

    public RWModel(String name, String rwLeader, List<RTModel> rtModels) {
        this.name = name;
        this.rwLeader = rwLeader;
        this.rtModels = rtModels;
    }

    public RWModel() {
        this.id = UUID.randomUUID().toString();
    }
}
