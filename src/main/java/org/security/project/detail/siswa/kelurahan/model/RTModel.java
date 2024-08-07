package org.security.project.detail.siswa.kelurahan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RTModel {
    private Integer id;
    private String name;
    private String rtLeader;
    private List<PeopleModel> peopleModel = new ArrayList<>();

    public RTModel(Integer id, String name, String rtLeader) {
        this.id = id;
        this.name = name;
        this.rtLeader = rtLeader;
    }
}
