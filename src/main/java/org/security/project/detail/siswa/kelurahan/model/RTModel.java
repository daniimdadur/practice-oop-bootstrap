package org.security.project.detail.siswa.kelurahan.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class RTModel {
    private String id;
    private String name;
    private String rtLeader;
    private KelurahanModel kelurahan;
    private DusunModel dusun;
    private RWModel rw;
    private List<PeopleModel> peopleModel = new ArrayList<>();

    public RTModel(String id, String name, String rtLeader) {
        this.id = id;
        this.name = name;
        this.rtLeader = rtLeader;
    }

    public RTModel(String id, String name, String rtLeader, List<PeopleModel> peopleModel) {
        this.id = id;
        this.name = name;
        this.rtLeader = rtLeader;
        this.peopleModel = peopleModel;
    }

    public RTModel(String id, String name, String rtLeader, KelurahanModel kelurahan, DusunModel dusun, RWModel rw) {
        this.id = id;
        this.name = name;
        this.rtLeader = rtLeader;
        this.kelurahan = kelurahan;
        this.dusun = dusun;
        this.rw = rw;
    }

    public RTModel(String name, String rtLeader) {
        this.name = name;
        this.rtLeader = rtLeader;
    }

    public RTModel(String name, String rtLeader, List<PeopleModel> peopleModel) {
        this.name = name;
        this.rtLeader = rtLeader;
        this.peopleModel = peopleModel;
    }

    public RTModel() {
        this.id = UUID.randomUUID().toString();
    }
}
